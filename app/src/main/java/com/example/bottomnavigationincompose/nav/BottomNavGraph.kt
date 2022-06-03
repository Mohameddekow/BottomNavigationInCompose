package com.example.bottomnavigationincompose.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationincompose.BottomBarScreen
import com.example.bottomnavigationincompose.screens.HomeScreen
import com.example.bottomnavigationincompose.screens.ProfileScreen
import com.example.bottomnavigationincompose.screens.SettingScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.HomeScreen.route
    ){

        composable(route = BottomBarScreen.HomeScreen.route){
            HomeScreen()
        }

        composable(route = BottomBarScreen.ProfileScreen.route){
            ProfileScreen()
        }

        composable(route = BottomBarScreen.SettingScreen.route){
            SettingScreen()
        }
    }
}