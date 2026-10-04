package dk.au.emilieweiss.individualassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dk.au.emilieweiss.individualassignment.ui.screens.MainScreen
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IndividualAssignmentTheme {
                MainScreen()
            }
        }
    }
}
