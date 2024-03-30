package codingproblems;

public class CharacterRemover {
    public static void main(String[] args) {
        String inputString = "hello world";
        char charToRemove = 'o';
        String stringWithoutChar = removeCharacter(inputString, charToRemove);
        System.out.println(STR."String without '\{charToRemove}': \{stringWithoutChar}");
    }

   // removes all occurrences of a specified character from a string.
    // It does so by iterating over each character in the input string and appending it to a new string
    // if it does not match the specified character. The method returns the resulting string.

    //The code uses a StringBuilder to construct the output string, which is more efficient than using
    // a regular string because it allows for efficient string concatenation. The code also uses
    // a for-each loop to iterate over the characters in the input string, which is more concise
    // and efficient than a traditional loop.
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != charToRemove) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
