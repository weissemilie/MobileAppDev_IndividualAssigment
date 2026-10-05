package dk.au.emilieweiss.individualassignment.ui.preview

import dk.au.emilieweiss.individualassignment.data.Book
import dk.au.emilieweiss.individualassignment.data.Genre

// Eksempeldata kun til @Preview, så skærmene ikke afhænger af BookRepository
object PreviewData {
    val books = listOf(
        Book(
            id = 1,
            title = "The Hobbit",
            author = "J.R.R. Tolkien",
            year = 1937,
            genre = Genre.FANTASY,
            pages = 300,
            isbn = "978-0-547-92822-7",
            summary = "Hobbitten Bilbo Sækker bliver hevet ud af sit trygge liv af troldmanden Gandalf og tretten dværge, der vil generobre deres skat fra dragen Smaug.",
            isBorrowed = false
        ),
        Book(
            id = 2,
            title = "Harry Potter and the Philosopher's Stone",
            author = "J.K. Rowling",
            year = 1997,
            genre = Genre.FANTASY,
            pages = 223,
            isbn = "978-0-7475-3269-9",
            summary = "På sin 11-års fødselsdag finder Harry ud af, at han er troldmand, og begynder på Hogwarts, hvor han opdager sandheden om sine forældres død.",
            isBorrowed = true
        )
    )
}
