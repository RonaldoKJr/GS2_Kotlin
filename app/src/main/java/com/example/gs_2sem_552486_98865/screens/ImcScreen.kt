package com.example.gs_2sem_552486_98865.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gs_2sem_552486_98865.utils.calcularImc
import com.example.gs_2sem_552486_98865.utils.determinarClassificacaoIMC

@Composable
fun ImcScreen(modifier: Modifier = Modifier, navController: NavController) {

    var name by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Seu nome") })
        OutlinedTextField(value = weight, onValueChange = { weight = it }, label = { Text("Peso (kg)") })
        OutlinedTextField(value = height, onValueChange = { height = it }, label = { Text("Altura (m)") })

        Button(
            onClick = {
                val w = weight.replace(",", ".").toDoubleOrNull()
                val h = height.replace(",", ".").toDoubleOrNull()

                if (w != null && h != null) {
                    val imc = calcularImc(h, w)
                    val classif = determinarClassificacaoIMC(imc)
                    result = "Olá $name! Seu IMC é %.2f (%s)".format(imc, classif)
                }
            },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text("Calcular")
        }

        Text(result, modifier = Modifier.padding(top = 24.dp))

        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp)
        ) {
            Text("Voltar")
        }
    }
}
