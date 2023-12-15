package org.DVitushkin.digitcounter;

/**
 * DigitCounter class that can count of sought after numbers
 * to given position.
 */

//iii. Напишите метод, который будет подсчитывать
// количество цифр «2», используемых в десятичной записи целых чисел от 0 до n (включительно)
public class DigitCounter {
    public static int countDigit(int n) {
        int counter = 0;

        for (int i = 0; i <= n; i++) {
            int tmp = i;
            while (tmp > 0) {
                if (tmp % 10 == 2) {
                    counter++;
                }
                tmp /= 10;
            }
        }

        return counter;
    }
}
