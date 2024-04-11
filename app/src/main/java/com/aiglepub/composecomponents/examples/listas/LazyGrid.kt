package com.aiglepub.composecomponents.examples.listas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglepub.composecomponents.ui.screens.main.MediaListItem
import com.aiglepub.composecomponents.model.MediaItem

/**
 * Equivalente a RecyclerView
 * Posiciona los elementos en forma de tabla
 */

@Composable
fun MyCustomLazyGrid() {
    LazyVerticalGrid(
        contentPadding = PaddingValues(2.dp),
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Bottom
    ) {
        items(100) {
            MediaListItem(
                item = MediaItem(1,"","", MediaItem.Type.VIDEO),
                modifier = Modifier.padding(2.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyCustomLazyGrid_Preview() {
    MyCustomLazyGrid()
}