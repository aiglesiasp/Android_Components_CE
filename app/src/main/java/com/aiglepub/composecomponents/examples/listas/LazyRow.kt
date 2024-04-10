package com.aiglepub.composecomponents.examples.listas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Equivalente a RecyclerView
 * Posiciona los elementos en una columna - vertical
 * Para muchos elementos, reutiliza celdas
 */

@Composable
fun MyCustomLazyRow() {
    LazyRow(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxSize()
    ) {
        items(100) {
            Spacer(modifier = Modifier.size(5.dp))
            Text("Soy el numero $it")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyCustomLazyRow_Preview() {
    MyCustomLazyRow()
}