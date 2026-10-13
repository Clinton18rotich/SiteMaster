package com.clinton.sitemaster.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.clinton.sitemaster.ui.screens.dashboard.DashboardScreen
import com.clinton.sitemaster.ui.screens.diary.DiaryScreen
import com.clinton.sitemaster.ui.screens.labour.LabourScreen
import com.clinton.sitemaster.ui.screens.materials.MaterialsScreen
import com.clinton.sitemaster.ui.screens.concrete.ConcreteScreen
import com.clinton.sitemaster.ui.screens.inspections.InspectionsScreen
import com.clinton.sitemaster.ui.screens.ncr.NCRScreen
import com.clinton.sitemaster.ui.screens.report.ReportScreen
import com.clinton.sitemaster.ui.screens.settings.SettingsScreen

@Composable
fun SiteMasterNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") { DashboardScreen(navController) }
        composable("diary") { DiaryScreen(navController) }
        composable("labour") { LabourScreen(navController) }
        composable("materials") { MaterialsScreen(navController) }
        composable("concrete") { ConcreteScreen(navController) }
        composable("inspections") { InspectionsScreen(navController) }
        composable("ncr") { NCRScreen(navController) }
        composable("report") { ReportScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
    }
}
