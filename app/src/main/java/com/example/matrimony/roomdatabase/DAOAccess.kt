package com.example.matrimony.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.model.ProfileImageModel
import com.example.matrimony.model.ProfileWithImages

@Dao
interface DAOAccess {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatrimonyDetails(matrimonyData:  List<MatrimonyData>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatrimonyDetails(matrimonyData:  MatrimonyData): Long

    @Query("SELECT * FROM MatrimonyDetails")
    suspend fun getMatrimonyDetails() : List<MatrimonyData>?

    @Query("SELECT * FROM MatrimonyDetails where Id=:profileId")
    suspend fun getProfileDetail(profileId:Int) : MatrimonyData?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProfileImages(profileImageData:  ProfileImageModel): Long

    @Transaction
    @Query("SELECT * FROM MatrimonyDetails WHERE id = :profileId")
    suspend fun getProfileWithImages(profileId: Int): ProfileWithImages

}