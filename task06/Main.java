package com.company;

public class Main {

    public static void main(String[] args) {

    /*Задача: Найти сумму всех цифр целочисленного массива (числа только положительные).
    Например, если дан массив [12, 104, 81], то сумма всех его цифр будет
    равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17.*/

        int[] array = new int[3];
        array[0] = 12;
        array[1] = 104;
        array[2] = 81;

        int sum = 0;

        System.out.printf("Ваш массив: \t [%d, %d, %d] \n", array[0], array[1], array[2]);

        for (int i : array) {
            sum += i % 10;
            while (i > 0) {
                i = i / 10;
                sum += i % 10;
            }
        }
        System.out.println("Cумма всех цифр массива = " + sum);

    }
}
