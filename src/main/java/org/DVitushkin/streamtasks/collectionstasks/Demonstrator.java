package org.DVitushkin.streamtasks.collectionstasks;

import java.util.Collection;
import java.util.List;

/**
 * Main class of task about work with collection - («a1», «a4», «a3», «a2», «a1», «a4»).
 * Tasks solution storage in corresponding variables like:
 * paragraphA, paragraphB, paragraphC, paragraphD;
 */

public class Demonstrator {
    public static void main(String[] args) {
        Collection<String> base = List.of("a1", "a4", "a3", "a2", "a1", "a4");

        Collection<String> paragraphA = base.stream().sorted().toList();
        System.out.printf("a. Collection sorted by alphabet: <%s>\n", paragraphA);

        Collection<String> paragraphB = base.stream().map(item -> item + "_1").toList();
        System.out.printf("b. To each elem added <_1>: <%s>\n", paragraphB);

        Object[] paragraphC = base.stream().map(item -> Integer.parseInt(String.valueOf(Character.getNumericValue(item.charAt(1))))).toArray();
        System.out.print("c. Remove from collection any alphabet letter: ");
        for (Object item : paragraphC) {
            System.out.printf("<%d>, ", item);
        }

        Collection<String> paragraphD = base.stream().sorted().distinct().toList();
        System.out.printf("\nd. Collection sorted by alphabet and cleaned from duplicates: <%s>\n", paragraphD);
    }
}
