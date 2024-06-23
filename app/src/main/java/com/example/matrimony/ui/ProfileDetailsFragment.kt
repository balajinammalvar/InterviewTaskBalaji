package com.example.matrimony.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.matrimony.R
import com.example.matrimony.adapter.ViewPagerAdapter
import com.example.matrimony.databinding.ProfileDetailsBinding
import com.example.matrimony.repo.MatrimonyFactoryModel
import com.example.matrimony.utilis.APP_Constant.PROFILE_ID
import com.example.matrimony.utilis.Status
import com.example.matrimony.utilis.ToastUtils
import com.example.matrimony.viewmodel.MatrimonyViewModel

class ProfileDetailsFragment : Fragment() {

    private lateinit var context: Context
    private val matrimonyViewModel: MatrimonyViewModel by activityViewModels {
        MatrimonyFactoryModel()
    }
    private var profileDetailsBinding: ProfileDetailsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileDetailsBinding =
            DataBindingUtil.inflate(inflater, R.layout.profile_details, container, false)
        context = requireActivity()
        val profileID = this.arguments?.getInt(PROFILE_ID)
        initializeObserver()
        profileID?.let {
            matrimonyViewModel.getProfileWithImages(context, it)
        }
        initializePagerAdapter()
        return profileDetailsBinding?.root
    }

    private fun initializePagerAdapter() {
        val viewPagerAdapter = ViewPagerAdapter(context)
        profileDetailsBinding?.tbLayout?.setupWithViewPager(profileDetailsBinding?.vpProfileDetails)
        profileDetailsBinding?.ivBack?.setOnClickListener { parentFragmentManager.popBackStack() }
        profileDetailsBinding?.vpProfileDetails?.adapter = viewPagerAdapter
    }

    private fun initializeObserver() {
        matrimonyViewModel.getProfileWithImages().observe(viewLifecycleOwner) {
            when(it.status){
                Status.LOADING->{}
                Status.SUCCESS->{
                    profileDetailsBinding?.profileDetailsViewModel = it.data
                    val adapter = profileDetailsBinding?.vpProfileDetails?.adapter as ViewPagerAdapter
                    it.data?.images?.let { image -> adapter.setImages(image) }
                }
                Status.ERROR->{
                    ToastUtils.toastShort(
                        context,
                        "getProfileWithImages ERROR : ${it?.message}",
                    )
                }
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        profileDetailsBinding = null
    }
}