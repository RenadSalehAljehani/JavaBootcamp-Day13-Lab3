public class Review {
    private String username;
    private Double rating;
    private String comment;

    // Constructors
    Review(){

    }

    public Review(String username, double rating, String comment) {
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }

    // Getters & setters
    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "{Username: " + username
                + ", Rating: " + rating
                + ", Comment: " + comment
                + "}\n";
    }
}