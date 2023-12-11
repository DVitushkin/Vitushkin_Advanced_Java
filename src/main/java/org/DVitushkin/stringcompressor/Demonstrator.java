package org.DVitushkin.stringcompressor;

/**
 * Main class of task about compress string.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String base = "aabcccccaaa";
        System.out.printf("Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%s>\n", "а2b1с5аЗ", StringCompressor.compress(base));

        String baseTwo = "abcdef";
        System.out.printf("\nWas put: <%s>\n", baseTwo);
        System.out.printf("Expected: <%s>, got: <%s>\n", "abcdef", StringCompressor.compress(baseTwo));
    }
}
