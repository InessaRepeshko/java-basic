package com.company.queue.interfaces;

public interface Queue<T> {
    void add(T element);
    T remove();

    boolean isEmpty();

}
