package com.example.new_ui_design.ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing(
    val default : Dp = 0.dp,
    val extraSmall : Dp = 4.dp,
    val small : Dp = 8.dp,
    val medium : Dp = 16.dp,
    val large : Dp = 24.dp,
    val extraLarge : Dp = 40.dp,
    val listBottomSpacing: Dp = 96.dp
)

val LocalSpacing = compositionLocalOf { Spacing() }