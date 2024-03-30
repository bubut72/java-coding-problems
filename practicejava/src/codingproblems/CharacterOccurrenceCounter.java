package codingproblems;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        String inputString = "hello world";
        char targetCharacter = 'o';
        long occurrences = countOccurrences(inputString, targetCharacter);
        System.out.println("Occurrences of '" + targetCharacter + "': " + occurrences);
    }

    public static long countOccurrences(String str, char target) {
        return str.chars()
                .filter(ch -> ch == target)
                .count();
    }
}
