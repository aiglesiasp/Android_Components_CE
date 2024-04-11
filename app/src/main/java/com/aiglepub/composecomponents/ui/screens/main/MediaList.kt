package com.aiglepub.composecomponents.ui.screens.main

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.aiglepub.composecomponents.R
import com.aiglepub.composecomponents.model.generateListOfMediaItem


@Composable
fun MediaList(modifier: Modifier = Modifier) {
        LazyVerticalGrid(
            contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
            columns = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
            modifier = modifier
        ) {
            items(generateListOfMediaItem()) { mediaItem ->
                MediaListItem(item = mediaItem, modifier.padding(dimensionResource(id = R.dimen.padding_xsmall)))
            }
        }
}