package org.DVitushkin.replacespaces;

/**
 * Main class of task about removing extra spaces symbols.
 */

public class Demonstrator {
    public static void testRemoveExtraSpaces(String testCaseName, String base, String expected) {
        System.out.printf("*[%s]\n Was put: <%s>\n", testCaseName, base);
        System.out.printf("Expected: <%s>, got: <%s>\n", expected, ReplaceSpaces.removeExtraSpaces(base));
    }
    public static void main(String[] args) {
        testRemoveExtraSpaces("String without space before <begin> and after <end> of string", "ex   am pl  e", "ex am pl e");
        testRemoveExtraSpaces("String with space before <begin> but without after <end> of string", " ex am pl  e", "ex am pl e");
        testRemoveExtraSpaces("String without space <begin> begin but with  after <end> of string", "ex am pl  e   ", "ex am pl e");
        testRemoveExtraSpaces("String with space before <begin> but with  after <end> of string", " ex am pl  e      ", "ex am pl e");
    }
}
