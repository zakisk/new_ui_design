package com.example.new_ui_design.ui.profile_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.new_ui_design.R
import com.example.new_ui_design.ui.theme.LocalSpacing


@Composable
fun ProfileImage() {
    val spacing = LocalSpacing.current
    Image(
        painter = painterResource(id = R.drawable.ic_account_circle),
        contentDescription = null,
        modifier = Modifier
            .padding(vertical = spacing.medium)
            .size(136.dp)
    )
}