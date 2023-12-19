package org.DVitushkin.counteridentic;

/**
 * Main class of task about count identic pair in array.
 */

public class Demonstrator {
    public static void main(String[] args) {
        int[] base = new int[]{4, 1, 2, 4, 4, 2};
        System.out.print("[Test1] Was put: {4, 1, 2, 4, 4, 2}\n");
        System.out.printf("Expected: <%s>, got: <%d>\n", "4", IdenticalPairCounter.numberOfIdenticalPairs(base));
    }
}
