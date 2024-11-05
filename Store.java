import java.util.ArrayList;

public class Store {
    private ArrayList<User>  user;
    private ArrayList<Media> media;

    // Getter & setters
    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User>  user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    // Methods
    public void addUser(User user){
        this.user.add(user);
    }

    public ArrayList<User> displayUsers(){
        return this.user;
    }

    public void addMedia(Media media){
        this.media.add(media);
    }

    public ArrayList<Media> displayMedias(){
        return this.media;
    }

    public Book searchBook(String title){
        for (Media m : media) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return (Book) m; // Return the book if found
            }
        }
        return null; // Return null if no book is found
    }

    @Override
    public String toString() {
        return "Users list: " + user +
                "\nMedia list: " + media;
    }
}