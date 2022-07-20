package com.example.new_ui_design.domain.models

data class Location(
    val address: String,
    val country: String,
    val state: String,
    val district: String,
    val pinCode: Int,
    val village: String
)
