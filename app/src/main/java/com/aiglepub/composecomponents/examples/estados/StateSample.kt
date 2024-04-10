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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
 * Como esta dentro de mi funcion, cada vez que cambie el estado se repinta, pero como
 * le estoy asignado un valor al principio, no se repinta nada
 *
 * SOLUCION: recordar estado con remember
 * val text = remember { mutableStateOf("") }
 *
 * SOLUCIÓN MEJORADA: agregar el "by" e importar
 * var text by remember { mutableStateOf("") }
 *
 * Con esta nueva manera no necesitaras arrastras siempre el text.value, podras acceder
 * directamente al valor desde text
 *
 * PROBLEMA: Si rotamos la pantalla ya no se guarda el valor
 * Hay otra opcion que se llama rememberSaveable
 * var text by rememberSaveable { mutableStateOf("") }
 *
 * STATEHOSTING
 * Extraer el estado de los composables para que sea accesible desde el composable padre
 * Consiste en sustituir la variable de estado por:
 *      - Variable que me da el valor
 *      - Lambda para retornar un valor
 * Por ejemplo, el TextField tiene el "value" y el "onValueChange"
 */

@Composable
fun MyStateSampleFather() {
    var text by rememberSaveable { mutableStateOf("") }
    MyStateSample(
        value = text,
        onValueChange = { text = it }
    )
}

@Composable
fun MyStateSample(value: String, onValueChange: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        TextField(
            value = value,
            onValueChange = { onValueChange(it) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Text(
            text= value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)
        )
        Button(
            onClick = { onValueChange("") },
            modifier = Modifier.fillMaxWidth(),
            enabled = value.isNotEmpty()
        ) {
            Text(text = "CLEAR")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyStateSample_Preview() {
    MyStateSampleFather()
}