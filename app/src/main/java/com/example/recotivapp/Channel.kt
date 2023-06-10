package com.example.recotivapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Channel(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
