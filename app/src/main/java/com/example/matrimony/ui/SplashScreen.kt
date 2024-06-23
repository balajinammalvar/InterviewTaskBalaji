package com.example.matrimony.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.matrimony.R
import com.example.matrimony.databinding.ActivitySplashScreenBinding
import com.example.matrimony.repo.MatrimonyFactoryModel
import com.example.matrimony.utilis.APP_Constant.MATRIMONY_DATA
import com.example.matrimony.utilis.MatrimonyDetails
import com.example.matrimony.utilis.SharedPreferenceUtils
import com.example.matrimony.utilis.SharedPreferenceUtils.initSharedPreference
import com.example.matrimony.utilis.ToastUtils
import com.example.matrimony.viewmodel.MatrimonyViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {

    private val activityScope = CoroutineScope(Dispatchers.Main)
    private var splashScreenBinding: ActivitySplashScreenBinding? = null
    private lateinit var context: Context
    private val matrimonyViewModel: MatrimonyViewModel by viewModels {
        MatrimonyFactoryModel()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashScreenBinding!!.root)
        context = this@SplashScreen
        initSharedPreference(context)
        init()
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN)

        /*Navigate to User Details after 3000 Milliseconds*/
        navigateMatrimonyActivity()
    }

    private fun navigateMatrimonyActivity() {
        activityScope.launch {
            delay(3000)
            val intent = Intent(applicationContext, MatrimonyActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


    private fun init() {
        try {
            SharedPreferenceUtils.getBoolean(MATRIMONY_DATA, false).let { it ->
                when (it) {
                    true -> ToastUtils.toastShort(context, getString(R.string.data_added))
                    false -> context.let {
                        matrimonyViewModel.insertProfileWithImages(
                            it, MatrimonyDetails.getProfileWithImages()
                        )
                    }
                }
            }
            SharedPreferenceUtils.putBoolean(MATRIMONY_DATA, true)
        } catch (e: Exception) {
            Toast.makeText(context, "init :${e.message}", Toast.LENGTH_LONG).show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }
}