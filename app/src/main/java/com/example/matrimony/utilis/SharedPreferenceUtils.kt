package com.example.matrimony.utilis

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.example.matrimony.utilis.APP_Constant.PREFERENCE_NAME

object SharedPreferenceUtils {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: Editor

    fun initSharedPreference(context: Context){
        sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
    }
    fun getBoolean(key:String,defaultValue:Boolean):Boolean{
        return  sharedPreferences.getBoolean(key,defaultValue)
    }

    fun putBoolean(key: String,defaultValue: Boolean){
        editor.putBoolean(key, defaultValue)
        editor.apply()
    }
}