package codingproblems.string;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacterFinder {
    public static void main(String[] args) {
        String inputString = "hello world";
        char mostFrequentChar = findMostFrequentCharacter(inputString);
        System.out.println(STR."Character with the most appearances: \{mostFrequentChar}");
    }

//    The code uses a Map data structure to store the character counts. The key of the map is the character and the value
//    is the count. The putIfAbsent() method is used to ensure that each character is added to the map only once, with its
//    initial count being 0.
//
//    The code then loops through each character in the string and increments its count in the map. If the character is
//    already present in the map, its count is updated with the new value.
//
//    Once all characters have been processed, the code loops through the map again to find the character with the highest count.
//    The character with the highest count is returned as the solution.
    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the maximum count
        char mostFrequentChar = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }
}

