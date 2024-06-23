package com.example.matrimony.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "ProfileImage",
    foreignKeys = [ForeignKey(
        entity = MatrimonyData::class,
        parentColumns = ["id"],
        childColumns = ["profileOwnerId"],
        onDelete = ForeignKey.CASCADE
    )])

data class ProfileImageModel(
    val profileName: Int,
    val profileOwnerId: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
) {
}
