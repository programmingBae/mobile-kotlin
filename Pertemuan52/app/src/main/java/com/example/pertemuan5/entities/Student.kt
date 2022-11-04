package com.example.pertemuan5.entities

import com.google.gson.annotations.SerializedName

data class Student( @SerializedName("id") val id: String, @SerializedName("first_name") val firstName: String,  @SerializedName("last_name") val lastName: String,  @SerializedName("department") val department: String,  @SerializedName("email") val email: String) {
}