package WareHouse;

import java.util.*;

public class Client {
    // Private fields
    private String clientID;
    private String name;
    private String email;
    private List<Product> wishlist = new LinkedList<Product>();

    // Constructor
    public Client (String clientID, String name, String email) {
        this.clientID = clientID;
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getID() {return clientID;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public List<Product> getWishlist() {return wishlist;}

    // Operations
    public void addToWishlist(Product product) {
        this.wishlist.add(product);
    }
}