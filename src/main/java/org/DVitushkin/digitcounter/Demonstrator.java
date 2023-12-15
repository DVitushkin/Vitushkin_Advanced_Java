package org.DVitushkin.digitcounter;

/**
 * Main class of task how to find count of digit <2> in given number.
 */

public class Demonstrator {
    public static void testCountDigit(String testCaseName, int expected, int num) {
        System.out.printf("*[%s]\n", testCaseName);
        System.out.printf("Expected: <%s>, got: <%s>\n", expected, DigitCounter.countDigit(num));
    }
    public static void main(String[] args) {
        testCountDigit("Case 1", 16, 54);
        testCountDigit("Case 2", 2, 12);
        testCountDigit("Case 3", 0, 1);
    }
}
