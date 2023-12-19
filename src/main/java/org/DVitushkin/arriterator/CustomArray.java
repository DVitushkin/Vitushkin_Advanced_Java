package org.DVitushkin.arriterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Array class wrapper with Iterable interface implementation.
 */

public class CustomArray<T> implements Iterable<T> {
    private final T[] arr;
    private final int currentSize;

    public CustomArray(T[] arr) {
        this.arr = arr;
        this.currentSize = arr.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex != currentSize && arr[currentIndex] != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return arr[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
