package com.example.matrimony.utilis

import android.content.Context
import android.widget.Toast
import com.example.matrimony.R

object ToastUtils {

    fun toastShort(context: Context,message:String,){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun toastLong(context: Context,message:String,){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}