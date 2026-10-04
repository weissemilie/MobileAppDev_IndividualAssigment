package dk.au.emilieweiss.individualassignment.ui.components

import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dk.au.emilieweiss.individualassignment.data.BookRepository
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme

@Composable
fun BookListItem(
    title: String,
    author: String,
    year: Int,
    modifier: Modifier = Modifier
) {
    ListItem(
        headlineContent = { Text(title) },
        supportingContent = { Text(author) },
        trailingContent = { Text(year.toString()) },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun BookListItemPreview() {
    val book = BookRepository.getBookById(1)!!
    IndividualAssignmentTheme {
        BookListItem(title = book.title, author = book.author, year = book.year)
    }
}
