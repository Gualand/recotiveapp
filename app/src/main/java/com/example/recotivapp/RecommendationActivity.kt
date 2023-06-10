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
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listChannel = ArrayList<Channel>()
        for (i in dataName.indices) {
            val hero = Channel(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listChannel.add(hero)
        }
        return listChannel
    }

}