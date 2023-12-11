package org.DVitushkin.digitcounter;

/**
 * Main class of task how to find count of digit <2> in given number.
 */

public class Demonstrator {
    public static void main(String[] args) {
        DigitCounter digitCounter = new DigitCounter(1212553210);
        System.out.println(digitCounter.countDigit(2, 10));
    }
}
