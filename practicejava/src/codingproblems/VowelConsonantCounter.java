package codingproblems;

import java.util.Arrays;
import java.util.Locale;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String inputString = "Hello World!";
        int[] counts = countVowelsAndConsonants(inputString);
        System.out.println(STR."Vowels: \{counts[0]}");
        System.out.println(STR."Consonants: \{counts[1]}");
    }

//    public static int[] countVowelsAndConsonants(String str) {
//        int vowelsCount = (int) Arrays.stream(str.split(""))
//                .filter(s -> s.matches("[aeiouAEIOU]"))
//                .count();
//        int consonantsCount = (int) Arrays.stream(str.split(""))
//                .filter(s -> s.matches("[a-zA-Z&&[^aeiouAEIOU]]"))
//                .count();
//        return new int[]{vowelsCount, consonantsCount};
//    }

//    The code is a helper method that counts the number of vowels and consonants in a given string.
//    It does so by converting the string to lowercase and then iterating over its characters.
//    For each character, the method checks if it is a letter and then determines if it is a vowel or a
//    consonant based on a set of pre-defined vowels.
//
//    The method then uses the mapToInt method to convert the filtered characters into an array of integers,
//    where each integer represents a vowel or a consonant. The toArray method is used to convert the stream of integers
//    into an array.
//
//    The code then uses two Arrays.stream methods to count the number of vowels and consonants. The filter method is used
//    to count the number of vowels and the count method is used to get the count as a long value and then convert it to an
//    int value.
//
//    The method returns an array containing the number of vowels and consonants.
    public static int[] countVowelsAndConsonants(String str) {
        int[] counts = str.toLowerCase(Locale.ENGLISH)
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .mapToInt(ch -> {
                    if (isVowel(ch)) {
                        return 0; // Representing a vowel
                    } else {
                        return 1; // Representing a consonant
                    }
                })
                .toArray();

        int vowelsCount = (int) Arrays.stream(counts).filter(num -> num == 0).count();
        int consonantsCount = (int) Arrays.stream(counts).filter(num -> num == 1).count();

        return new int[]{vowelsCount, consonantsCount};
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

