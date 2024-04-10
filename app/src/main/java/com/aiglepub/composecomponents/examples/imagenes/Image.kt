package com.aiglepub.composecomponents.examples.imagenes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation

@Composable
fun MyCustomAsyncImage() {
    Box(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = "https://loremflickr.com/400/400/cat",
            contentDescription = "Imagen Prueba")
    }
}

@Composable
fun MyCustomRequestImage() {
    Box(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://loremflickr.com/400/400/cat")
                .crossfade(2000) //efecto de entrada
                .build(),
            contentDescription = "Imagen Prueba",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        MyCustomIcon()
    }
}
