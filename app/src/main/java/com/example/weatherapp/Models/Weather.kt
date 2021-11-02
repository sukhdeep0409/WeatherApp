package com.example.weatherapp.Models

import java.io.Serializable

data class Weather
constructor(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
): Serializable
