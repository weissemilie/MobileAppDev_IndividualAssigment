package dk.au.emilieweiss.individualassignment.data

enum class CoverSize(val code: String) { S("S"), M("M"), L("L") }

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
) {
    // default=false gør, at Open Library svarer 404 i stedet for et tomt billede, når forsiden mangler
    fun coverUrl(size: CoverSize = CoverSize.M): String =
        "https://covers.openlibrary.org/b/isbn/${isbn.replace("-", "")}-${size.code}.jpg?default=false"
}
