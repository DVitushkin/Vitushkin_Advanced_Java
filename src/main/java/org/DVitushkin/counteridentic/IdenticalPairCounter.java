package org.DVitushkin.counteridentic;

/**
 * Main class of task about count identic pair in array.
 */

public class IdenticalPairCounter {
    public static int numberOfIdenticalPairs(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
