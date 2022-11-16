package com.example.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhro: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable
