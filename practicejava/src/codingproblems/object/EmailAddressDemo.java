package codingproblems.object;

public class EmailAddressDemo {
    public static void main(String[] args) {
        try {
            // Create a valid EmailAddress object
            EmailAddress validEmail = new EmailAddress("example@example.com");
            System.out.println(validEmail);

            // Attempt to create an EmailAddress object with invalid data
            EmailAddress invalidEmail = new EmailAddress("invalid-email"); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(STR."Error: \{e.getMessage()}");
        }
    }
}
