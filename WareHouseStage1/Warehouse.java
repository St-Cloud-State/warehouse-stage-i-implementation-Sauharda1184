package WarehouseSystem;
public class Warehouse {
    // Private fields
    Integer nextClientID;
    Integer nextProductID;
    ClientList clientList;
    ProductList productList;
    private static Warehouse warehouse;

    // Constructor
    private Warehouse(){ // Private to enforce singleton
        clientList = ClientList.instance();
        productList = ProductList.instance();
        nextClientID = 0;
        nextProductID = 0;
    };

    // Operations
    public static Warehouse instance() { // Creation method
        if (warehouse == null) {
            return (warehouse = new Warehouse());
        }
        else {
            return warehouse;
        }
    }

    public Client addClient(String name, String email) {
        Client client = new Client(Integer.toString(nextClientID), name, email);
        nextClientID++;
        if (clientList.addClient(client)) {
            return client;
        }
        return null;
    }

    public Product addProduct(String name, Float price, Integer quantity) {
        Product product = new Product(Integer.toString(nextProductID), name, price, quantity);
        nextProductID++;
        if (productList.addProduct(product)) {
            return product;
        }
        return null;
    }

    public Client findClient(String clientID) {
        return clientList.getClient(clientID);
    }
    public Product findProduct(String productID) {
        return productList.getProduct(productID);
    }

}