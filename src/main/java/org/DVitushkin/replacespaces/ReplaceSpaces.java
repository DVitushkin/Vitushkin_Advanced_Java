package org.DVitushkin.replacespaces;

/**
 * Class what can remove extra spaces symbols in given string.
 */

public class ReplaceSpaces {
    public static StringBuilder removeExtraSpaces(String str) {
        StringBuilder result = new StringBuilder();

        char current_char = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (current_char != str.charAt(i)) {
                result.append(current_char);
                current_char = str.charAt(i);
            }
        }
        result.append(current_char);

        return result;
    }
}
