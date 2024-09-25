package com.cn.noty.nav_graph


import CreateNotePage
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.cn.noty.pages.LoginPage
import com.cn.noty.pages.NotyPage
import com.cn.noty.pages.SingUpPage

@Composable
fun NavGraph(navHostController : NavHostController, modifier: Modifier){
    NavHost(navController = navHostController, startDestination = "noty_page"){
        composable(route = "login_page") {
            LoginPage()
        }
        composable(route = "sign_up_page") {
            SingUpPage()
        }
        composable(route = "create_note_page") {
            CreateNotePage()
        }
        composable(route = "noty_page") {
            NotyPage(modifier)
        }
    }
}


