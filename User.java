import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    // Constructors
    User(){
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
    }

    // Setters & getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
        System.out.println("This media has been added to the purchase media list");
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    // Methods
    public void addToCart(Media media, String mediaType){
        shoppingCart.add(media);
            System.out.println("* A new " + mediaType + " has been added to your cart, " + username);
    }

    public void removeFromCart(Media media, String mediaType){
        shoppingCart.remove(media);
        System.out.println("- A " + mediaType + " been removed from your cart, " + username);
    }

    public void checkOut(){
        purchaseMediaList.addAll(shoppingCart);// Add all the elements of the shopping cart to the purchased media list
        shoppingCart.clear();// Empty yhe shopping cart
        System.out.println("** Checkout complete. Your purchased media list has been updated, " + username);
    }

    // Method to display purchased media
    public void displayPurchasedMedia() {
        System.out.println("*** Purchased media for " + username + ":");
        for (Media media : purchaseMediaList) {
            System.out.println("- " + media.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Username: " + username
                + "\nEmail: " + email
                + "\nPurchaseMediaList: " + purchaseMediaList
                + "\nShoppingCart: " + shoppingCart;
    }
}