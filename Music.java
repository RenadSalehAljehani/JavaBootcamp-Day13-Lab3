import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    // Constructors
    Music(){

    }

    Music(String title, String auteur, String  ISBN , double price, String artist){
        super(title, auteur, ISBN ,price);
        this.artist =artist;
    }

    // Getter & setter
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Methods
    public void listen(User user, Music music){
        // Check if the music is in the user's purchased media list
        if (!user.getPurchaseMediaList().contains(music)) {
            // Add the music to the user's shopping cart
            user.addToCart(this, "Music");

            // Move music from cart to purchase list on checkout
            user.checkOut();

            // Show purchased media
            user.displayPurchasedMedia();
        }
        else {
            System.out.println("You already have this music in your purchased media list.");
        }
    }

    // Method to generate a playlist of similar songs based on the artist (auteur).
    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog){
        ArrayList<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(this.artist)) {
                playlist.add(music);
            }
        }
        System.out.println("Playlist generated for artist: " + this.artist);
        return playlist;
    }

    // Override getMediaType() method from the super class Media
    public String getMediaType(){
        String message ;
        if(super.getPrice() >= 10) {
            message = "Premium Music";
        }else {
            message = "Music";
        }
        return message;
    }

    @Override
    public String toString() {
        return super.toString()// Override toString() method from the super class Media
                + "\nMusic Artist: " + artist;
    }
}