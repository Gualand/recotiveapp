package com.example.recotivapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterChannel(val dataChannel: List<DataItem?>?) : RecyclerView.Adapter<AdapterChannel.ListViewHolder>() {

    class ListViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val tvJudul = view.findViewById<TextView>(R.id.tv_hasilJudul)
        val tvNamaChannel = view.findViewById<TextView>(R.id.tv_namaChannel)
        val tvSubscriber = view.findViewById<TextView>(R.id.tv_subscriber)
        val tvLink = view.findViewById<TextView>(R.id.tv_hasilLink)
        val tvView = view.findViewById<TextView>(R.id.tv_hasilView)
        val tvLike = view.findViewById<TextView>(R.id.tv_hasilLike)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_channel, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.apply {
            tvJudul.text = dataChannel?.get(position)?.judul
            tvNamaChannel.text = dataChannel?.get(position)?.chanName
            tvSubscriber.text = dataChannel?.get(position)?.subs.toString()
            tvLink.text = dataChannel?.get(position)?.link
            tvView.text = dataChannel?.get(position)?.view.toString()
            tvLike.text = dataChannel?.get(position)?.like.toString()

        }
    }

    override fun getItemCount(): Int {
        if (dataChannel != null) {
            return dataChannel.size
        }
        return 0
    }
}