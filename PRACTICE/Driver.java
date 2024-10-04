import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();

        // Test Case 1: User Registration
        System.out.println("=== User Registration ===");
        System.out.println("Enter username: ");
        String username1 = scanner.nextLine();
        System.out.println("Enter email: ");
        String email1 = scanner.nextLine();
        System.out.println("Enter password: ");
        String password1 = scanner.nextLine();

        if (userManagement.registerUser(email1, username1, password1)) {
            System.out.println(username1 + " successfully registered!");
        } else {
            System.out.println("Failed to register " + username1 + ".");
        }

        // Test Case 2: Attempt to register the same user
        System.out.println("\n=== Attempt to Register Same User ===");
        System.out.println("Enter username: ");
        String username2 = scanner.nextLine();
        System.out.println("Enter email: ");
        String email2 = scanner.nextLine();
        System.out.println("Enter password: ");
        String password2 = scanner.nextLine();

        if (userManagement.registerUser(email2, username2, password2)) {
            System.out.println(username2 + " successfully registered!");
        } else {
            System.out.println("Failed to register " + username2 + ".");
        }

        // Test Case 3: Listing Registered Users
        System.out.println("\n=== List Registered Users ===");
        userManagement.listUsers();

        // Test Case 4: User Adding Products to Cart
        System.out.println("\n=== Adding Products to Cart ===");
        Product product1 = new Product("Cookie", 2.00, 1);
        Product product2 = new Product("Soda", 3.00, 2);
        Cart userCart = new Cart();

        userCart.add(product1);
        userCart.add(product2);
        userCart.listAllProducts();

        // Test Case 5: Remove a Product from Cart
        System.out.println("\n=== Remove Product from Cart ===");
        userCart.remove(product1);
        userCart.listAllProducts();

        // Test Case 6: Clear the Cart
        System.out.println("\n=== Clear Cart ===");
        userCart.clearCart();
        userCart.listAllProducts();

        // Clean up scanner
        scanner.close();
    }
}
