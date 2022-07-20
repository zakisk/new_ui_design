package com.example.new_ui_design.ui.profile_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.new_ui_design.R
import com.example.new_ui_design.ui.theme.LocalCustomShapes
import com.example.new_ui_design.ui.theme.LocalSpacing
import com.example.new_ui_design.ui.theme.SantaGreen


@Composable
fun MapView() {
    val spacing = LocalSpacing.current
    val shape = LocalCustomShapes.current.mediumShape
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(spacing.small)
            .background(color = Color.SantaGreen.copy(alpha = 0.1f), shape = shape)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_land_map_marker),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center),
            tint = Color.Unspecified
        )
    }
}