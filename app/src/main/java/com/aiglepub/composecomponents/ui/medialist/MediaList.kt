package com.aiglepub.composecomponents.ui.medialist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.aiglepub.composecomponents.ui.medialist.model.generateListOfMediaItem


@Composable
fun MediaList() {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(generateListOfMediaItem()) { mediaItem ->
            MediaListItem(mediaItem)
        }
    }
}