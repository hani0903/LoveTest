package com.metacoding.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.security.AccessController

class MainActivity : AppCompatActivity() {

    lateinit var navController: AccessController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = nav_host_fragment.findController()
    }

}