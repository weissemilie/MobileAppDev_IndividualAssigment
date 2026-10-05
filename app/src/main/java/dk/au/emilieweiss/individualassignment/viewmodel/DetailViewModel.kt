package dk.au.emilieweiss.individualassignment.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dk.au.emilieweiss.individualassignment.DetailActivity
import dk.au.emilieweiss.individualassignment.data.Book
import dk.au.emilieweiss.individualassignment.data.BookRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    // null betyder, at Intent ikke indeholdt et gyldigt bog-id
    private val _book = MutableStateFlow(
        savedStateHandle.get<Int>(DetailActivity.EXTRA_BOOK_ID)?.let { BookRepository.getBookById(it) }
    )
    val book: StateFlow<Book?> = _book.asStateFlow()
}
