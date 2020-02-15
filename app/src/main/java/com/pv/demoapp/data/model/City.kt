package com.pv.demoapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class City(
        @Expose @SerializedName("Name") var name: String
)