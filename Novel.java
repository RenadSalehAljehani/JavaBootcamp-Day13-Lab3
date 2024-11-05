public class Novel extends Book{
    private String genre;

    // Constructor
    Novel(){
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    // Getter & setter
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override getMediaType() method from the super class Media
    public String getMediaType(){
        String message ;
        if(isBestSeller()) {
            message = "Bestselling Novel";
        }else {
            message = "Novel";
        }
        return message;
    }

    @Override
    public String toString() {
        return super.toString() // Override toString() method from the super class Media
                + "\nNovel genre: " + genre;
    }
}