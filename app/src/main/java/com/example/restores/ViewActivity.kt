package com.example.restores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_booking.*
import kotlinx.android.synthetic.main.activity_main.*

class ViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val context = this

        booking.setOnClickListener {
            val intent = Intent(context, BookingActivity::class.java)
            startActivity(intent)
        }
    }
}
