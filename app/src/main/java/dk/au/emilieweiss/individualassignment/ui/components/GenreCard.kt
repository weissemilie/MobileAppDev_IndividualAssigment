package dk.au.emilieweiss.individualassignment.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dk.au.emilieweiss.individualassignment.R
import dk.au.emilieweiss.individualassignment.data.Genre
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme
import dk.au.emilieweiss.individualassignment.ui.theme.genreColor

@Composable
fun GenreCard(
    genre: Genre,
    bookCount: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = genreColor(genre),
            contentColor = Color.White
        ),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 28.dp)) {
            Text(
                text = genre.displayName,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = pluralStringResource(R.plurals.book_count, bookCount, bookCount),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview
@Composable
fun GenreCardPreview() {
    IndividualAssignmentTheme {
        GenreCard(genre = Genre.FANTASY, bookCount = 5, onClick = {})
    }
}
