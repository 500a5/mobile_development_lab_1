package com.example.mobile_development_lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.e("app", "detailActivity, onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("app", "detailActivity, onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("app", "detailActivity, onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("app", "detailActivity, onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("app", "detailActivity, onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("app", "detailActivity, onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("app", "detailActivity, onDestroy")
    }
}