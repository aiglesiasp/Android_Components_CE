package com.aiglepub.composecomponents.examples.estructurarcompose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aiglepub.composecomponents.examples.scaffolds.MyCustomScaffold
import com.aiglepub.composecomponents.ui.theme.ComposeComponentsTheme

/**
 * 5 CONSEJOS PARA ESTRUCTURAS EL CODIGO
 *
 * 1- Sacar el tema de la App principal a un composable aparte
 * En mi caso: ComposeComponentsTheme
 *
 * 2- Dividir composables en partes mas pequeñas
 * Por ejemplo: Tener un composable para la topBar, otro para bototmBar, etc..
 *
 * 3- Crear un composable por pantalla
 * MainScreen, DetailScreen, etc...
 *
 * 4- Estructura los paquetes de UI por pantallas
 * Crear carpeta para modelo, otra para las screens, etc...
 *
 * 5- Extrae las dimensiones
 * Todos lo que sean DP sacarlo fuera
 */

@Composable
fun MyComposeComponentsAppExample(content: @Composable () -> Unit) {
    ComposeComponentsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}