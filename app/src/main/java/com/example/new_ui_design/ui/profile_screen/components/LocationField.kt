package com.example.new_ui_design.ui.profile_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.example.new_ui_design.R
import com.example.new_ui_design.domain.models.Location
import com.example.new_ui_design.ui.theme.LocalCustomShapes
import com.example.new_ui_design.ui.theme.LocalSpacing
import com.example.new_ui_design.ui.theme.SantaGreen


@Composable
fun LocationField(location: Location) {
    val spacing = LocalSpacing.current
    val shape = LocalCustomShapes.current.mediumShape
    var size by remember { mutableStateOf(Size.Zero) }
    val height: @Composable () -> Dp = { with(LocalDensity.current) { size.height.toDp() } }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(spacing.small)
            .background(color = Color.SantaGreen.copy(alpha = 0.1f), shape = shape)
            .onGloballyPositioned { size = it.size.toSize() }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_location),
            contentDescription = null,
            modifier = Modifier.padding(vertical = spacing.large, horizontal = spacing.medium),
            tint = Color.Unspecified
        )

        Divider(
            color = Color.Gray,
            modifier = Modifier
                .height(height() - spacing.small)
                .width(2.dp)
                .padding(top = spacing.small)
        )

        Column(
            modifier = Modifier
                .padding(vertical = spacing.medium, horizontal = spacing.small)
        ) {
            Text(
                text = "Location",
                color = Color.Gray,
                style = MaterialTheme.typography.caption
            )

            Row(modifier = Modifier.padding(vertical = spacing.small)) {
                Text(
                    text = "Address: ",
                    color = Color.SantaGreen,
                    style = MaterialTheme.typography.body2
                )

                Text(
                    text = location.address,
                    color = Color.Gray,
                    style = MaterialTheme.typography.body2
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = spacing.small),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    Text(
                        text = "Country: ",
                        color = Color.SantaGreen,
                        style = MaterialTheme.typography.body2
                    )

                    Text(
                        text = location.country,
                        color = Color.Gray,
                        style = MaterialTheme.typography.body2
                    )
                }

                Row {
                    Text(
                        text = "State: ",
                        color = Color.SantaGreen,
                        style = MaterialTheme.typography.body2
                    )

                    Text(
                        text = location.state,
                        color = Color.Gray,
                        style = MaterialTheme.typography.body2
                    )
                }

            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = spacing.small),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    Text(
                        text = "District: ",
                        color = Color.SantaGreen,
                        style = MaterialTheme.typography.body2
                    )

                    Text(
                        text = location.district,
                        color = Color.Gray,
                        style = MaterialTheme.typography.body2
                    )
                }

                Row {
                    Text(
                        text = "Pin Code: ",
                        color = Color.SantaGreen,
                        style = MaterialTheme.typography.body2
                    )

                    Text(
                        text = "${location.pinCode}",
                        color = Color.Gray,
                        style = MaterialTheme.typography.body2
                    )
                }

            }

            Row(modifier = Modifier.padding(vertical = spacing.small)) {
                Text(
                    text = "Village: ",
                    color = Color.SantaGreen,
                    style = MaterialTheme.typography.body2
                )

                Text(
                    text = location.village,
                    color = Color.Gray,
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}