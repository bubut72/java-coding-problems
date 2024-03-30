package codingproblems;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java", "Programming"};
        String delimiter = ", ";
        String joinedString = joinStrings(strings, delimiter);
        System.out.println("Joined String: " + joinedString);
    }

    // The method takes two arguments: an array of strings and a delimiter string.
    // The code creates a new StringJoiner object with the specified delimiter, iterates over the array
    // of strings, and adds each string to the joiner using the add() method. Once all strings have been added,
    // the code calls the merge() method to combine all the added strings into a single string, separated by
    // the specified delimiter, and returns the resulting string.
    public static String joinStrings(String[] strings, String delimiter) {
        return Arrays.stream(strings)
                .collect(() -> new StringJoiner(delimiter),
                        StringJoiner::add,
                        StringJoiner::merge)
                .toString();
    }
}

