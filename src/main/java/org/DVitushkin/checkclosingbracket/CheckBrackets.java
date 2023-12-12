package org.DVitushkin.checkclosingbracket;

import java.util.Map;
import java.util.Stack;

/**
 * Class what can validate string of brackets to closing brackets.
 */

public class CheckBrackets {
    public static boolean checkBrackets(String input) {
        Stack<Character> bracketStack = new Stack<>();
        Map<Character, Character> brackets = Map.of('(', ')', '{', '}', '[', ']');

        for (Character c : input.toCharArray()) {
            if (brackets.containsKey(c)) {
                bracketStack.push(c);
            }
            if (brackets.containsValue(c)) {
                if (bracketStack.empty()) {
                    return false;
                }

                if (c.equals(brackets.getOrDefault(bracketStack.peek(), '0'))) {
                    bracketStack.pop();
                } else {
                    return false;
                }
            }
        }
        return bracketStack.empty();
    }
}
