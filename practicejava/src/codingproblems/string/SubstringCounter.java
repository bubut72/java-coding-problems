package codingproblems.string;

// program that counts the occurrences of a given substring in another given string

public class SubstringCounter {
    public static void main(String[] args) {
        String mainString = "hello world hello";
        String substring = "hello";

        int occurrences = countOccurrences(mainString, substring);

        System.out.println(STR."Occurrences of '\{substring}' in the main string: \{occurrences}");
    }

    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int lastIndex = 0;

        while ((lastIndex = mainString.indexOf(substring, lastIndex)) != -1) {
            count++;
            lastIndex += substring.length();
        }

        return count;
    }
}

