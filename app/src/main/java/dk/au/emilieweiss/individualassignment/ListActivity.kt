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
import dk.au.emilieweiss.individualassignment.data.Book
import dk.au.emilieweiss.individualassignment.ui.screens.ListScreen
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme
import dk.au.emilieweiss.individualassignment.viewmodel.ListViewModel

class ListActivity : ComponentActivity() {

    private val viewModel: ListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (viewModel.uiState.value == null) {
            finish()
            return
        }

        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        setContent {
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            IndividualAssignmentTheme {
                uiState?.let { state ->
                    ListScreen(
                        genre = state.genre,
                        books = state.books,
                        onBack = ::finish,
                        onBookClick = ::openBook
                    )
                }
            }
        }
    }

    private fun openBook(book: Book) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_BOOK_ID, book.id)
        startActivity(intent)
    }

    companion object {
        const val EXTRA_GENRE = "dk.au.emilieweiss.individualassignment.EXTRA_GENRE"
    }
}
