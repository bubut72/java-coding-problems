package codingproblems.string;

import java.util.Arrays;

// a Java program that checks whether two strings are anagrams

//An anagram is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters
// exactly once. For example, "listen" and "silent" are anagrams of each other, as they contain the same letters in a different
// order. Similarly, "debit card" and "bad credit" are anagrams. Anagrams are often used in word games and puzzles.
public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = areAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println(STR."The strings '\{str1}' and '\{str2}' are anagrams.");
        } else {
            System.out.println(STR."The strings '\{str1}' and '\{str2}' are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted char arrays
        return Arrays.equals(arr1, arr2);
    }
}
