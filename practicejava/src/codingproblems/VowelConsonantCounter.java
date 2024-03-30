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

