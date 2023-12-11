package org.DVitushkin.duplremover;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Main class of task to show how to work DuplicateRemover.
 */

public class Demonstrator {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 2, 3, 2, 2, 4, 3, 3, 3, 3, 3};
        List<Integer> output = IntStream.of(input).boxed().collect(Collectors.toList());

        Collection<Integer> result = DuplicateRemover.removeDuplicate(output);
        System.out.println(result);
    }
}
