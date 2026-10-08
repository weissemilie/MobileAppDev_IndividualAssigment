package dk.au.emilieweiss.individualassignment.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dk.au.emilieweiss.individualassignment.data.Genre
import dk.au.emilieweiss.individualassignment.ui.theme.IndividualAssignmentTheme
import dk.au.emilieweiss.individualassignment.ui.theme.genreColor

@Composable
fun BookCover(
    title: String,
    color: Color,
    size: Dp,
    height: Dp = size,
    modifier: Modifier = Modifier
) {
    val fontSize = with(LocalDensity.current) { (minOf(size, height) * 0.45f).toSp() }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(width = size, height = height)
            .clip(RoundedCornerShape(minOf(size, height) * 0.15f))
            .background(color)
    ) {
        Text(
            text = title.take(1).uppercase(),
            color = Color.White,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun BookCoverPreview() {
    IndividualAssignmentTheme {
        BookCover(title = "Dune", color = genreColor(Genre.SCIENCE_FICTION), size = 64.dp)
    }
}
