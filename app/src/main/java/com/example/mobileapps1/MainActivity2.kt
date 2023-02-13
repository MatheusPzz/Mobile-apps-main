package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onPause() {
        super.onPause()
        Log.i("main activity", "Hi There")
        }

    override fun onResume() {
        super.onResume()
        Log.e("main activity", "this activity has been resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("main activity", "this activity has been destroyed")
    }

}