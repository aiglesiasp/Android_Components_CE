package com.aiglepub.composecomponents.examples.scaffolds

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aiglepub.composecomponents.ui.screens.main.MediaList


/**
 * Nos ayuda a gestionar los componentes de una app
 * Permite situar un tapBar, bottomBar, menu, actionButton, etc...
 * Para que nos sea mas facil montar una app con los componentes mas típicos
 *
 * El Scaffold tiene un paddingValues que calcula el padding del Scaffold
 * en función de los elementos que estemos mostrando en pantalla
 * Ese padding hay que aplicarselo al Composable que este dentro del content del Scaffold
 * Para ello hay que añadirle un Modifier a nuestro composable hijo para poderle pasar los paddingValues
 */

@Composable
fun MyCustomScaffold() {

    Scaffold(
        topBar = { MyCustomTopBar() }, // barra superior --> TopAppBar
        bottomBar = { }, //barra inferior --> BottomAppBar , BottomNavigation
        snackbarHost = { }, // snackbars --> mensajes parecidos al Toast
        floatingActionButton = { }, // botones de accion que se colocan a la derecha abajo
    ) {paddingValues ->
        MediaList(modifier = Modifier.padding(paddingValues))
    }
}