package com.example.weatherapp.Models

import java.io.Serializable

data class Wind
constructor(
    val speed: Double,
    val deg: Int
): Serializable
