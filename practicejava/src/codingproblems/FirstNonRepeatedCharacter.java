package codingproblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "aaa bbb ccx ddh";
        Optional<Character> firstNonRepeatedChar = findFirstNonRepeatedCharacter(inputString);
        if (firstNonRepeatedChar.isPresent()) {
            System.out.println(STR."First non-repeated character: \{firstNonRepeatedChar.get()}");
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
    //finds the first non-repeated character in a given string by counting the occurrences of each character
    // and filtering the entries with a count of 1. The code uses a LinkedHashMap to preserve the order
    // of the characters and a stream to filter and map the keys.

    public static Optional<Character> findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        str.chars().mapToObj(c -> (char) c).forEach(c -> charCounts.put(c, charCounts.getOrDefault(c, 0) + 1));
        return charCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }
}

