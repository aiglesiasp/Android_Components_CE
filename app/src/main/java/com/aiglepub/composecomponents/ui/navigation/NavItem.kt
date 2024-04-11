package com.aiglepub.composecomponents.ui.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class NavItem (
    val baseRoute: String,
    private val navArgs: List<NavArgs> = emptyList()
) {
    val route = run {
        // baseroute/{arg1}/{arg2}/...
        val argKeys = navArgs.map { "${it.key}" } //mapeamos en argKeys las claves añadiendo las llaves
        listOf(baseRoute)
            .plus(argKeys)
            .joinToString("/") //Creamos una lista con la baseRouter mas todos los argumentos y lo pasamos a String con el separador /
    }

    val args = navArgs.map {
        navArgument(it.key) { type = it.navType } //Con esto mapeamos los argumentos para pasarlo mas sencillo
    }
    data object Main: NavItem("main")
    data object Detail: NavItem("detail", listOf(NavArgs.MediaId)) {
        fun createNavRoute(mediaId: Int) = "$baseRoute/$mediaId"
    }
}

enum class NavArgs(val key: String, val navType: NavType<*>) {
    MediaId(key = "mediaId", navType = NavType.IntType)
}