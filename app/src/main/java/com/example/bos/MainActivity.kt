package com.example.bos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var LoginButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LoginButton = findViewById(R.id.LoginBtn)

        LoginButton.setOnClickListener{

            val intent = Intent(this@MainActivity, Registration_page::class.java)
            startActivity(intent)
        }
    }
}