import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    ArrayList<Product> arrayOfProducts = new ArrayList<>();

    public void add(Product p) {
        if (arrayOfProducts.contains(p)) {
            System.out.println(p + " already in cart!");
        } else {
            arrayOfProducts.add(p);
            System.out.println(p + " Successfully added!");
        }
    }

    public void remove(Product p) {
        Iterator<Product> iterate = arrayOfProducts.iterator();
        while (iterate.hasNext()) {
            Product product = iterate.next();
            if (product.getName().equals(p.getName())) {
                iterate.remove();
                System.out.println(product.getName() + " successfully removed");
                return; // Exit after removing the product
            }
        }
        System.out.println(p + " not found in cart!");
    }

    public void listAllProducts() {
        if (arrayOfProducts.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            System.out.println("Cart list: " + arrayOfProducts);
        }
    }

    public void clearCart() {
        arrayOfProducts.clear();
        System.out.println("Cart successfully cleared!");
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product product : arrayOfProducts) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}
