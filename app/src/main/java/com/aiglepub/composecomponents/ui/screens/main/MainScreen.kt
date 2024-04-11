package com.aiglepub.composecomponents.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.aiglepub.composecomponents.examples.scaffolds.MyCustomTopBar

@Composable
fun MainScreen() {

    Scaffold(
        topBar = { MyCustomTopBar() }, // barra superior --> TopAppBar
        bottomBar = { }, //barra inferior --> BottomAppBar , BottomNavigation
        snackbarHost = { }, // snackbars --> mensajes parecidos al Toast
        floatingActionButton = { }, // botones de accion que se colocan a la derecha abajo
    ) {paddingValues ->
        MediaList(modifier = Modifier.padding(paddingValues))
    }
}