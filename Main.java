import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // 1. Book class testing
        //  New Book object using default constructor
        Book book1 = new Book();
        // Setting values
        book1.setTitle("Emotional intelligence Book");
        book1.setAuteur("Sara Maher");
        book1.setISBN("1234567890");
        book1.setPrice(40);
        book1.setStock(100);

        // Print book info
        System.out.println("\n-------------------------------First Book-------------------------------"
                + "\nTitle: " + book1.getTitle()
                + "\nAuteur: " + book1.getAuteur()
                + "\nISBN: " + book1.getISBN()
                + "\nPrice: " + book1.getPrice()
                + "\nStock: " + book1.getStock());

        //---------------------------------------------------------------------------------------
        // 2. User class testing
        //  New User object using default constructor
        User user1 = new User();
        // Setting values
        user1.setUsername("Rama");
        user1.setEmail("rama@gmail.com");

        //  New User object using parameterized constructor
        User user2 = new User("Ahmad", "ahmad43@gmail.com");

        // Test purchasing book1 by the two users
        System.out.println("----------------------------------" + user1.getUsername() + "----------------------------------");
        book1.purchase(user1, book1);

        System.out.println("----------------------------------" + user2.getUsername() + "----------------------------------");
        book1.purchase(user2, book1);
        //---------------------------------------------------------------------------------------
        // 3. Review class testing
        //  New Review object using default constructor
        Review review1 = new Review();
        // Setting values using setters
        review1.setUserName(user1.getUsername());
        review1.setRating(4.5);
        review1.setComment("Excellent book and easy to read.");

        //  New Review object using parameterized constructor
        Review review2 = new Review(user2.getUsername(), 4.1, "Very informative.");

        // Add new book reviews
        book1.addReview(review1);
        book1.addReview(review2);

        // Printing the result
        System.out.println("---------------------------First Book Update----------------------------"
                + book1.toString()
                + "\n" + book1.getMediaType());


        //---------------------------------------------------------------------------------------
        // 4. Movie class testing
        //  New Movie object
        Movie movie1 = new Movie();

        // Setting values
        movie1.setTitle("Split Movie");
        movie1.setAuteur("M. Night Shyamalan");
        movie1.setISBN("12765398763");
        movie1.setPrice(70);
        movie1.setDuration(116);

        // Print movie info
        System.out.println("------------------------------First Movie-------------------------------"
                + movie1.toString()
                + "\n" + movie1.getMediaType());

        // Test purchasing movie1 by the two users
        System.out.println("----------------------------------" + user1.getUsername() + "----------------------------------");
        movie1.watch(user1, movie1);

        System.out.println("----------------------------------" + user2.getUsername() + "----------------------------------");
        movie1.watch(user2, movie1);

        //  New Movie objects
        Movie movie2 = new Movie("After Earth Movie", "M. Night Shyamalan", "1265439872", 60, 120);
        Movie movie3 = new Movie("Titanic Movie", "James Cameron", "1265787938", 60, 190);
        Movie movie4 = new Movie("Avatar Movie", "James Cameron", "1376567383", 40, 130);
        Movie movie5 = new Movie("Dunkirk Movie", "Christopher Nolan", "1342768463", 55, 90);

        // Adding them to a movie catalog
        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);
        movieCatalog.add(movie3);
        movieCatalog.add(movie4);
        movieCatalog.add(movie5);

        System.out.println("--------------------------Recommended Movies---------------------------");

        // Test: recommend movies by the same director as movie1
        ArrayList<Movie> recommendedMovies = (ArrayList<Movie>) movie1.recommendSimilarMovies(movieCatalog);

        // Print the recommended movies
        for (Movie movie : recommendedMovies) {
            System.out.println(movie.getTitle());
        }
        //---------------------------------------------------------------------------------------
        // 5. Music class testing
        //  New Music object
        Music music1 = new Music();

        // Setting values
        music1.setTitle("Dandelions Song");
        music1.setAuteur("Ruth B.");
        music1.setISBN("1542876528");
        music1.setPrice(10);
        music1.setArtist("Ruth B.");

        // Print music info
        System.out.println("\n------------------------------First Music-------------------------------"
                + music1.toString()
                + "\n" + music1.getMediaType());

        // Test purchasing music1 by the two users
        System.out.println("----------------------------------" + user1.getUsername() + "----------------------------------");
        music1.listen(user1, music1);

        System.out.println("----------------------------------" + user2.getUsername() + "----------------------------------");
        music1.listen(user2, music1);

        //  New Musics objects
        Music music2 = new Music("Lost Boy Song", "Ruth B.", "1542876529", 8, "Ruth B.");
        Music music3 = new Music("Someone Like You Song", "Adele", "12542782652", 12, "Adele");
        Music music4 = new Music("Rolling in the Deep Song", "Adele", "1367635342", 10, "Adele");
        Music music5 = new Music("Castle on the Hill Song", "Ed Sheeran", "13645373863", 15, "Ed Sheeran");

        // Adding them to a music catalog
        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music3);
        musicCatalog.add(music4);
        musicCatalog.add(music5);

        System.out.println("---------------------------Musics Playlist-----------------------------");

        // Test: musics Playlist by the same director as music1
        ArrayList<Music> recommendedMusics = (ArrayList<Music>) music1.generatePlaylist(musicCatalog);

        // Print the musics Playlist
        for (Music music : recommendedMusics) {
            System.out.println(music.getTitle());
        }

        //---------------------------------------------------------------------------------------
        // 6. Novel class testing
        //  New Novel objects
        Novel novel1 = new Novel("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99, 5, "Fiction");
        Novel novel2 = new Novel("1984", "George Orwell", "9780451524935", 9.99, 3, "Dystopian");

        // Print information about the novels
        System.out.println("------------------------------First Novel------------------------------");
        System.out.println(novel1.toString());

        System.out.println("------------------------------Second Novel------------------------------");
        System.out.println(novel2.toString());

        //---------------------------------------------------------------------------------------
        // 7. AcademicBook class testing
        //  New AcademicBook objects
        AcademicBook academicBook1 = new AcademicBook("Introduction to Algorithms", "Thomas H. Cormen", "9780262033848", 59.99, 10, "Computer Science");
        AcademicBook academicBook2 = new AcademicBook("Physics for Scientists and Engineers", "Raymond A. Serway", "9781133947271", 78.00, 4, "Physics");

        // Print information about the AcademicBooks
        System.out.println("----------------------------First AcademicBook----------------------------");
        System.out.println(academicBook1.toString());

        System.out.println("----------------------------Second AcademicBook----------------------------");
        System.out.println(academicBook2.toString());
    }
}