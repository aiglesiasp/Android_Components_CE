package com.aiglepub.composecomponents.examples.listas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Equivalente a RecyclerView
 * Posiciona los elementos en una columna - vertical
 * Para muchos elementos, reutiliza celdas
 *
 */

@Composable
fun MyCustomLazyColumn() {
    LazyColumn(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        items(100) {
            Text("Soy el numero $it")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyCustomLazyColumn_Preview() {
    MyCustomLazyColumn()
}