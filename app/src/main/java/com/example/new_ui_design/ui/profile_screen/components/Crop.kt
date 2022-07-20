package com.example.new_ui_design.ui.profile_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.new_ui_design.R
import com.example.new_ui_design.domain.models.Crop
import com.example.new_ui_design.ui.theme.LocalCustomShapes
import com.example.new_ui_design.ui.theme.LocalSpacing
import com.example.new_ui_design.ui.theme.SantaGreen


@Composable
fun Crop(crop: Crop) {
    val spacing = LocalSpacing.current
    val oval = LocalCustomShapes.current.ovalShape
    Row(
        modifier = Modifier
            .background(color = Color.SantaGreen.copy(alpha = 0.2f), shape = oval)
            .padding(spacing.small)
    ) {
        Icon(
            painter = painterResource(id = crop.iconId),
            contentDescription = null,
            modifier = Modifier.padding(end = spacing.small),
            tint = Color.Unspecified
        )

        Text(
            text = crop.name,
            color = Color.SantaGreen,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.caption
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_close_green),
            contentDescription = null,
            modifier = Modifier.padding(start = spacing.small),
            tint = Color.Unspecified
        )
    }
}