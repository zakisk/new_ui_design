package com.example.new_ui_design.domain.models


data class Farmer(
    val name: String,
    val profileImageLink: String? = null,
    val mobileNo: String,
    val dateOfBirth: String,
    val education: String,
    val gender: String,
    val location: Location,
    val dataSource: String,
    val haveSmartPhone: Boolean,
    val crops: List<Crop>
)