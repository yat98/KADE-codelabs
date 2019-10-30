package com.hidayat.kotlinfirst

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNumber = findViewById(R.id.btn_number) as Button
        val tvJudul = findViewById(R.id.tv_judul) as TextView
        val button = findViewById(R.id.btn_ubah) as Button

        button.setOnClickListener(View.OnClickListener {
            val judul = tvJudul.text
            when (judul) {
                "Hello World!" -> tvJudul.setText("Hello Hidayat")
                "Hello Hidayat" -> tvJudul.setText("Hello World!")
            }
        })

        buttonNumber.setOnClickListener(View.OnClickListener {
            val numberIntent = Intent(this, NumberActivity::class.java)
            startActivity(numberIntent)
        })
    }
}
