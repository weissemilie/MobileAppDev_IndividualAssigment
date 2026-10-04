package dk.au.emilieweiss.individualassignment.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import dk.au.emilieweiss.individualassignment.data.BookRepository
import dk.au.emilieweiss.individualassignment.data.Genre
import dk.au.emilieweiss.individualassignment.ui.components.BookListItem
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(genre: Genre) {
    val books = remember(genre) { BookRepository.getBooksByGenre(genre) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(genre.displayName) })
        }
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(books, key = { it.id }) { book ->
                BookListItem(title = book.title, author = book.author, year = book.year)
                HorizontalDivider()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    IndividualAssignmentTheme {
        ListScreen(genre = Genre.FANTASY)
    }
}
