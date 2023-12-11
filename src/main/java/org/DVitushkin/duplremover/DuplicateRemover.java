package org.DVitushkin.duplremover;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * DuplicateRemover has removeDuplicate method that convert any collection to LinkedHashSet
 * and return it wrapping into ArrayList.
 */

public class DuplicateRemover {
    public static <T> Collection<T> removeDuplicate(Collection<T> collection) {
        return new ArrayList<>(new LinkedHashSet<>(collection));
    }
}
