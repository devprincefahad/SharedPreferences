package com.example.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val btn = findViewById<Button>(R.id.btnLogin)

        btn.setOnClickListener {

            val prefs = getSharedPreferences("login", MODE_PRIVATE)
            val editor = prefs.edit()

            editor.putBoolean("flag", true)
            editor.apply()
            // val value: Boolean = editor.commit()
            // Toast.makeText(this, value.toString(), Toast.LENGTH_LONG).show()

            startActivity(Intent(this, HomeActivity::class.java))


        }

    }
}