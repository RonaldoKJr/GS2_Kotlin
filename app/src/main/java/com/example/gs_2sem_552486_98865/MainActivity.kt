package com.example.gs_2sem_552486_98865

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gs_2sem_552486_98865.screens.ImcScreen
import com.example.gs_2sem_552486_98865.screens.LoginScreen
import com.example.gs_2sem_552486_98865.screens.MenuScreen
import com.example.gs_2sem_552486_98865.screens.TeamScreen
import  com.example.gs_2sem_552486_98865.ui.theme.GS_2sem_552486_98865Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            GS_2sem_552486_98865Theme{
                Scaffold(modifier = Modifier.fillMaxSize()) { padding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {

                        composable("login") {
                            LoginScreen(
                                modifier = Modifier.padding(padding),
                                navController
                            )
                        }

                        composable("menu") {
                            MenuScreen(
                                modifier = Modifier.padding(padding),
                                navController
                            )
                        }

                        composable("imc") {
                            ImcScreen(
                                modifier = Modifier.padding(padding),
                                navController
                            )
                        }

                        composable("team") {
                            TeamScreen(
                                modifier = Modifier.padding(padding),
                                navController
                            )
                        }
                    }
                }
            }
        }
    }
}
