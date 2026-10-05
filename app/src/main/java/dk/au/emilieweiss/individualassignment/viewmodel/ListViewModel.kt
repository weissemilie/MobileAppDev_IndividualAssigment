package dk.au.emilieweiss.individualassignment.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dk.au.emilieweiss.individualassignment.ListActivity
import dk.au.emilieweiss.individualassignment.data.Book
import dk.au.emilieweiss.individualassignment.data.BookRepository
import dk.au.emilieweiss.individualassignment.data.Genre
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ListUiState(
    val genre: Genre,
    val books: List<Book>
)

class ListViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    // null betyder, at Intent ikke indeholdt en gyldig genre
    private val _uiState = MutableStateFlow(loadUiState(savedStateHandle))
    val uiState: StateFlow<ListUiState?> = _uiState.asStateFlow()

    private fun loadUiState(savedStateHandle: SavedStateHandle): ListUiState? {
        val genreName = savedStateHandle.get<String>(ListActivity.EXTRA_GENRE)
        val genre = Genre.entries.find { it.name == genreName } ?: return null
        return ListUiState(genre = genre, books = BookRepository.getBooksByGenre(genre))
    }
}
