package com.example.restores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_booking.*

class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val context = this

        kembali.setOnClickListener{
            val intent = Intent(context,BerandaActivity::class.java)
            startActivity(intent)
        }
    }
}
