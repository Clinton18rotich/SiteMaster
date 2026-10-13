package com.clinton.sitemaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.clinton.sitemaster.ui.navigation.SiteMasterNav
import com.clinton.sitemaster.ui.theme.SiteMasterTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SiteMasterTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    SiteMasterNav()
                }
            }
        }
    }
}
