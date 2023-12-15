package org.DVitushkin.bracketsfiller;

/**
 * Main class to show of task about filling string by brackets.
 */

public class Demonstrator {
    public static void testFillString(String testCaseName, String base, String expected) {
        System.out.printf("*[%s]\n", testCaseName);
        System.out.printf("Expected: <%s>, got: <%s>\n", expected, BracketsFiller.fillString(base));
    }
    public static void main(String[] args) {
        testFillString("Case with an odd number of letters in word", "example", "(e(x(a(m)p)l)e)");
        testFillString("Case with an even number of letters in word", "brackets", "(b(r(a(c()k)e)t)s)");
    }
}
