package com.example.matrimony.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import com.example.matrimony.R
import com.example.matrimony.databinding.HomeScreenBinding

class MatrimonyActivity : AppCompatActivity(), LifecycleObserver {

    private var homeScreenBinding: HomeScreenBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        homeScreenBinding = HomeScreenBinding.inflate(layoutInflater)
        setContentView(homeScreenBinding?.root)
        replaceFragment(savedInstanceState)
    }

    private fun replaceFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frContainerView, DashBoardFragment()).commit()
        }
    }
}