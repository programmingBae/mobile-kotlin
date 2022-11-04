package com.example.pertemuan5.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Faculty(private val id: String, private val name: String): Parcelable{
    override fun toString(): String {
        return "$id-$name"
    }
}