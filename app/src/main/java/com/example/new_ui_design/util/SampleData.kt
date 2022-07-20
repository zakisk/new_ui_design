package com.example.new_ui_design.util

import com.example.new_ui_design.R
import com.example.new_ui_design.domain.models.Crop
import com.example.new_ui_design.domain.models.Farmer
import com.example.new_ui_design.domain.models.Location

val location = Location(
    address = "#12 B, West Green",
    country = "India",
    state = "Punjab",
    district = "Kharar",
    pinCode = 130220,
    village = "Kharar Village"
)


val farmer = Farmer(
    name = "Addy_ 123 Agro",
    mobileNo = "+919000566676",
    dateOfBirth = "13 Jun, 1995",
    education = "Post Graduation",
    gender = "Male",
    location = location,
    dataSource = "-",
    haveSmartPhone = true,
    crops = listOf(
        Crop(name = "Mango", iconId = R.drawable.ic_mango),
        Crop(name = "Orange", iconId = R.drawable.ic_orange),
        Crop(name = "Potato", iconId = R.drawable.ic_potato),
        Crop(name = "Rice", iconId = R.drawable.ic_rice),
        Crop(name = "Grape", iconId = R.drawable.ic_grape)
    )
)
