package com.company.queue.clases;

import com.company.queue.exceptions.EmptyQueueException;
import com.company.queue.interfaces.Queue;

public class LinkedQueue<T> implements Queue<T> {
    private QueueNode<T> first = null;
    private QueueNode<T> last = null;

    @Override
    public void add(T element) {
        QueueNode<T> node = new QueueNode<>(element);

        if (first == null) {
            first = node;
        }

        if (last != null) {
            node.setNext(last);
            last.setPrev(node);
        }
        last = node;
    }

    @Override
    public boolean isEmpty() {
        if (last == null) {
            return true;
        }

        return false;
    }

    @Override
    public T remove() {
        checkIsEmpty();

        T result = first.getData();
        first = first.getPrev();
        if (first != null) {
            first.setNext(null);
        } else {
            last = null;
        }

        return result;
    }

    @Override
    public String toString() {
        checkIsEmpty();
        StringBuilder result = new StringBuilder(" -> ");
        QueueNode<T> pointer = last;

        while (pointer != null) {
            result.append(pointer.getData()).append(" -> ");
            pointer = pointer.getNext();
        }

        return result.toString();
    }

    private void checkIsEmpty() {
        if (isEmpty()) {
            throw new EmptyQueueException("Очередь пустая");
        }
    }
}
