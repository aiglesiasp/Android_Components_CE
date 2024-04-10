package com.aiglepub.composecomponents.examples.imagenes

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyCustomIcon() {
    Icon(
        imageVector = Icons.Default.PlayArrow ,
        contentDescription = "Icon",
        tint = Color.Black,
        modifier = Modifier
            .size(92.dp)
    )
}

@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
private fun MyCustomIcon_Preview() {
    MyCustomIcon()
}