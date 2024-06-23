package com.example.matrimony.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.model.ProfileWithImages
import com.example.matrimony.repo.MatrimonyRepo
import com.example.matrimony.utilis.Resource
import kotlinx.coroutines.launch

class MatrimonyViewModel(
    private val matrimonyRepo: MatrimonyRepo
) : ViewModel() {
    private var matrimonyDetails: MutableLiveData<Resource<List<MatrimonyData>>> = MutableLiveData()
    private var profileWithImages: MutableLiveData<Resource<ProfileWithImages>> = MutableLiveData()

    fun insertProfileWithImages(context: Context, profileWithImages: List<ProfileWithImages>) {
        viewModelScope.launch {
            matrimonyRepo.insertProfileWithImages(context, profileWithImages)
        }
    }
    fun getMatrimonyDetails(context: Context) {
        try {
            viewModelScope.launch {
                matrimonyDetails.postValue(Resource.loading(null))
                matrimonyRepo.getMatrimonyDetails(context).let {
                    matrimonyDetails.postValue(Resource.success(it))
                }
            }
        } catch (e: Exception) {
            matrimonyDetails.postValue(e.message?.let { Resource.error(it,null) })
        }
    }
    fun getProfileWithImages(context: Context, profileId: Int) {
        viewModelScope.launch {
            profileWithImages.postValue(Resource.loading(null))
            matrimonyRepo.getProfileWithImages(context, profileId).let {
                profileWithImages.postValue(Resource.success(it))
            }

        }
    }

    fun getDetails() = matrimonyDetails

    fun getProfileWithImages() = profileWithImages
}