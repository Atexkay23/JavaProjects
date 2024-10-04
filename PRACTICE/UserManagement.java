import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> userArrayList;

    public UserManagement() {
        userArrayList = new ArrayList<>();
    }

    // Register a user with email, username, and password
    public boolean registerUser(String email, String username, String password) {
        Cart cart = new Cart();
        User user = new User(email, username, password, cart);

        if (!user.isValid(username) || !user.isValidEmail(email) || !user.isValidPassword(password)) {
            System.out.println("Invalid username, email, or password.");
            return false; // Registration failed
        }

        if (userExists(username)) {
            System.out.println("Username already taken!");
            return false; // Username already exists
        }

        userArrayList.add(user); // Successful registration
        System.out.println("Registration successful for user: " + username);
        return true; // Registration succeeded
    }

    // Check if username already exists
    private boolean userExists(String username) {
        for (User user : userArrayList) {
            if (user.getUsername().equals(username)) {
                return true; // Username exists
            }
        }
        return false; // Username is available
    }

    // List all registered users
    public void listUsers() {
        System.out.println("Registered users:");
        for (User user : userArrayList) {
            System.out.println(user.getUsername());
        }
    }
}
