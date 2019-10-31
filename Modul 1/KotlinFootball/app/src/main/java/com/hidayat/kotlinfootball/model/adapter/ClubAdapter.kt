package com.hidayat.kotlinfootball.model.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hidayat.kotlinfootball.R
import com.hidayat.kotlinfootball.model.Club
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_cardview_club.view.*

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

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer {
        fun bindItem(club: Club, listener: (Club) -> Unit) {
            club.image?.let { Picasso.get().load(it).fit().into(itemView.iv_club) }
            itemView.tv_club_name.text = club.name
            itemView.setOnClickListener { listener(club) }
        }
    }
}