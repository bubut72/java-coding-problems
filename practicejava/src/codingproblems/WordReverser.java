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

//    It uses the split method to split the input string into words, then maps each word to a new StringBuilder object
//    that reverses the characters in the word, and finally uses the collect method to join all the reversed words back
//    into a single string, separated by spaces.
//
//    The code uses the Stream API to process each word in the input string, and the map method to apply a function
//    to each word. The function reverses the characters in the word using the reverse method of the StringBuilder object,
//    and then converts the reversed word back to a String using the toString method.

    public static String reverseWords(String str) {
        return Arrays.stream(str.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
