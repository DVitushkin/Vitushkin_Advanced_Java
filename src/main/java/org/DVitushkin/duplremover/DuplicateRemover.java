package org.DVitushkin.duplremover;

import java.util.Collection;
import java.util.HashSet;

/**
 * DuplicateRemover has removeDuplicate method that convert any collection to LinkedHashSet
 * and return it wrapping into ArrayList.
 */

public class DuplicateRemover {
    public static <T> Collection<T> removeDuplicate(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
