package com.example.matrimony.repo

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.model.ProfileWithImages
import com.example.matrimony.roomdatabase.MatrimonyDatabase
import com.example.matrimony.utilis.Resource

class MatrimonyRepo {

    private var matrimonyDatabase: MatrimonyDatabase? = null

    private fun initializeDB(context: Context): MatrimonyDatabase? {
        return MatrimonyDatabase.getDatabaseClient(context)
    }

    @SuppressLint("SuspiciousIndentation")
    suspend fun insertProfileWithImages(context: Context, profileImageData: List<ProfileWithImages>) {
        matrimonyDatabase = initializeDB(context)
            profileImageData.forEach {
                val profileId = matrimonyDatabase?.matrimonyDao()?.insertMatrimonyDetails(it.profile)
                it.images.forEach { imageModel ->
                    profileId?.toInt()?.let { profId -> imageModel.copy(profileOwnerId = profId) }?.let { image -> matrimonyDatabase?.matrimonyDao()?.insertProfileImages(
                            image
                        )
                    }
                }
        }
    }

    suspend fun getMatrimonyDetails(context: Context): List<MatrimonyData>? {
        try {
            matrimonyDatabase = initializeDB(context)

            return matrimonyDatabase?.matrimonyDao()?.getMatrimonyDetails()
        } catch (e: Exception) {
            Toast.makeText(
                context,
                "getMatrimonyDetails Exception :${e.message}",
                Toast.LENGTH_LONG
            ).show()
        }
        return null
    }

    suspend fun getProfileWithImages(context: Context, profileId: Int): ProfileWithImages? {

        matrimonyDatabase = initializeDB(context)
        return matrimonyDatabase?.matrimonyDao()?.getProfileWithImages(profileId)
    }
}