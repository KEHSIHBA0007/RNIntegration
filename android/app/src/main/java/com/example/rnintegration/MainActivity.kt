package com.example.rnintegration

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGoRNScreen = findViewById<Button>(R.id.button)

        btnGoRNScreen.setOnClickListener {
            val intent = Intent(this@MainActivity, MyReactActivity::class.java)
            intent.putExtra("data", "data from native....")
            startActivity(intent)
        }
    }
}