package com.example.new_ui_design.ui.common_components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.new_ui_design.ui.theme.LocalCustomShapes
import com.example.new_ui_design.ui.theme.LocalSpacing
import com.example.new_ui_design.ui.theme.SantaGreen


@Composable
fun RoundedShapeButton(
    text : String,
    enabled : Boolean = true,
    fraction: Float = 1f,
    onClick : () -> Unit
) {
    val spacing = LocalSpacing.current
    val oval = LocalCustomShapes.current.ovalShape
    val defaultModifier = Modifier
        .fillMaxWidth(fraction)
//        .padding(all = spacing.small)

    Button(
        onClick = { onClick() },
        modifier = defaultModifier,
        enabled = enabled,
        shape = oval,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.SantaGreen)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.caption,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.padding(vertical = spacing.small)
        )
    }
}