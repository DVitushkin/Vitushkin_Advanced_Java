package org.DVitushkin.freqcounter;

/**
 * Main class of task about finding most frequent symbol.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String base = "aabcccccarrrrrrrrrrrrrra";
        System.out.printf("Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%s>\n", "c", FreqCounter.getMostFrequentChar(base));


    }
}
