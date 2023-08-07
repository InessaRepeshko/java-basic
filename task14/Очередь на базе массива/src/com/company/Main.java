package com.company;

import com.company.queue.clases.Queue;
import com.company.queue.exceptions.EmptyQueueException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
            Queue queue = new Queue(8);

            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            queue.remove();
            queue.add(7);
//            queue.add(8);
//            queue.remove();
            queue.remove();

            System.out.println("Size queue: " + queue.getSize());
            System.out.println("First element = " + queue.getFirst());
            System.out.println("Last element = " + queue.getLast());
            System.out.println("________________");

            while (!queue.isEmpty()) {
                int n = queue.remove();
                System.out.println("Element: " + n);
            }
            System.out.println("________________");

            queue.toString();

        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
