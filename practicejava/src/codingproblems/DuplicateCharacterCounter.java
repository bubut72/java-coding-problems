package codingproblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {
        String inputString = "hello world";
        Map<Character, Long> duplicateCharacterCount = countDuplicateCharacters(inputString);
        System.out.println("Duplicate characters count:");
        duplicateCharacterCount.forEach((character, count) -> {
            if (count > 1) {
                System.out.println(STR."\{character}: \{count}");
            }
        });
    }

    public static Map<Character, Long> countDuplicateCharacters(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
