package codingproblems.string;

// program that sorts by the length of the given array of strings
import java.util.Arrays;
import java.util.Comparator;

public class StringLengthSorter {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "pear", "orange", "grape"};
        sortStringsByLength(strings);
        System.out.println("Sorted strings by length:");
        Arrays.stream(strings).forEach(System.out::println);
    }

//    The code uses the Arrays.sort method to sort the array of strings. The Comparator.comparingInt method is used to create
//    a Comparator that can compare two strings based on their length. The ::length syntax is a shorthand for calling the
//    length method on a String object.
    public static void sortStringsByLength(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
    }
}
