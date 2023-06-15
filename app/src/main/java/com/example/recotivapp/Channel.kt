package com.example.recotivapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Channel(
    val judul: String,
    val namaChannel: String,
    val subscriber: String,
    val link: String,
    val view: String,
    val like: String
) : Parcelable
