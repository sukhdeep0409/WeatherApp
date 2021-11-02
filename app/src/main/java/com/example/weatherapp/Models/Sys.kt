package com.example.weatherapp.Models

import java.io.Serializable

data class Sys
constructor(
    val type: Int,
    val message: Double,
    val country: String,
    val sunrise: Long,
    val sunset: Long
): Serializable
