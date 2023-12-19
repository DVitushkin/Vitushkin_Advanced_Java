package org.DVitushkin.stringcompressor;

/**
 * Class with method to compress string by equals symbols counter.
 */

public class StringCompressor {
    public static String compress(String input) {
        StringBuilder result = new StringBuilder();

        char currentChar = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (currentChar == input.charAt(i)) {
                counter++;
            } else {
                result.append(currentChar);
                result.append(counter);
                currentChar = input.charAt(i);
                counter = 1;
            }
        }

        result.append(currentChar);
        result.append(counter);

        if (result.length() > input.length()) {
            return input;
        }
        return result.toString();
    }
}
