package com.example.matrimony.utilis

import com.example.matrimony.R
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.model.ProfileImageModel
import com.example.matrimony.model.ProfileWithImages

object MatrimonyDetails {

    fun getProfileWithImages(): List<ProfileWithImages> {
        val matrimonyData1 = MatrimonyData(
            "Meena",
            "M",
            28,
            5.8f,
            "TamilNadu",
            "IT",
            "Vriddchalam", true,
            "Hindu",
            R.drawable.mamitha1
        )
        val matrimonyData2 = MatrimonyData(
            "Lakshmi",
            "Kothari",
            25,
            5.9f,
            "TamilNadu",
            "CA-Auditor",
            "Cuddalore", true,
            "Hindu",
            R.drawable.barathi3
        )
        val matrimonyData3 = MatrimonyData(
            "Vinathi",
            "Balaji",
            26,
            5.0f,
            "Andhra Pradesh",
            "Engineer-TNEB",
            "Chennai ", true,
            "Hindu",
            R.drawable.sri_divya2
        )
        val matrimonyData4 = MatrimonyData(
            "Sreesha",
            "Premam",
            26,
            5.2f,
            "Karnataka",
            "Engineer-IT",
            "Chennai", true,
            "Christian",
            R.drawable.mamitha3
        )
        val matrimonyData5 = MatrimonyData(
            "Monika",
            "Kumari",
            26,
            5.2f,
            "Karnataka",
            "Engineer-IT",
            "Chennai", true,
            "Christian",
            R.drawable.sri_divya2
        )


        val profileImage11 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamitha1
        )
        val profileImage12 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamithaa2
        )
        val profileImage13 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamitha3
        )

        val profileUser21 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.barathi1
        )
        val profileUser22 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.barathi2
        )
        val profileUser23 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.barathi3
        )


        val profileUser31 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamithaa2
        )
        val profileUser32 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamitha3
        )
        val profileUser33 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamitha1
        )


        val profileUser41 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.sri_divya3
        )
        val profileUser42 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.sri_divya2
        )
        val profileUser43 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.sri_divya3
        )

        val profileUser51 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamitha1
        )
        val profileUser52 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamitha3
        )
        val profileUser53 = ProfileImageModel(
            profileOwnerId = 1,
            profileName = R.drawable.mamithaa2
        )

        val profileWithImages1 = ProfileWithImages(
            matrimonyData1,
            listOf(profileImage11, profileImage12, profileImage13)
        )
        val profileWithImages2 = ProfileWithImages(
            matrimonyData2,
            listOf(profileUser21, profileUser22, profileUser23)
        )
        val profileWithImages3 = ProfileWithImages(
            matrimonyData3,
            listOf(profileUser31, profileUser32, profileUser33)
        )
        val profileWithImages4 = ProfileWithImages(
            matrimonyData4,
            listOf(profileUser41, profileUser42, profileUser43)
        )
        val profileWithImages5 = ProfileWithImages(
            matrimonyData5,
            listOf(profileUser53, profileUser52, profileUser53)
        )

        val matrimonyDetails = listOf(
            profileWithImages1,profileWithImages2,
            profileWithImages3,profileWithImages4,
            profileWithImages5
        )

        return matrimonyDetails
    }

}