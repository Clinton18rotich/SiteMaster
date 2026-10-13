package com.clinton.sitemaster.ui.screens.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("SiteMaster", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(8.dp))
        Text("Dashboard", style = MaterialTheme.typography.bodyLarge)
        
        Spacer(Modifier.height(24.dp))
        
        Button(onClick = { navController.navigate("diary") }, modifier = Modifier.fillMaxWidth()) {
            Text("Diary")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("labour") }, modifier = Modifier.fillMaxWidth()) {
            Text("Labour")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("materials") }, modifier = Modifier.fillMaxWidth()) {
            Text("Materials")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("concrete") }, modifier = Modifier.fillMaxWidth()) {
            Text("Concrete")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("inspections") }, modifier = Modifier.fillMaxWidth()) {
            Text("Inspections")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("ncr") }, modifier = Modifier.fillMaxWidth()) {
            Text("NCRs")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("report") }, modifier = Modifier.fillMaxWidth()) {
            Text("Report")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { navController.navigate("settings") }, modifier = Modifier.fillMaxWidth()) {
            Text("Settings")
        }
    }
}
