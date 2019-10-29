package com.hidayat.kotlinfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvJudul = findViewById(R.id.tv_judul) as TextView
        var button = findViewById(R.id.btn_ubah) as Button
        button.setOnClickListener(View.OnClickListener {
            val judul = tvJudul.text
            when(judul){
                "Hello World!" -> tvJudul.setText("Hello Hidayat")
                "Hello Hidayat" -> tvJudul.setText("Hello World!")
            }

        })
    }
}
