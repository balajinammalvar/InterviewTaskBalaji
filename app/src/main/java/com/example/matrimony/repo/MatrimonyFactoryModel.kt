package com.example.matrimony.repo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.matrimony.viewmodel.MatrimonyViewModel

class MatrimonyFactoryModel: ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when(modelClass) {
            MatrimonyViewModel::class.java -> {
                MatrimonyViewModel(MatrimonyRepo()) as T
            } else ->
                throw Throwable("Unsupported viewmodel")
        }
    }
}