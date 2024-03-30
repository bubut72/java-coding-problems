package codingproblems.string;

// program that checks whether a given string contains a given substring
public class SubstringChecker {
    public static void main(String[] args) {
        String mainString = "Hello world";
        String substring = "world";

        boolean containsSubstring = containsSubstring(mainString, substring);

        if (containsSubstring) {
            System.out.println("The main string contains the substring.");
        } else {
            System.out.println("The main string does not contain the substring.");
        }
    }

    public static boolean containsSubstring(String mainString, String substring) {
        return mainString.contains(substring);
    }
}
