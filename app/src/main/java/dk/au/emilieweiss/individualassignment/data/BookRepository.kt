package dk.au.emilieweiss.individualassignment.data

object BookRepository {

    private val books = listOf(
        // Fantasy
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
        ),
        Book(
            id = 3,
            title = "A Game of Thrones",
            author = "George R.R. Martin",
            year = 1996,
            genre = Genre.FANTASY,
            pages = 694,
            isbn = "978-0-553-10354-0",
            summary = "Adelsslægterne i Westeros kæmper om Jerntronen, mens en ældgammel trussel vågner hinsides Muren i nord.",
            isBorrowed = false
        ),
        Book(
            id = 4,
            title = "The Name of the Wind",
            author = "Patrick Rothfuss",
            year = 2007,
            genre = Genre.FANTASY,
            pages = 662,
            isbn = "978-0-7564-0407-9",
            summary = "Den legendariske Kvothe fortæller sin egen historie: fra omrejsende gøglerbarn og gadedreng til den yngste elev på magiens universitet.",
            isBorrowed = false
        ),
        Book(
            id = 5,
            title = "Mistborn: The Final Empire",
            author = "Brandon Sanderson",
            year = 2006,
            genre = Genre.FANTASY,
            pages = 541,
            isbn = "978-0-7653-1178-8",
            summary = "Gadetyven Vin opdager, at hun har evnen til at brænde metaller for at få kræfter, og bliver en del af et oprør mod den udødelige Lord Ruler.",
            isBorrowed = true
        ),

        // Krimi
        Book(
            id = 6,
            title = "The Girl with the Dragon Tattoo",
            author = "Stieg Larsson",
            year = 2005,
            genre = Genre.KRIMI,
            pages = 465,
            isbn = "978-0-307-26975-1",
            summary = "Journalisten Mikael Blomkvist og hackeren Lisbeth Salander undersøger en ung kvindes forsvinden fra en rig industrifamilie for 40 år siden.",
            isBorrowed = false
        ),
        Book(
            id = 7,
            title = "And Then There Were None",
            author = "Agatha Christie",
            year = 1939,
            genre = Genre.KRIMI,
            pages = 264,
            isbn = "978-0-06-207348-8",
            summary = "Ti fremmede lokkes til en øde ø, hvor de én efter én bliver dræbt i takt med et gammelt børnerim.",
            isBorrowed = true
        ),
        Book(
            id = 8,
            title = "Gone Girl",
            author = "Gillian Flynn",
            year = 2012,
            genre = Genre.KRIMI,
            pages = 419,
            isbn = "978-0-307-58836-4",
            summary = "Da Amy forsvinder på deres bryllupsdag, bliver hendes mand Nick hovedmistænkt, og ægteskabets mørke hemmeligheder kommer frem.",
            isBorrowed = false
        ),
        Book(
            id = 9,
            title = "The Hound of the Baskervilles",
            author = "Arthur Conan Doyle",
            year = 1902,
            genre = Genre.KRIMI,
            pages = 256,
            isbn = "978-0-14-043786-7",
            summary = "Sherlock Holmes og Dr. Watson efterforsker en forbandelse om en dæmonisk hund, der hjemsøger Baskerville-slægten på heden i Devon.",
            isBorrowed = false
        ),
        Book(
            id = 10,
            title = "The Silence of the Lambs",
            author = "Thomas Harris",
            year = 1988,
            genre = Genre.KRIMI,
            pages = 338,
            isbn = "978-0-312-02282-2",
            summary = "FBI-elev Clarice Starling søger hjælp hos den fængslede kannibal Dr. Hannibal Lecter for at fange seriemorderen Buffalo Bill.",
            isBorrowed = true
        ),

        // Science fiction
        Book(
            id = 11,
            title = "Dune",
            author = "Frank Herbert",
            year = 1965,
            genre = Genre.SCIENCE_FICTION,
            pages = 535,
            isbn = "978-0-441-17271-9",
            summary = "Paul Atreides' familie overtager ørkenplaneten Arrakis, universets eneste kilde til krydderiet, og bliver kastet ud i forræderi og en profeti.",
            isBorrowed = false
        ),
        Book(
            id = 12,
            title = "Nineteen Eighty-Four",
            author = "George Orwell",
            year = 1949,
            genre = Genre.SCIENCE_FICTION,
            pages = 328,
            isbn = "978-0-451-52493-5",
            summary = "I totalitære Oceanien, hvor Big Brother overvåger alt, gør Winston Smith stille oprør mod Partiet.",
            isBorrowed = true
        ),
        Book(
            id = 13,
            title = "The Hitchhiker's Guide to the Galaxy",
            author = "Douglas Adams",
            year = 1979,
            genre = Genre.SCIENCE_FICTION,
            pages = 224,
            isbn = "978-0-345-39180-3",
            summary = "Sekunder før Jorden rives ned for at gøre plads til en hyperrumsmotorvej, bliver Arthur Dent reddet af sin ven Ford Prefect, der er rumvæsen.",
            isBorrowed = false
        ),
        Book(
            id = 14,
            title = "Ender's Game",
            author = "Orson Scott Card",
            year = 1985,
            genre = Genre.SCIENCE_FICTION,
            pages = 324,
            isbn = "978-0-8125-5070-2",
            summary = "Det geniale barn Ender Wiggin trænes på en militærskole i rummet for at lede menneskeheden mod en fremmed art.",
            isBorrowed = false
        ),
        Book(
            id = 15,
            title = "The Martian",
            author = "Andy Weir",
            year = 2011,
            genre = Genre.SCIENCE_FICTION,
            pages = 387,
            isbn = "978-0-553-41802-6",
            summary = "Astronauten Mark Watney efterlades alene på Mars og må bruge sin opfindsomhed og humor til at overleve, indtil han kan blive reddet.",
            isBorrowed = true
        )
    )

    fun getGenres(): List<Genre> = Genre.entries

    fun getBooksByGenre(genre: Genre): List<Book> = books.filter { it.genre == genre }

    fun getBookById(id: Int): Book? = books.find { it.id == id }
}
