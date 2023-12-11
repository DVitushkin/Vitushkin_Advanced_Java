package org.DVitushkin.digitcounter;

/**
 * DigitCounter class that can count of sought after numbers
 * to given position.
 */

public class DigitCounter {
    private final Integer num;

    DigitCounter(int num) {
        this.num = num;
    }

    public int countDigit(int soughtNum, int position) {
        int counter = 0;

        char[] strNum = String.valueOf(this.num).toCharArray();
        for (int i = 0; i < position; i++) {
            int num = strNum[i] - '0';
            if (num == soughtNum) {
                counter++;
            }
        }

        return counter;
    }
}
