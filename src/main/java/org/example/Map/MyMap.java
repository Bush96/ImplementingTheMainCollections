package org.example.Map;

import java.util.Arrays;

public class MyMap<K, V> {
    private int size;
    private int DEFAULT_CAPACITY = 16;                //вместимость мапы

    private MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];        //обьявляем полем созданный ранее шаблон мапы


    public V get(K key) {
        for (int i = 0; i < size; i++) {    //обходим нашу мапу, загядываем во все ячейки и сравниваем их ключи с нужными нам, далее возвращаем
            if (values[i] != null) {
                if (values[i].getKey().equals(key)) {
                    return values[i].getValue();
                }
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean insert = true;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {      //если мы находим ячейку с таким ключом то меняем ее значение
                values[i].setValue(value);             // если не находим проскакиваем булин и добавляем новые значения в ячейки
                insert = false;
            }
        }
        if (insert) {                   //добавляем новые значения
            ensureCapa();               //если размер не позволяет увеичиваем его
            values[size++] = new MyEntry<K, V>(key, value);
        }
    }

    private void ensureCapa() {                //гарантируем что мап вместит все, создаем новый массив, увеличиваем и копируем в него содержимое старого массива
        if (size == values.length) {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {          //ищем в мапе похожий ключ
                values[i] = null;                        //обнуляем
                size--;
                condenseArray(i);       //обновляем значения указателей последующих элементов
            }
        }
    }

    private void condenseArray(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }
}
