package com.aiglepub.composecomponents.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aiglepub.composecomponents.Greeting

/**
 * Equivalente a LinearLayout
 * Posiciona los elementos en una columna - vertical
 *
 * Por Default se ajusta al tamaño de sus hijos asi que hay que
 * darle un modificador para que se ajuste a la pantalla
 *
 * Con horizontalArrangement podemos ordenar los elementos de forma vertical
 * Con verticalAlignment podemos ordenar los elementos de forma horizontal
 */

@Composable
fun MyCustomRow() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Greeting(
            name = "Aitor",
            modifier = Modifier
                .background(Color.LightGray)
                .weight(2f)
        )

        Greeting(
            name = "Iglesias",
            modifier = Modifier
                .background(Color.Green)
                .weight(1f)
        )
    }
}

@Preview(
    showBackground = true,
    name = "My Custom Box",
    widthDp = 400,
    heightDp = 200
)
@Composable
private fun MyCustomRow_Preview() {
    MyCustomRow()
}