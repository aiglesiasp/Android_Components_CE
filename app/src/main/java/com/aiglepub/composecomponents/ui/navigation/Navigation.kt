package com.aiglepub.composecomponents.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aiglepub.composecomponents.ui.screens.detail.DetailScreen
import com.aiglepub.composecomponents.ui.screens.main.MainScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavItem.Main.route) {
        composable(NavItem.Main.route) {
            MainScreen {mediaItem ->
                navController.navigate(NavItem.Detail.createNavRoute(mediaItem.id))
            }
        }
        composable(
            route = NavItem.Detail.route,
            arguments = NavItem.Detail.args
        ) {backStackEntry ->
            DetailScreen(
                mediaId = backStackEntry.findArg(NavArgs.MediaId),
                onUpClick = {navController.popBackStack()})
        }
    }
}

private fun NavGraphBuilder.composable(
    navItem: NavItem,
    content: @Composable (NavBackStackEntry) -> Unit
) {
    composable(
        route = navItem.route,
        arguments = navItem.args
    ) {
        content(it)
    }
}

private inline fun <reified T> NavBackStackEntry.findArg(arg: NavArgs): T {
    val value = arguments?.get(arg.key)
    requireNotNull(value)
    return value as T
}
