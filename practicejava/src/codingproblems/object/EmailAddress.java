package codingproblems.object;

//To prevent bad data in immutable objects, you typically perform validation checks in the constructor of the immutable class.
// Here's an example program illustrating this:

public record EmailAddress(String address) {
    public EmailAddress {
        // Validation checks
        if (address == null || !isValidEmail(address)) {
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    @Override
    public String toString() {
        return STR."EmailAddress{address='\{address}\{'\''}\{'}'}";
    }

    // Method to validate email address format
    private boolean isValidEmail(String email) {
        // Basic email validation (you can use more advanced checks)
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}
