package dk.au.emilieweiss.individualassignment

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dk.au.emilieweiss.individualassignment.ui.screens.DetailScreen
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme
import dk.au.emilieweiss.individualassignment.viewmodel.DetailViewModel

class DetailActivity : ComponentActivity() {

    private val viewModel: DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (viewModel.book.value == null) {
            finish()
            return
        }

        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        setContent {
            val book by viewModel.book.collectAsStateWithLifecycle()
            IndividualAssignmentTheme {
                book?.let { DetailScreen(book = it, onBack = ::finish) }
            }
        }
    }

    companion object {
        const val EXTRA_BOOK_ID = "dk.au.emilieweiss.individualassignment.EXTRA_BOOK_ID"
    }
}
