package WareHouse;

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
        while( it.hasNext() ) {
            System.out.println("list has next");
            Product i = it.next();
            System.out.print("comparing " );
            System.out.println(i.getID());
            System.out.print("with ");
            System.out.println(productID);
            System.out.println(i.getID() == productID);
            if( i.getID() == productID) {
                System.out.println("found it");
                return i;
            }
        }
        return null;
    }
}