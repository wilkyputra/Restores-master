package com.example.restores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda.*

class BerandaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val context = this

        booking1.setOnClickListener{
            val intent = Intent(context,BookingActivity::class.java)
            startActivity(intent)
        }


        resto4.setOnClickListener{
            val intent = Intent(context,ViewActivity::class.java)
            startActivity(intent)
        }
    }
}
