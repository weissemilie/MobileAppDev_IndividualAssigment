package dk.au.emilieweiss.individualassignment.data

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val year: Int,
    val genre: Genre,
    val pages: Int,
    val isbn: String,
    val summary: String,
    val isBorrowed: Boolean
)
