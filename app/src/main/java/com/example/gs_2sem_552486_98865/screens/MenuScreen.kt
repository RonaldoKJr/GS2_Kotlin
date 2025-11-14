package com.example.gs_2sem_552486_98865.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = { navController.navigate("imc") },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Text("Cálculo de IMC")
        }

        Button(
            onClick = { navController.navigate("team") },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Text("Equipe")
        }

        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Text("Voltar")
        }
    }
}
