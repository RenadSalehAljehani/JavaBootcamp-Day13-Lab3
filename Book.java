import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> reviews = new ArrayList<>();

    // Constructors
    Book(){

    }

    Book(String title, String auteur, String  ISBN , double price, int stock){
        super(title, auteur, ISBN ,price);
        this.stock =stock;
    }

    // Getter & setter
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {
        return reviews;
    }

    public void setReview(ArrayList<Review> review) {
        this.reviews = review;
    }

    // Methods
    public void addReview(Review review){
        reviews.add(review);
    }

    // Method to calculate the average user rating
    public double getAverageRating(){
        double sumOfRating = 0.0;
        double averageRating = 0.0;
        Review review;
        double rating;

        for(int i = 0; i < reviews.size() ; i++){
            review = reviews.get(i);
            rating  = review.getRating();
            sumOfRating = sumOfRating + rating;
        }
        averageRating = sumOfRating / reviews.size();

        return averageRating;
    }

    // Method to allow users to add the book to the purchased list
    public void purchase(User user, Book book){
        // Check if the book is in stock before purchasing
        if (stock > 0) {
            // Add the book to the user's shopping cart
            user.addToCart(this, "Book");

            // Move book from cart to purchase list on checkout
            user.checkOut();

            // Show purchased media
            user.displayPurchasedMedia();

            // Decrease book stock by 1
            this.stock--;
        } else {
            System.out.println("# This book is out of stock!");
        }
    }

    // Method TO checks if a book is a bestseller or not
    public boolean isBestSeller(){
        boolean isBestseller;

        if(getAverageRating() >= 4.5){
            isBestseller = true;
        }else {
            isBestseller = false;
        }
        return isBestseller;
    }

    // Method to restock books
    public void restock(int quantity){
        this.stock = this.stock + quantity;
        System.out.println("> Restocked " + quantity + " books. New stock: " + stock);
    }

    // Override getMediaType() method from the super class Media
    public String getMediaType(){
        String message ;
        if(isBestSeller()) {
            message = "Bestselling Book";
        }else {
            message = "Book";
        }
        return message;
    }

    @Override
    public String toString() {
        return super.toString() // Override toString() method from the super class Media
                + "\nBook stock: " + stock
                + "\nBook reviews: " + reviews
                + "\nAverage rating: " + getAverageRating();
    }
}