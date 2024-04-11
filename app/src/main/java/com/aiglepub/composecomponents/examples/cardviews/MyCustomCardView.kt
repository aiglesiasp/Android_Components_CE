package com.aiglepub.composecomponents.examples.cardviews

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglepub.composecomponents.model.MediaItem
import com.aiglepub.composecomponents.ui.screens.main.MediaListItemImage
import com.aiglepub.composecomponents.ui.screens.main.MediaListTitle

/**
 * CARD VIEW
 * Targetas custom para dar mas estilo a nuestras presentaciones
 *
 */
@Composable
fun MyCustomCardView() {
    Card(
        modifier = Modifier
            .clickable { }
            .size(width = 240.dp, height = 100.dp),
        colors = CardDefaults.cardColors(Color.Red),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Soy una CARD")
            Text(text = "Prueba")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyCustomCardView_Preview() {
    MyCustomCardView()
}