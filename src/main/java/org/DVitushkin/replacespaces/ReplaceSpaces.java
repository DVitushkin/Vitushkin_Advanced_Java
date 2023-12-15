package org.DVitushkin.replacespaces;

/**
 * Class what can remove extra spaces symbols in given string.
 */

public class ReplaceSpaces {
    private static String removeBeginingAndEndingExtraSpaces(String str) {
        if (str.charAt(0) == ' ') {
            str = str.substring(1);
        }
        if (str.charAt(str.length()-1) == ' ') {
            str = str.substring(0, str.length()-1);
        }

        return str;
    }
    public static String removeExtraSpaces(String str) {
        StringBuilder resultBuilder = new StringBuilder();

        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (currentChar != str.charAt(i)) {
                resultBuilder.append(currentChar);
                currentChar = str.charAt(i);
            }
        }
        resultBuilder.append(currentChar);
        String result = resultBuilder.toString();
        return removeBeginingAndEndingExtraSpaces(result);
    }
}
