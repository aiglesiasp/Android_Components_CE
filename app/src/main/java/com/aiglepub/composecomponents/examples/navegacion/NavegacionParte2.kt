package com.aiglepub.composecomponents.examples.navegacion

/**
 * NAVIGATION COMPOSE
 *
 * 1- Extraer el codigo que se esta generando en la MainActivity a un fichero aparte
 *
 * 2- Modelar la navegacion extrayendo las rutas a un fichero aparte
 *
 * sealed class NavItem (
 *     val baseRoute: String,
 *     val navArgs: List<NavArgs> = emptyList()
 * ) {
 *     val route = run {
 *         // baseroute/{arg1}/{arg2}/...
 *         val argKeys = navArgs.map { "${it.key}" } //mapeamos en argKeys las claves añadiendo las llaves
 *         listOf(baseRoute)
 *             .plus(argKeys)
 *             .joinToString("/") //Creamos una lista con la baseRouter mas todos los argumentos y lo pasamos a String con el separador /
 *     }
 *
 *     val args = navArgs.map {
 *         navArgument(it.key) { type = it.navType } //Con esto mapeamos los argumentos para pasarlo mas sencillo
 *     }
 *     data object Main: NavItem("main")
 *     data object Detail: NavItem("detail", listOf(NavArgs.MediaId))
 * }
 *
 * enum class NavArgs(val key: String, val navType: NavType<*>) {
 *     MediaId(key = "mediaId", navType = NavType.IntType)
 * }
 *
 * 3- Modificamos nuestro Composable de Navigation para ir añadiendo los NavItem
 *
 * @Composable
 * fun Navigation() {
 *     val navController = rememberNavController()
 *     NavHost(navController = navController, startDestination = NavItem.Main.route) {
 *         composable(NavItem.Main.route) {
 *             MainScreen()
 *         }
 *         composable(
 *             route = NavItem.Detail.route,
 *             arguments = NavItem.Detail.args
 *         ) {backStackEntry ->
 *             val id = backStackEntry.arguments?.getInt("mediaId")
 *             requireNotNull(id) { "No nulo, requerido para navegar" }
 *             DetailScreen(id)
 *         }
 *     }
 * }
 *
 *
 * 4- Ahora queda hacer la comunicacion desde el composable hacia el navHost para poder realizar la navegacion
 * Eso lo haremos a traves de una lambda que añadimos en las Screens principales para poder despues llamarlas desde el navHost
 *
 * 5- Crear funcion de extensinon del composable para dejar el navHost mas arreglado
 *
 *
 */