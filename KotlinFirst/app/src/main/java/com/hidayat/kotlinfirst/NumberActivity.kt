package com.hidayat.kotlinfirst

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        val tvIntNumber = findViewById<TextView>(R.id.tv_int)
        val tvDoubleNumber = findViewById<TextView>(R.id.tv_double)
        val tvLongNumber = findViewById<TextView>(R.id.tv_long)
        val tvFloatNumber = findViewById<TextView>(R.id.tv_float)
        val tvHexaNumber = findViewById<TextView>(R.id.tv_hexa)
        val tvByteNumber = findViewById<TextView>(R.id.tv_byte)
        val tvReadableNumber = findViewById<TextView>(R.id.tv_read)

        val int = 10
        val double = 27.5
        val long = 8L
        val float = 2.5F
        val hexa = 0x0f
        val byte = 0b010101
        val readble = 1_000_000

        tvIntNumber.setText("Int : "+int)
        tvDoubleNumber.setText("Double : "+double.toString())
        tvLongNumber.setText("Long : "+long.toString())
        tvFloatNumber.setText("Float : "+float.toString())
        tvHexaNumber.setText("Hexa : "+hexa.toString())
        tvByteNumber.setText("Byte : "+byte.toString())
        tvReadableNumber.setText("Readable : "+readble.toString())

        val person = Person()
        person.name = null
        Toast.makeText(this,"nama : "+person.name,Toast.LENGTH_LONG).show()
    }
}
