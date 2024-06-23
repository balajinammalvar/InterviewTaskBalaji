package com.example.matrimony.model

import androidx.room.Embedded
import androidx.room.Relation

data class ProfileWithImages(
    @Embedded val profile: MatrimonyData,
    @Relation(
        parentColumn = "id",
        entityColumn = "profileOwnerId"
    )
    val images: List<ProfileImageModel>
)
