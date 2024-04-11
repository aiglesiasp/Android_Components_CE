package com.aiglepub.composecomponents.ui.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aiglepub.composecomponents.examples.scaffolds.MyCustomTopBar
import com.aiglepub.composecomponents.model.generateListOfMediaItem
import com.aiglepub.composecomponents.ui.screens.main.MediaListItem
import com.aiglepub.composecomponents.ui.screens.main.MediaListItemIcon
import com.aiglepub.composecomponents.ui.screens.main.MediaListItemImage
import com.aiglepub.composecomponents.ui.screens.main.MediaListTitle
import com.aiglepub.composecomponents.ui.screens.share.IconBackButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(mediaId: Int, onUpClick: () -> Unit) {
    val mediaItem = remember { generateListOfMediaItem().first { it.id == mediaId } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = mediaItem.title) },
                navigationIcon = { IconBackButton(onUpClick=onUpClick)}
            )

        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            MediaListTitle(item = mediaItem)
            MediaListItemImage(item = mediaItem)
        }
        
    }
}