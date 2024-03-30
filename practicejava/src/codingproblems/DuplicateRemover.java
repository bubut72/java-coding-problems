package codingproblems;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class DuplicateRemover {
    public static void main(String[] args) {
        String inputString = "hello world";
        String stringWithoutDuplicates = removeDuplicates(inputString);
        System.out.println(STR."String without duplicates: \{stringWithoutDuplicates}");
    }

    public static String removeDuplicates(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
