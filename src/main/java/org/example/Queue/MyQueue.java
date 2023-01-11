package org.example.Queue;

public class MyQueue {
    private int[] arr;      // массив хранящий очередь
    private int front;      // указатель на первый элемент очереди
    private int rear;       // указатель на послединй элемент очереди
    private int capacity;   // макимальная вместимость очереди
    private int count;      // размер очереди


    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Удаление первого элемента из очереди
    public int deleteFront() {
        // проверяем на то пуста и очередь
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        int x = arr[front];

        System.out.println("Removing " + x);

        front = (front + 1) % capacity;
        count--;

        return x;
    }

    // добавление элемента в очередь
    public void push(int item) {

        if (isFull()) {
            System.out.println("Queue is Full");

        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Возврат первого элемента из очереди
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return arr[front];
    }

    // размер
    public int size() {
        return count;
    }


    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }
}
