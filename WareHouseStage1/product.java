public class Product {
    // Private fields
    private String productID;
    private String name;
    private Float price;
    private Integer quantity;

    // Constructor
    public Product (String productID, String name, Float price, Integer quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getID() {return productID;}
    public String getName() {return name;}
    public Float getPrice() {return price;}
    public Integer getQuantity() {return quantity;}

    // Operations
    public void modifyQuantity(Integer amount) {
        this.quantity += amount;
    }
    public void setQuantity(Integer amount) {
        this.quantity = amount;
    }
}