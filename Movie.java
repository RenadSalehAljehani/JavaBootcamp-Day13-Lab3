import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    // Constructors
    Movie(){

    }

    Movie(String title, String auteur, String  ISBN , double price, int duration){
        super(title, auteur, ISBN ,price);
        this.duration =duration;
    }

    // Getter & setter
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Methods
    public void watch(User user, Movie movie){
        // Check if the movie is in the user's purchased media list
        if (!user.getPurchaseMediaList().contains(movie)) {
            // Add the movie to the user's shopping cart
            user.addToCart(this, "Movie");

            // Move movie from cart to purchase list on checkout
            user.checkOut();

            // Show purchased media
            user.displayPurchasedMedia();

        }else {
            System.out.println("You already have this movie in your purchased media list.");
        }
    }

    // This method recommends similar movies based on the director (auteur).
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        ArrayList<Movie> moviesList = new ArrayList<>();

        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                moviesList.add(movie);
            }
        }
        System.out.println("Recommended movies for director: " + this.getAuteur());
        return moviesList;
    }

    // Override getMediaType() method from the super class Media
    public String getMediaType(){
        String message ;
        if(this.duration >= 120) {
            message = "Long Movie";
        }else {
            message = "Movie";
        }
        return message;
    }

    @Override
    public String toString() {
        return super.toString() // Override toString() method from the super class Media
                + "\nMovie duration: " + duration + " minutes";
    }
}