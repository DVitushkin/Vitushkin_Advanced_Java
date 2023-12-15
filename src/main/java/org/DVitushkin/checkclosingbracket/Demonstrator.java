package org.DVitushkin.checkclosingbracket;

/**
 * Main class of task about validating brackets string.
 */

public class Demonstrator {
    public static void testCheckBrackets(String testCaseName, String expected, String base) {
        System.out.printf("*[%s]\n", testCaseName);
        System.out.printf("Expected: <%s>, got: <%s>\n", expected, CheckBrackets.checkBrackets(base));
    }
    public static void main(String[] args) {
        testCheckBrackets("Case1 ()[]{}", "true", "()[]{}");
        testCheckBrackets("Case2 {[]}", "true","{[]}");
        testCheckBrackets("Case3 ((()(())))", "true", "((()(())))");
        testCheckBrackets("Case4 (]", "false", "(]");
        testCheckBrackets("Case5 ([)]", "false", "([)]");
        testCheckBrackets("Case6 )([]", "false", ")([]");
        testCheckBrackets("Case7 ())([]", "false", "())([]");
    }
}
