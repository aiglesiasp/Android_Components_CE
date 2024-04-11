package com.aiglepub.composecomponents.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.aiglepub.composecomponents.R
import com.aiglepub.composecomponents.model.MediaItem


@Composable
fun MediaListItem(item: MediaItem, onClick: () -> Unit ,modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clickable { onClick() }
    ) {
        MediaListItemImage(item)
        MediaListTitle(item)
    }
}

@Composable
fun MediaListTitle(item: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.secondary)
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(
            text = item.title,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Composable
fun MediaListItemImage(item: MediaItem) {
    Box(
        modifier = Modifier
            .height(dimensionResource(id = R.dimen.cell_thumb_height))
            .fillMaxWidth()
            .background(Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(item.thumb)
                .crossfade(2000) //efecto de entrada
                .build(),
            contentDescription = "Imagen Prueba",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        if(item.type == MediaItem.Type.VIDEO) {
            MediaListItemIcon()
        }
    }
}

@Composable
fun MediaListItemIcon() {
    Icon(
        imageVector = Icons.Default.PlayArrow ,
        contentDescription = "Icon",
        tint = Color.White,
        modifier = Modifier
            .size(dimensionResource(id = R.dimen.padding_hight))
    )
}