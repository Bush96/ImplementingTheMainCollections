package org.example.ArrayLists;

import java.util.Iterator;

public class MyArrayList<E> implements MyArrayInterface<E> {

//    public static void main(String[] args) {
//        MyArrayList<String> strings = new MyArrayList<>();
//        strings.add("first");
//        strings.add("second");
//        strings.add("three");
//
//        strings.delete(1);
//        System.out.println(strings.get(1));
//    }

    public E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
        E[] temp = values;
        values = (E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        int amountElementsAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<>(values);
    }
}
