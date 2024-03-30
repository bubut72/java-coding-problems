package codingproblems.string;

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

//    It uses the chars() method to convert the string into a stream of characters, and then maps each character
//    to an object of type Character using the mapToObj() method.
//
//    The characters are then grouped by their identity (i.e., by character) using the groupingBy() method,
//    and the count of each group is calculated using the counting() method. The Collectors class provides these methods
//    as a way to simplify the process of working with streams.
//
//    In this case, the Function object passed to groupingBy() is a function that simply returns
//    its input (i.e., the character), and the counting() method simply returns the count of the elements
//    in the stream.

    public static Map<Character, Long> countDuplicateCharacters(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
