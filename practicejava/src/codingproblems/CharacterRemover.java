package codingproblems;

public class CharacterRemover {
    public static void main(String[] args) {
        String inputString = "hello world";
        char charToRemove = 'o';
        String stringWithoutChar = removeCharacter(inputString, charToRemove);
        System.out.println(STR."String without '\{charToRemove}': \{stringWithoutChar}");
    }

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
