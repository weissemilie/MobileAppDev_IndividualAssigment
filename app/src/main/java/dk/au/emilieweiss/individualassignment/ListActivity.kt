package dk.au.emilieweiss.individualassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dk.au.emilieweiss.individualassignment.data.Genre
import dk.au.emilieweiss.individualassignment.ui.screens.ListScreen
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val genreName = intent.getStringExtra(EXTRA_GENRE)
        val genre = Genre.entries.find { it.name == genreName }
        if (genre == null) {
            finish()
            return
        }

        enableEdgeToEdge()
        setContent {
            IndividualAssignmentTheme {
                ListScreen(genre = genre)
            }
        }
    }

    companion object {
        const val EXTRA_GENRE = "dk.au.emilieweiss.individualassignment.EXTRA_GENRE"
    }
}
