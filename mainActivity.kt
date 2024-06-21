package com.example.applifecycleimplementation

import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("OnCreate invoked") // invoked when application is initialized at first call
    }

    override fun onStart() {
        super.onStart()
        println("onStart invoked") // invoked when application starts getting visible to the user
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart invoked") // invoked when application is called after user reduces it's execution priority
    }

    override fun onPause() {
        super.onPause()
        println("onPause invoked") // invoked when application execution is paused
    }

    override fun onStop() {
        super.onStop()
        println("onStop invoked") // invoked when application stops after execution
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy invoked") // invoked when application is destroyed from O.S RAM
    }
}


