package org.DVitushkin.stringcompressor;

/**
 * Main class of task about compress string.
 */

public class Demonstrator {
    public static void testStringCompressor(String testCaseName, String base, String expected) {
        System.out.printf("*[%s]\n", testCaseName);
        System.out.printf("Expected: <%s>, got: <%s>\n", expected, StringCompressor.compress(base));
    }
    public static void main(String[] args) {
        testStringCompressor("Test 1", "а2b1с5аЗ", "aabcccccaaa");
        testStringCompressor("Test 2", "abcdef", "abcdef");
    }
}
