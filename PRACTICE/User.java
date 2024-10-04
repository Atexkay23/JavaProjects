

public class User {
    private String email;
    private String username;
    private String password;
    private Cart cart;

    public User(String email, String username, String password, Cart cart) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.cart = cart;
    }

    // Validation methods
    public boolean isValid(String username) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (username.length() > 10) {
            return false;
        }
        if (!username.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        return true;
    }

    public boolean isValidEmail(String email) {
        if (email.length() > 20 || email == null || email.isEmpty()) {
            return false;
        }
        return email.contains("@") && email.contains(".com");
    }

    public boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 20) {
            return false; // Minimum length check
        }
        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*") || 
            !password.matches(".*[0-9].*") || !password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false; // Check for required characters
        }
        return true; // Password is valid if all checks pass
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return username;
    }
}
