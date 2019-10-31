package com.hidayat.kotlinfootball.model.adapter

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hidayat.kotlinfootball.R
import com.hidayat.kotlinfootball.model.Club
import com.squareup.picasso.Picasso

class ClubAdapter(
    private val context: Context,
    private val clubs: List<Club>,
    private val listener: (Club) -> Unit
) :
    RecyclerView.Adapter<ClubAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewGroup: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_cardview_club, parent, false))

    override fun getItemCount(): Int = clubs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(clubs[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val ivClub = view.findViewById<ImageView>(R.id.iv_club)
        private val tvClubName = view.findViewById<TextView>(R.id.tv_club_name)
        private val cvItemClub = view.findViewById<CardView>(R.id.cv_item_club)

        fun bindItem(club: Club, listener: (Club) -> Unit) {
            club.image?.let { Picasso.get().load(it).fit().into(ivClub) }
            tvClubName.text = club.name
            itemView.setOnClickListener { listener(club) }
        }
    }

}