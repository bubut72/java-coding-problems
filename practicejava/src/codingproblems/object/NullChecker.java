package codingproblems.object;

import java.util.Optional;

public class NullChecker {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;

        // Performing null checks in a functional style
        System.out.println(STR."Is str1 null? \{isNull(str1)}");
        System.out.println(STR."Is str2 null? \{isNull(str2)}");
    }

    public static boolean isNull(String str) {
        return Optional.ofNullable(str)
                .isEmpty();
    }
}

