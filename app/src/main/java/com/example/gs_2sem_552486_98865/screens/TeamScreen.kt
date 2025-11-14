package com.example.gs_2sem_552486_98865.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TeamScreen(modifier: Modifier = Modifier, navController: NavController) {

    Column(
        modifier = modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Equipe")

        Spacer(Modifier.height(20.dp))

        Text("Aluno: Enzo Luciano Duarte — RM552486")
        Text("Aluno: Ronaldo Kozan Junior — RM98865")

        Spacer(Modifier.height(40.dp))

        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Voltar")
        }
    }
}
