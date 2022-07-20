package com.example.new_ui_design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.new_ui_design.ui.profile_screen.ProfileScreen
import com.example.new_ui_design.ui.theme.New_ui_designTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            New_ui_designTheme {
                ProfileScreen()
            }
        }
    }
}