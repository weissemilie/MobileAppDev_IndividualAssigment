package dk.au.emilieweiss.individualassignment

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dk.au.emilieweiss.individualassignment.data.Genre
import dk.au.emilieweiss.individualassignment.ui.screens.MainScreen
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme
import dk.au.emilieweiss.individualassignment.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        setContent {
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            IndividualAssignmentTheme {
                MainScreen(
                    genres = uiState.genres,
                    bookCounts = uiState.bookCounts,
                    onGenreClick = ::openGenre
                )
            }
        }
    }

    private fun openGenre(genre: Genre) {
        val intent = Intent(this, ListActivity::class.java)
        intent.putExtra(ListActivity.EXTRA_GENRE, genre.name)
        startActivity(intent)
    }
}
