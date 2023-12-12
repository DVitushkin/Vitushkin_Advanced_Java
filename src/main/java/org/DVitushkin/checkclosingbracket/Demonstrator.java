package org.DVitushkin.checkclosingbracket;

/**
 * Main class of task about validating brackets string.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String base = "()[]{}";
        System.out.printf("[Test1] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "true", CheckBrackets.checkBrackets(base));

        base = "{[]}";
        System.out.printf("[Test2] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "true", CheckBrackets.checkBrackets(base));

        base = "((()(())))";
        System.out.printf("[Test3] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "true", CheckBrackets.checkBrackets(base));

        base = "(]";
        System.out.printf("[Test4] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "false", CheckBrackets.checkBrackets(base));

        base = "([)]";
        System.out.printf("[Test5] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "false", CheckBrackets.checkBrackets(base));

        base = ")([]";
        System.out.printf("[Test6] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "false", CheckBrackets.checkBrackets(base));
        base = "())([]";
        System.out.printf("[Test7] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%b>\n", "false", CheckBrackets.checkBrackets(base));
    }
}
