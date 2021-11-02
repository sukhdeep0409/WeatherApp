package com.example.weatherapp.Models

import java.io.Serializable

data class Main
constructor(
    val temp: Double,
    val pressure: Double,
    val humidity: Int,
    val temp_min: Double,
    val temp_max: Double,
    val sea_level: Double,
    val grnd_level: Double
): Serializable
