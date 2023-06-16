package com.example.recotivapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recotivapp.api.APIConfig
import com.example.recotivapp.databinding.ActivityRecommendationBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RecommendationActivity : AppCompatActivity() {

        private lateinit var binding: ActivityRecommendationBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityRecommendationBinding.inflate(layoutInflater)
            setContentView(binding.root)

            APIConfig.getService().getBreeds().enqueue(object : Callback<ResponseChannel> {
                override fun onResponse(call: Call<ResponseChannel>, response: Response<ResponseChannel>) {
                    if (response.isSuccessful) {
                        val responseChannel = response.body()
                        val dataItem = responseChannel?.data
                        val adapterCat = AdapterChannel(dataItem)
                        binding.rvChannel.apply {
                            layoutManager = LinearLayoutManager(this@RecommendationActivity)
                            setHasFixedSize(true)
                            adapterCat.notifyDataSetChanged()
                            adapter = adapterCat
                        }
                    }
                }

                override fun onFailure(call: Call<ResponseChannel>, t: Throwable) {
                    Toast.makeText(applicationContext, "Data not Found", Toast.LENGTH_SHORT).show()
                }

            })
        }
    }