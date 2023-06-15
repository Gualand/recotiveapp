package com.example.recotivapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecommendationActivity : AppCompatActivity() {
    private lateinit var rvChannel: RecyclerView
    private val list = ArrayList<Channel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        rvChannel = findViewById(R.id.rv_channel)
        rvChannel.setHasFixedSize(true)

        list.addAll(getListChannel())
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvChannel.layoutManager = LinearLayoutManager(this)
        val listChannelAdapter = ListChannelAdapter(list)
        rvChannel.adapter = listChannelAdapter
    }

    private fun getListChannel(): ArrayList<Channel> {
        val dataName = resources.getStringArray(R.array.data_judul)
        val dataChannel = resources.getStringArray(R.array.data_channel)
        val dataSubscriber = resources.getStringArray(R.array.data_subscriber)
        val dataLink = resources.getStringArray(R.array.data_link)
        val dataView = resources.getStringArray(R.array.data_view)
        val dataLike = resources.getStringArray(R.array.data_like)

        val listChannel = ArrayList<Channel>()
        for (i in dataName.indices) {
            val hero = Channel(dataName[i], dataChannel[i], dataSubscriber[i], dataLink[i], dataView[i], dataLike[i])
            listChannel.add(hero)
        }
        return listChannel
    }

}