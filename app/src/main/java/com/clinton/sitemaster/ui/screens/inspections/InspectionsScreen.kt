package com.clinton.sitemaster.ui.screens.inspections

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun InspectionsScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Inspections", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))
        Text("Coming soon - full implementation in next phase")
        Spacer(Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
    }
}
