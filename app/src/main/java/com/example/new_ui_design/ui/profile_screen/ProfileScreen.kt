package com.example.new_ui_design.ui.profile_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.new_ui_design.R
import com.example.new_ui_design.ui.common_components.RoundedShapeButton
import com.example.new_ui_design.ui.profile_screen.components.*
import com.example.new_ui_design.ui.theme.LocalSpacing
import com.example.new_ui_design.util.farmer


@Composable
fun ProfileScreen() {
    val spacing = LocalSpacing.current
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ProfileImage()
            RoundedShapeButton(
                text = stringResource(id = R.string.send_link_to_farmer),
                fraction = 0.6f
            ) { /* onClick */ }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = spacing.medium)
            ) {
                Field(
                    metaData = "Name",
                    value = farmer.name,
                    iconId = R.drawable.ic_account
                )

                Field(
                    metaData = "Mobile Number",
                    value = farmer.mobileNo,
                    iconId = R.drawable.ic_phone
                )

                Field(
                    metaData = "Date of Birth",
                    value = farmer.dateOfBirth,
                    iconId = R.drawable.ic_date
                )

                Field(
                    metaData = "Education",
                    value = farmer.education,
                    iconId = R.drawable.ic_education
                )

                Field(
                    metaData = "Gender",
                    value = farmer.gender,
                    iconId = R.drawable.ic_gender
                )

                LocationField(location = farmer.location)

                Field(
                    metaData = "Data Source",
                    value = farmer.dataSource,
                    iconId = R.drawable.ic_education
                )

                Field(
                    metaData = "Have Smart Phone",
                    value = if (farmer.haveSmartPhone) "Yes" else "No",
                    iconId = R.drawable.ic_phone
                )

                CropsField(crops = farmer.crops)

                MapView()
            }
        }
    }
}