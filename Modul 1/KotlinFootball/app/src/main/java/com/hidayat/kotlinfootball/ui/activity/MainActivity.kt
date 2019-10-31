package com.hidayat.kotlinfootball.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.hidayat.kotlinfootball.R
import com.hidayat.kotlinfootball.model.Club
import com.hidayat.kotlinfootball.model.adapter.ClubAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var clubs: MutableList<Club> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        rv_club.layoutManager = LinearLayoutManager(this)
        rv_club.adapter = ClubAdapter(this, clubs) {
            val toast = Toast.makeText(this, it.name, Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)

        clubs.clear()
        for (i in name.indices) {
            clubs.add(Club(name[i], image.getResourceId(i, 0)))
        }

        image.recycle()
    }
}
