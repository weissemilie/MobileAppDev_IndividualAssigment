package dk.au.emilieweiss.individualassignment.viewmodel

import androidx.lifecycle.ViewModel
import dk.au.emilieweiss.individualassignment.data.BookRepository
import dk.au.emilieweiss.individualassignment.data.Genre
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class MainUiState(
    val genres: List<Genre>,
    val bookCounts: Map<Genre, Int>
)

class MainViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(loadUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    private fun loadUiState(): MainUiState {
        val genres = BookRepository.getGenres()
        return MainUiState(
            genres = genres,
            bookCounts = genres.associateWith { BookRepository.getBooksByGenre(it).size }
        )
    }
}
