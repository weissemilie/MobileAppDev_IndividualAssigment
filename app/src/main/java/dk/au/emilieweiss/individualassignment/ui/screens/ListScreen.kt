package dk.au.emilieweiss.individualassignment.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dk.au.emilieweiss.individualassignment.R
import dk.au.emilieweiss.individualassignment.data.Book
import dk.au.emilieweiss.individualassignment.data.Genre
import dk.au.emilieweiss.individualassignment.ui.components.BookListItem
import dk.au.emilieweiss.individualassignment.ui.preview.PreviewData
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme
import dk.au.emilieweiss.individualassignment.ui.theme.appTopAppBarColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    genre: Genre,
    books: List<Book>,
    onBack: () -> Unit,
    onBookClick: (Book) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = appTopAppBarColors(),
                title = { Text(genre.displayName) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back)
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(books, key = { it.id }) { book ->
                BookListItem(book = book, onClick = { onBookClick(book) })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    IndividualAssignmentTheme {
        ListScreen(
            genre = Genre.FANTASY,
            books = PreviewData.books,
            onBack = {},
            onBookClick = {}
        )
    }
}
