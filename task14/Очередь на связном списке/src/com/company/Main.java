package com.company;

import com.company.queue.clases.LinkedQueue;
import com.company.queue.exceptions.EmptyQueueException;
import com.company.queue.interfaces.Queue;

public class Main {

    public static void main(String[] args) {

        try {
            Queue<Integer> queue = new LinkedQueue<>();
            queue.add(3);
            queue.add(5);
            queue.add(7);
            System.out.println(queue);

            queue.remove();
            System.out.println(queue);

        } catch (EmptyQueueException e) {
            System.out.println(e.getMessage());
        }


    }
}
