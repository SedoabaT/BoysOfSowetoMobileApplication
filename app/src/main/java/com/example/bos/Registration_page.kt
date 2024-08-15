package com.example.bos

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration_page : AppCompatActivity() {

    lateinit var registrationButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_page)

        registrationButton = findViewById(R.id.registrationBtn)

        registrationButton.setOnClickListener{

            val intent = Intent (this@Registration_page, MainActivity::class.java)
            startActivity(intent)

        }
    }
}