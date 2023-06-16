package com.example.recotivapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListChannelAdapter(private val listChannel: ArrayList<Channel>) : RecyclerView.Adapter<ListChannelAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_channel, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listChannel.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (judul, namaChannel, subscriber, linkUrl, view, like) = listChannel[position]
        holder.tvJudul.text = judul
        holder.tvNamaChannel.text = namaChannel
        holder.tvSubs.text = subscriber
        holder.tvLink.text = linkUrl
        holder.tvView.text = view
        holder.tvLike.text = like
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvJudul: TextView = itemView.findViewById(R.id.tv_hasilJudul)
        val tvNamaChannel: TextView = itemView.findViewById(R.id.tv_namaChannel)
        val tvSubs: TextView = itemView.findViewById(R.id.tv_subscriber)
        val tvLink: TextView = itemView.findViewById(R.id.tv_hasilLink)
        val tvView: TextView = itemView.findViewById(R.id.tv_hasilView)
        val tvLike: TextView = itemView.findViewById(R.id.tv_hasilLike)
    }
}