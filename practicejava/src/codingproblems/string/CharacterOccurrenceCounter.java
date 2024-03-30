package codingproblems.string;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        String inputString = "hello world";
        char targetCharacter = 'o';
        long occurrences = countOccurrences(inputString, targetCharacter);
        System.out.println("Occurrences of '" + targetCharacter + "': " + occurrences);
    }

    // It takes two parameters: a string and a target character.
    // The method uses the chars() method to iterate over each character in the string,
    // and the filter() method to filter out all characters that are not equal to the target character.
    // Finally, the count() method is used to get the number of filtered characters and return it as a long value.
    public static long countOccurrences(String str, char target) {
        return str.chars()
                .filter(ch -> ch == target)
                .count();
    }
}
