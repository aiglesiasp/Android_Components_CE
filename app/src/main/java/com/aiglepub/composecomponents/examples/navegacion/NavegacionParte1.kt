package com.aiglepub.composecomponents.examples.navegacion

/**
 * NAVIGATION COMPOSE
 * La estructura normal de un proyecto es tener un MainActivity con un setContent
 * y dentro el Composable que queremos mostrar.
 *
 * Cuando queriamos navegar entre fragments existe la libreria Jetpack Navigation
 *  * que es un archivo xml que nos permite navegar
 *
 * Pero hay una manera de navegar entre Composables y asi tener una unica Activity
 * Eso se llama el Compose Navigation
 *
 * 1-Hay que añadir la libreria de Compose Navigation en el build.gradle
 *  implementation("androidx.navigation:navigation-compose:2.7.7")
 *
 * 2-Configurar NavigationCompose en la MainActivity
 *  val navController = rememberNavController()
 *
 *  3-Configurar NavHost --> Aqui le decimos que navController debe utilizar y la pantalla a la que debe navegar
 *  NavHost(navController = navController, startDestination = "main") {}
 *
 *  4- Dentro del NavHost configura los Composables que voy a utilizar como pantallas
 *                 composable("main") {
 *                     MainScreen()
 *                 }
 *
 *                 composable("detail") {
 *                     DetailScreen()
 *                 }
 *
 * 5- Para navegar se necesita el navController y se podria pasar el navController por los Screens
 * De esta manera tendriamos el navController en capas inferiores y se podria utilizar
 * Pero esto no es muy recomendable, es mejor utilizar lambdas para comunicar hacia arriba que navegue
 *
 * 6- Para pasar parametros entre composables se hace a traves de la route
 * Basicamente como si fueran paginas web
 *                 composable("detail/{mediaId}") {
 *                     DetailScreen()
 *                 }
 * Normalmente siempre son parametros de tipo String pero puede ser que necesitemos otro tipo de paramentro
 * Para ello se le añade otro parametro al Composable que son los navArguments y se pasa un listado de ellos
 *
 *                 composable(
 *                     route = "detail/{mediaId}",
 *                     arguments = listOf(navArgument("mediaId"){type = NavType.IntType})
 *                 ) {
 *                     DetailScreen()
 *                 }
 *
 * 7- Recuperar el ID para pasarselo al Composable del Detalle
 * Para ello utilizamos el backStackEntry  val id = backStackEntry.arguments?.getInt("mediaId")
 * y comprobaremos que el ID obtenido no es nulo
 *
 *                 composable(
 *                     route = "detail/{mediaId}",
 *                     arguments = listOf(navArgument("mediaId"){type = NavType.IntType})
 *                 ) {backStackEntry ->
 *                     val id = backStackEntry.arguments?.getInt("mediaId")
 *                     requireNotNull(id) { "No nulo, requerido para navegar" }
 *                     DetailScreen(id)
 *                 }
 */