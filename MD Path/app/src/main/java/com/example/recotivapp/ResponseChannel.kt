package com.example.recotivapp

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class ResponseChannel(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null
) : Parcelable

@Parcelize
data class DataItem(

	@field:SerializedName("view")
	val view: Int? = null,

	@field:SerializedName("like")
	val like: Int? = null,

	@field:SerializedName("subs")
	val subs: Int? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("chan_Name")
	val chanName: String? = null,

	@field:SerializedName("judul")
	val judul: String? = null
) : Parcelable
