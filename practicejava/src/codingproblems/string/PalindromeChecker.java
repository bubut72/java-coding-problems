package codingproblems.string;

public class PalindromeChecker {
    public static void main(String[] args) {
        String inputString = "radar";
        boolean isPalindrome = isPalindrome(inputString);
        if (isPalindrome) {
            System.out.println(STR."The string '\{inputString}' is a palindrome.");
        } else {
            System.out.println(STR."The string '\{inputString}' is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }
}
