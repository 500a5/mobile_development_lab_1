package com.example.mobile_development_lab_1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val randomIntent = Intent(this,DetailActivity::class.java)
            startActivity(randomIntent)
        }
        button2.setOnClickListener {
            val address: Uri = Uri.parse("https://yandex.ru/")
            val openLinkIntent = Intent(Intent.ACTION_VIEW, address)
            startActivity(openLinkIntent);
        }
        Log.e("app", "mainActivity, onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("app", "mainActivity, onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("app", "mainActivity, onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("app", "mainActivity, onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("app", "mainActivity, onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("app", "mainActivity, onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("app", "mainActivity, onDestroy")
    }
}