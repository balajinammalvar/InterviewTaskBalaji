package com.example.matrimony.utilis

interface CommonListener {
    interface ProfileInterestInterface{
        fun onProfileMark(interested: Boolean, position: Int)
        fun onProfileClick(position: Int)
    }
}