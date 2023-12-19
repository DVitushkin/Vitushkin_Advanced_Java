package org.DVitushkin.anagramchecker;

import java.util.HashMap;
import java.util.Map;

/**
 *  Class that can check is <comparable> from IsAnagram() method - anagram to <base>.
 */

public class AnagramStringChecker {
    public static boolean isAnagram(String base, String comparable) {
        if (base.length() != comparable.length()) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();
        char[] arrBase = base.toCharArray();
        char[] arrComparable = comparable.toCharArray();


        for (int i = 0; i < comparable.length(); i++) {
            counter.put(arrBase[i], counter.getOrDefault(arrBase[i], 0) + 1);
            counter.put(arrComparable[i], counter.getOrDefault(arrComparable[i], 0) - 1);
        }

        for (Integer val : counter.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
