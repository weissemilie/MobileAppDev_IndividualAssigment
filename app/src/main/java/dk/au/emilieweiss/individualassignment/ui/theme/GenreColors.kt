package dk.au.emilieweiss.individualassignment.ui.theme

import androidx.compose.ui.graphics.Color
import dk.au.emilieweiss.individualassignment.data.Genre

fun genreColor(genre: Genre): Color = when (genre) {
    Genre.FANTASY -> FantasyPlum
    Genre.KRIMI -> KrimiBurgundy
    Genre.SCIENCE_FICTION -> SciFiBlue
}
