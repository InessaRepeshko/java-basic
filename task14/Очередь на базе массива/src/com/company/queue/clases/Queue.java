package com.company.queue.clases;

import com.company.queue.exceptions.EmptyQueueException;

public class Queue {
    private int[] queue;
    private int capacity;
    private int size;
    private int first;
    private int last;

    public Queue() {
        int capacity = 10;
        queue = new int[capacity];
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        last = -1;
        first = 0;
        size = 0;
    }

    public void add(int element) {
        if (size + 1 > capacity) {
            System.out.println("Ошибка: очередь переполнена!");
            return;
        }

        if (last == capacity - 1) {
            last = -1;
        }
        queue[++last] = element;
        size++;
    }

    public int remove() {
        checkIsEmpty();

        int result = queue[first++];

        if (first == capacity) {
            first = 0;
        }
        size--;
        return result;
    }

    public int getFirst() {
        return queue[first];
    }

    public int getLast() {
        return queue[last];
    }

    public boolean isFull() {
        return (size == capacity - 1);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        checkIsEmpty();
        StringBuilder result = new StringBuilder();
        int pointer = last;

        while (pointer != first) {
            result.append(queue[pointer]).append(" -> ");

            if (pointer - 1 < 0) {
                pointer = capacity - 1;
            } else {
                pointer--;
            }
            pointer = last;
        }

        result.append(queue[first]);
        return result.toString();
        }


    private void checkIsEmpty() {
        if (isEmpty()) {
            throw new EmptyQueueException("Очередь пустая");
        }
    }

}


