package org.DVitushkin.anagramchecker;

/**
 * Main class of task to check is first string is rearranging of symbols second.
 */

public class Demonstrator {
    public static void testAnagramStringChecker(String testCaseName, String base, String comparable) {
        System.out.printf("*[%s]\nHave two strings: <%s> and <%s>\n", testCaseName, base, comparable);
        System.out.printf("Are they anagrams: %b\n", AnagramStringChecker.isAnagram(base, comparable));
    }

    public static void main(String[] args) {
        testAnagramStringChecker("Same words but spaces in different places", "god", "do g");

        testAnagramStringChecker("Same words but different count of space symbols", "god", "do g");

        testAnagramStringChecker("Just different words", "god", "dodg");
    }
}
