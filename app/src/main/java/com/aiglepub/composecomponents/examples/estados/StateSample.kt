package com.aiglepub.composecomponents.examples.estados

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Para que JetPack Compose se de cuenta de que el estado de la vista ha cambiado
 * necesito crear un tipo de variables especiales de tipo STATE
 *
 * var text = mutableStateOf("")
 * Aquí necesito llamar al text.value para poder modificar y obtener su valor
 *
 *
 *
 */

@Composable
fun MyStateSample() {
    val text = mutableStateOf("")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Text(
            text= text.value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Button(
            onClick = { text.value = ""},
            modifier = Modifier.fillMaxWidth(),
            enabled = text.value.isNotEmpty()
        ) {
            Text(text = "CLEAR")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyStateSample_Preview() {
    MyStateSample()
}