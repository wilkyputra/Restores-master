package com.example.restores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this

        btnLogin.setOnClickListener {
            val intent = Intent(context, BerandaActivity::class.java)
            startActivity(intent)
        }

        btnDaftar.setOnClickListener {
            val intent = Intent(context, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
