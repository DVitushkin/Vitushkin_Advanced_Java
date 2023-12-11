package org.DVitushkin.anagramchecker;

/**
 * Main class of task to check is first string is rearranging of symbols second.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String first = " god";
        String second = "do g";

        AnagramStringChecker asc = new AnagramStringChecker(first);
        System.out.printf("Have two strings: <%s> and <%s>\n", first, second);
        System.out.printf("Are they anagrams: %b", asc.isAnagram(second));
    }
}
