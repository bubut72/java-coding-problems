package codingproblems;

public class DigitChecker {
    public static void main(String[] args) {
        String inputString = "123456";
        boolean containsOnlyDigits = checkIfContainsOnlyDigits(inputString);
        if (containsOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contain only digits.");
        }
    }

    public static boolean checkIfContainsOnlyDigits(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}

