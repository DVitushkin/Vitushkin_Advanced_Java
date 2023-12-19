package org.DVitushkin.arriterator;

/**
 * Main class of task to show how to work wrap on Array to use custom iterator.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String[] listOfStrings = new String[]{"hello", "world", "this", "is", "a", "test"};
        CustomArray<String> customStringArray = new CustomArray<>(listOfStrings);
        System.out.println("\nIterate over String array");
        for (String str : customStringArray) {
            System.out.printf("item: <%s>\n", str);
        }

        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        CustomArray<Integer> customNumArray = new CustomArray<>(numbers);
        System.out.println("\nIterate over Integer array");
        for (Integer num : customNumArray) {
            System.out.printf("item: <%s>\n", num);
        }
    }
}
