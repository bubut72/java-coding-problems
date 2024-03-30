package codingproblems.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class DuplicateRemover {
    public static void main(String[] args) {
        String inputString = "hello world";
        String stringWithoutDuplicates = removeDuplicates(inputString);
        System.out.println(STR."String without duplicates: \{stringWithoutDuplicates}");
    }

//    1.converts the input string into a stream of characters using the chars() method.
//    2.maps each character to an object of type Character using the mapToObj() method.
//    3.creates a new LinkedHashSet using the Collectors.toCollection() method and passes it the stream of characters. This creates a set with no duplicates.
//    4.converts the set back to a stream using the stream() method.
//    5.maps each element of the stream to a String using the map() method.
//    6.concatenates all the strings into a single string using the collect() method and theCollectors.joining() method.

    public static String removeDuplicates(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
