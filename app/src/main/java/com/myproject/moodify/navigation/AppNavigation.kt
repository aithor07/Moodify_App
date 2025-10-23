package com.myproject.moodify.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.myproject.moodify.screens.LogOrRegisterScreen
import com.myproject.moodify.screens.LoginScreen
import com.myproject.moodify.screens.Screen3


@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){

        composable(route = AppScreens.FirstScreen.route){
            LoginScreen(navController)
        }

        composable(route = AppScreens.SecondScreen.route){

            LogOrRegisterScreen(navController)

        }

        composable(route = AppScreens.ThirdScreen.route){
            Screen3(navController)

        }

    }
}