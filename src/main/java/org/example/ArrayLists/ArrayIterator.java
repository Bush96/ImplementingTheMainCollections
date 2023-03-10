package org.example.ArrayLists;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator {
    private int index;
    E[] values;

    public ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Object next() {
        return values[index++];
    }
}
