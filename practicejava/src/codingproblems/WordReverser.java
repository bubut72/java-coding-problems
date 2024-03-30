package codingproblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordReverser {
    public static void main(String[] args) {
        String inputString = "Hello world!";
        String reversedWords = reverseWords(inputString);
        System.out.println(STR."Original string: \{inputString}");
        System.out.println(STR."Reversed words: \{reversedWords}");
    }

    public static String reverseWords(String str) {
        return Arrays.stream(str.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
