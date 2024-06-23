package com.example.matrimony.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.matrimony.R
import com.example.matrimony.adapter.DashBoardAdapter
import com.example.matrimony.adapter.GestureRecyclerViewAdapter
import com.example.matrimony.databinding.GestureFragmentBinding
import com.example.matrimony.repo.MatrimonyFactoryModel
import com.example.matrimony.utilis.CommonListener
import com.example.matrimony.utilis.APP_Constant.PROFILE_ID
import com.example.matrimony.utilis.Status
import com.example.matrimony.utilis.ToastUtils
import com.example.matrimony.viewmodel.MatrimonyViewModel


class GestureFragment : Fragment(), LifecycleObserver, CommonListener.ProfileInterestInterface {

    private lateinit var context: Context
    private var gestureFragmentBinding: GestureFragmentBinding? = null
    private val matrimonyViewModel: MatrimonyViewModel by activityViewModels {
        MatrimonyFactoryModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        gestureFragmentBinding = GestureFragmentBinding.inflate(layoutInflater, container, false)
        context = requireActivity()
        setupRecyclerView()
        initializeObserver()
        matrimonyViewModel.getMatrimonyDetails(context)
        itemTouchHelper()
        initializeListener()
        return gestureFragmentBinding?.root
    }

    private fun initializeListener() {
        gestureFragmentBinding?.ivBack?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    private fun itemTouchHelper() {
        val mIth = ItemTouchHelper(
            object : ItemTouchHelper.SimpleCallback(
                ItemTouchHelper.UP or ItemTouchHelper.DOWN,
                ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
            ) {
                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: ViewHolder, target: ViewHolder
                ): Boolean {
                    // move item in `fromPos` to `toPos` in adapter.
                    return true // true if moved, false otherwise
                }

                override fun onSwiped(viewHolder: ViewHolder, direction: Int) {
                    when (direction) {
                        ItemTouchHelper.LEFT -> {

                        }

                        ItemTouchHelper.RIGHT -> {

                        }
                    }
                    // remove from adapter
                }
            })
        mIth.attachToRecyclerView(gestureFragmentBinding?.rvGestureScreen)
    }


    private fun initializeObserver() {
        matrimonyViewModel.getDetails().observe(viewLifecycleOwner) {
            when(it.status){
                Status.LOADING->{}
                Status.SUCCESS->{
                    val adapter = gestureFragmentBinding?.rvGestureScreen?.adapter as GestureRecyclerViewAdapter
                    it.data?.let { data -> adapter.setData(data) }
                }
                Status.ERROR->{
                    ToastUtils.toastShort(
                        context,
                        "getDetails ERROR : ${it?.message}",
                    )
                }
            }
        }
    }

    private fun setupRecyclerView() {
        try {
            val gestureRecyclerViewAdapter = GestureRecyclerViewAdapter(this)
            gestureFragmentBinding?.rvGestureScreen?.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            gestureFragmentBinding?.rvGestureScreen?.adapter = gestureRecyclerViewAdapter
        } catch (e: Exception) {
            Toast.makeText(context, "setupRecyclerView Exception: ${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }


    private fun scrollToNextItem() {
        try {
            val layoutManager =
                gestureFragmentBinding?.rvGestureScreen?.layoutManager as LinearLayoutManager
            val currentPosition = layoutManager.findLastVisibleItemPosition()
            gestureFragmentBinding?.rvGestureScreen?.smoothScrollToPosition(currentPosition + 1)
        } catch (e: Exception) {
            Toast.makeText(context, "scrollToNextItem Exception: ${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun onProfileMark(interested: Boolean, position: Int) {
        try {
            if (interested) {
                scrollToNextItem()
                Toast.makeText(context, context.getString(R.string.interested), Toast.LENGTH_LONG)
                    .show()
            } else {
                val adapter =
                    gestureFragmentBinding?.rvGestureScreen?.adapter as GestureRecyclerViewAdapter
                adapter.notifyItemRemoved(position)
                Toast.makeText(
                    context,
                    context.getString(R.string.not_interested),
                    Toast.LENGTH_LONG
                ).show()
            }
        } catch (e: Exception) {
            Toast.makeText(context, "onProfileMark Exception: ${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun onProfileClick(profileId: Int) {
        try {
            val profileBundle = Bundle()
            profileBundle.putInt(PROFILE_ID, profileId)
            val profileDetailsFragment = ProfileDetailsFragment()
            profileDetailsFragment.arguments = profileBundle
            parentFragmentManager.beginTransaction()
                .replace(R.id.frContainerView, profileDetailsFragment)
                .addToBackStack(null)
                .commit()
        } catch (e: Exception) {
            Toast.makeText(context, "onProfileClick Exception: ${e.message}", Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        gestureFragmentBinding = null
    }

}