package org.DVitushkin.bracketsfiller;

/**
 * Main class of task about v.
 */

public class BracketsFiller {
    public static StringBuilder FillString(String str) {
        StringBuilder result = new StringBuilder();

        if (str.length() % 2 != 0) {
            for (int i = 0; i < str.length() / 2; i++) {
                result.append("(");
                result.append(str.charAt(i));
            }
            result.append('(');
            result.append(str.charAt(str.length() / 2));
            for (int i = (str.length() / 2) + 1; i < str.length(); i++) {
                result.append(")");
                result.append(str.charAt(i));
            }
        } else {
            for (int i = 0; i < str.length() / 2; i++) {
                result.append("(");
                result.append(str.charAt(i));
            }
            result.append("(");
            for (int i = (str.length() / 2); i < str.length(); i++) {
                result.append(")");
                result.append(str.charAt(i));
            }
        }

        result.append(")");
        return result;
    }
    }
