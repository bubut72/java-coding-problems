package codingproblems.string;

//Java program that concatenates the same string a given number of times
public class StringConcatenator {
    public static void main(String[] args) {
        String inputString = "Hello";
        int numberOfTimes = 3;

        String concatenatedString = concatenateString(inputString, numberOfTimes);

        System.out.println(STR."Concatenated string: \{concatenatedString}");
    }

    public static String concatenateString(String str, int numberOfTimes) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfTimes; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
