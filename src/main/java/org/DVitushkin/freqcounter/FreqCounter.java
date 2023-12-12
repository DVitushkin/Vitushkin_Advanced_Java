package org.DVitushkin.freqcounter;

import java.util.HashMap;

/**
 * Main class what can find most frequent symbol in String.
 */

public class FreqCounter {
    public static Character getMostFrequentChar(String str) {
        HashMap<Character, Integer> storage = new HashMap<>();

        Character result = null;
        int maxFrequent = 0;

        for (int i = 0; i < str.length(); i++) {
            storage.put(str.charAt(i), (storage.getOrDefault(str.charAt(i), 0) + 1));

            if (storage.get(str.charAt(i)) > maxFrequent) {
                maxFrequent = storage.get(str.charAt(i));
                result = str.charAt(i);
            }
        }

        return result;

    }
}
