import java.util.*;

public class ProductList {
    // Private fields
    private static ProductList productList;
    private List<Product> products = new LinkedList<Product>();

    // Constructor
    private ProductList(){}; // Private to enforce singleton

    // Operations
    public static ProductList instance() { // Creation method
        if (productList == null) {
            return (productList = new ProductList());
        }
        else {
            return productList;
        }
    }

    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }

    public Product getProduct(String productID) {
        Iterator<Product> it = products.iterator();
        while( it.hasNext()) {
            Product i = it.next();
            if( i.getID() == productID) {
                return i;
            }
        }
        return null;
    }
}