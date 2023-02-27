package com.example.mobileapps1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    private val _tag = "main activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onPause() {
        super.onPause()
        Log.i(_tag, "Hi There")
        }

    override fun onResume() {
        super.onResume()
        Log.e(_tag, "this activity has been resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(_tag, "this activity has been destroyed")
    }

}