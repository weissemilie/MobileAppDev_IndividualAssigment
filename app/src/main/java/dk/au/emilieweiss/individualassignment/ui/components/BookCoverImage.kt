package dk.au.emilieweiss.individualassignment.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter
import coil3.memory.MemoryCache
import coil3.request.ImageRequest
import dk.au.emilieweiss.individualassignment.data.Book
import dk.au.emilieweiss.individualassignment.data.CoverSize
import dk.au.emilieweiss.individualassignment.ui.theme.genreColor

@Composable
fun BookCoverImage(
    book: Book,
    coverSize: CoverSize,
    size: Dp,
    modifier: Modifier = Modifier,
    aspectRatio: Float = 1f
) {
    val height = size / aspectRatio
    val url = book.coverUrl(coverSize)
    // Det mindre billede fra listen ligger allerede i cachen og vises, mens det store hentes
    val request = ImageRequest.Builder(LocalContext.current)
        .data(url)
        .placeholderMemoryCacheKey(MemoryCache.Key(book.coverUrl(CoverSize.M)))
        .build()
    var showImage by remember(url) { mutableStateOf(false) }

    Box(modifier = modifier.size(width = size, height = height)) {
        // Forbogstavet vises, mens billedet hentes, og hvis hentningen fejler
        if (!showImage) {
            BookCover(title = book.title, color = genreColor(book.genre), size = size, height = height)
        }
        AsyncImage(
            model = request,
            contentDescription = book.title,
            contentScale = ContentScale.Crop,
            onState = { state ->
                showImage = state is AsyncImagePainter.State.Success ||
                    (state is AsyncImagePainter.State.Loading && state.painter != null)
            },
            modifier = Modifier
                .size(width = size, height = height)
                .clip(RoundedCornerShape(minOf(size, height) * 0.15f))
        )
    }
}
