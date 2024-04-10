package com.aiglepub.composecomponents.examples.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aiglepub.composecomponents.Greeting

/**
 * Equivalente a FrameLayout
 * Posiciona los elementos en el centro de la pantalla
 *
 * Por Default se ajusta al tamaño de sus hijos asi que hay que
 * darle un modificador para que se ajuste a la pantalla
 *
 * Con contentAligment podemos ordenar los elementos de una Box
 */

@Composable
fun MyCustomBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Greeting(name = "Aitor")
        Greeting(
            name = "Iglesias",
            modifier = Modifier.align(Alignment.BottomEnd)
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
private fun MyCustomBox_Preview() {
    MyCustomBox()
}