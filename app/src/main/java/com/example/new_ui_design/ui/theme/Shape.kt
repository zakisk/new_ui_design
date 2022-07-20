package com.example.new_ui_design.ui.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

data class CustomShapes (
    val ovalShape : CornerBasedShape = RoundedCornerShape(50),
    val mediumShape : CornerBasedShape = RoundedCornerShape(8.dp),
    val barShape : CornerBasedShape = RoundedCornerShape(12.dp),
    val imageShape : CornerBasedShape = RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp),
    val buttonShape : CornerBasedShape = RoundedCornerShape(16.dp),
    val smallShape : CornerBasedShape = RoundedCornerShape(4.dp),
    val largeShape : CornerBasedShape = RoundedCornerShape(24.dp)
)

val LocalCustomShapes = compositionLocalOf { CustomShapes() }