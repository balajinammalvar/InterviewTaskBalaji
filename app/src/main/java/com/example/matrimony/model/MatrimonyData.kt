package com.example.matrimony.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "MatrimonyDetails")
data class MatrimonyData (

    @ColumnInfo(name = "firstName")
    var firstName: String,

    @ColumnInfo(name = "lastName")
    var lastName: String,

    @ColumnInfo(name = "age")
    var age: Int,

    @ColumnInfo(name = "height")
    var height: Float,

    @ColumnInfo(name = "state")
    var state: String,

    @ColumnInfo(name = "professional")
    var professional: String,

    @ColumnInfo(name = "address")
    var address: String,

    @ColumnInfo(name = "verified")
    var verified: Boolean=false,

    @ColumnInfo(name = "caste")
    var caste: String,

    @ColumnInfo(name = "profilePic")
    val profilePic: Int,

    var gestureProfileDetails:String="$age Yrs, $height in, $professional,\n$caste, $address, $state".trim()

) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null

}