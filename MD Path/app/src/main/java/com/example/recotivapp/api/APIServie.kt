package com.example.recotivapp.api

import com.example.recotivapp.ResponseChannel
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("recommend")
    fun getBreeds() : Call<ResponseChannel>
}