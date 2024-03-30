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

    public static String joinStrings(String[] strings, String delimiter) {
        return Arrays.stream(strings)
                .collect(() -> new StringJoiner(delimiter),
                        StringJoiner::add,
                        StringJoiner::merge)
                .toString();
    }
}

