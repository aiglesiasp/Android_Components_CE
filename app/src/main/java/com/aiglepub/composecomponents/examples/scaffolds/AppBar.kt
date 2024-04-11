package com.aiglepub.composecomponents.examples.scaffolds

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglepub.composecomponents.ui.MyComposeComponentsApp

/**
 * APP BAR
 * Es la barra de navegació superior
 *
 * Primero verificar en el Manifest que el theme del activity sea NoActionBar,
 * de esta manera la podremos posicionar donde queramos
 *
 * En el title podemos poner cualquier composable
 * Menu de navegacion --> navigationIcon
 * Iconos de accion --> Iconos para que usuario interactue
 *
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCustomTopBar() {
    TopAppBar(
        // TITULO DE TOP APP BAR
        title = {
            Row {
                Text(text = "Titulo App Bar")
                Spacer(modifier = Modifier.width(16.dp))
                Icon(imageVector = Icons.Default.Android, contentDescription = "Android" )
            }
        },

        // ICONO IZQUIERDO DE NAVEGACION
        navigationIcon = {
            IconButton(onClick = { /*TODO() */ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu" )
            }
        },
        // ICONOS DERECHOS DE ACCION
        actions = {
            MyCustomTopBarAction(imageVector = Icons.Default.Search, onClick = { /*TODO() */ })
            MyCustomTopBarAction(imageVector = Icons.Default.Share, onClick = { /*TODO() */ })
        }
    )
}

@Composable
fun MyCustomTopBarAction(
    imageVector: ImageVector,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = imageVector,
            contentDescription = "Share" )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyCustomTopBar_Preview() {
    MyComposeComponentsApp {
        MyCustomTopBar()
    }
}