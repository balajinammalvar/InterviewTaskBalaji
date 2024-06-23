package com.example.matrimony.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.matrimony.R
import com.example.matrimony.adapter.DashBoardAdapter
import com.example.matrimony.databinding.HomeFragmentBinding
import com.example.matrimony.repo.MatrimonyFactoryModel
import com.example.matrimony.utilis.CommonListener
import com.example.matrimony.utilis.APP_Constant.PROFILE_ID
import com.example.matrimony.utilis.Status
import com.example.matrimony.utilis.ToastUtils
import com.example.matrimony.viewmodel.MatrimonyViewModel


class DashBoardFragment : Fragment(), CommonListener.ProfileInterestInterface {

    private lateinit var context: Context
    private var homeScreenFragmentBinding: HomeFragmentBinding? = null
    private val matrimonyViewModel: MatrimonyViewModel by activityViewModels {
        MatrimonyFactoryModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        homeScreenFragmentBinding = HomeFragmentBinding.inflate(layoutInflater, container, false)
        context = requireActivity()
        setupRecyclerView()
        initializeObserver()
        matrimonyViewModel.getMatrimonyDetails(context)
        initializeListener()
        itemTouchHelper()
        return homeScreenFragmentBinding?.root
    }

    private fun initializeListener() {
        homeScreenFragmentBinding?.ivMore?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frContainerView, GestureFragment()).addToBackStack(null).commit()
        }
    }

    private fun initializeObserver() {
        matrimonyViewModel.getDetails().observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> {}
                Status.SUCCESS -> {
                    val adapter =
                        homeScreenFragmentBinding?.rvHomeScreen?.adapter as DashBoardAdapter
                    it.data?.let { data -> adapter.setData(data) }
                    homeScreenFragmentBinding?.tvRecommendation?.text = context.getString(
                        R.string.number_of_recommendation, it.data?.size.toString()
                    )
                }

                Status.ERROR -> {
                    Toast.makeText(
                        context, "getMatrimonyDetails Exception : ${it?.message}", Toast.LENGTH_LONG
                    ).show()
                }
            }


        }
    }

    private fun itemTouchHelper() {
        val mIth = ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ) {
            override fun onMove(
                recyclerView: RecyclerView, viewHolder: ViewHolder, target: ViewHolder
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: ViewHolder, direction: Int) {
                Log.d("onSwiped", "onSwiped: ${viewHolder.adapterPosition}")
                when (direction) {
                    ItemTouchHelper.LEFT -> {

                    }

                    ItemTouchHelper.RIGHT -> {

                    }
                }
            }
        })

        mIth.attachToRecyclerView(homeScreenFragmentBinding?.rvHomeScreen)
    }

    private fun setupRecyclerView() {
        try {
            val dashBoardAdapter = DashBoardAdapter(this)
            homeScreenFragmentBinding?.rvHomeScreen?.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            homeScreenFragmentBinding?.rvHomeScreen?.adapter = dashBoardAdapter
        } catch (e: Exception) {
            Toast.makeText(context, "setupRecyclerView Exception :${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    private fun scrollToNextItem() {
        try {
            val layoutManager =
                homeScreenFragmentBinding?.rvHomeScreen?.layoutManager as LinearLayoutManager
            val currentPosition = layoutManager.findLastVisibleItemPosition()
            homeScreenFragmentBinding?.rvHomeScreen?.smoothScrollToPosition(currentPosition + 1)
        } catch (e: Exception) {
            Toast.makeText(context, "scrollToNextItem Exception :${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun onProfileMark(interested: Boolean, position: Int) {
        try {
            if (interested) {
                scrollToNextItem()
                ToastUtils.toastShort(context, context.getString(R.string.interested))
            } else {
                val adapter = homeScreenFragmentBinding?.rvHomeScreen?.adapter as DashBoardAdapter
                adapter.notifyItemRemoved(position)
                ToastUtils.toastShort(context, context.getString(R.string.not_interested))
            }
        } catch (e: Exception) {
            ToastUtils.toastShort(context, "onProfileMark Exception :${e.message}".toString())
        }
    }

    override fun onProfileClick(profileId: Int) {
        try {
            val profileBundle = Bundle()
            profileBundle.putInt(PROFILE_ID, profileId)
            val profileDetailsFragment = ProfileDetailsFragment()
            profileDetailsFragment.arguments = profileBundle
            parentFragmentManager.beginTransaction()
                .replace(R.id.frContainerView, profileDetailsFragment).addToBackStack(null).commit()
        } catch (e: Exception) {
            Toast.makeText(context, "onProfileClick Exception: ${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        homeScreenFragmentBinding = null
    }
}