package com.example.rnintegration

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.Settings
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGoRNScreen = findViewById<Button>(R.id.button)
        val buttonFragment = findViewById<Button>(R.id.button2)
        val text = findViewById<EditText>(R.id.editext)
        btnGoRNScreen.setOnClickListener {
            val intent = Intent(this@MainActivity, MyReactActivity::class.java)
            val initialProperties = Bundle().apply {
                putString("images", text.text.toString())

            }
            intent.putExtra("images",initialProperties)
            startActivity(intent)
        }
        buttonFragment.setOnClickListener {
            Toast.makeText(applicationContext, "butonnnn", Toast.LENGTH_SHORT).show()

            val reactNativeFragment = com.facebook.react.ReactFragment.Builder()
                .setComponentName("MyReactNativeApp")
                .setLaunchOptions(getLaunchOptions("test message"))
                .build()

            val initialProperties = Bundle().apply {
                putString("images", text.text.toString())

            }
            println(initialProperties.toString())
            val frag = ReactFragment()
            frag.arguments = initialProperties
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frag_host, frag)
                .commit()
        }


    }

    private fun getLaunchOptions(message: String) = Bundle().apply {
        putString("message", message)

    }
}


