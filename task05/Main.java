package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*  ЗАДАЧА 1. Задать с клавиатуры размер массива (в диапазоне [1; 100]):
    заполнить его числами случайным образом (в диапазоне [-50.00; 50.00])
    *найти минимальный элемент массива
    *найти максимальный элемент массива
    *найти среднее арифметическое элементов массива.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива:\t");
        int matrixSize = scanner.nextInt();

        int[] matrix = new int[matrixSize];

        if (matrixSize >=1 && matrixSize <=100) {
            System.out.println("Ваш массив имеет вид: ");

            Random random = new Random();
            for (int i = 0; i < matrix.length; i++) {
                matrix[i] = random.nextInt(101) - 50;
                System.out.printf("%4d", matrix[i]);
            }
            System.out.println();

            int max = -51;
            int min = 50;
            int average = 0;
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i] > max) {
                    max = matrix[i];
                }
                if (matrix[i] < min) {
                    min = matrix[i];
                }
                sum += matrix[i];
                average = sum / matrixSize;
            }
            System.out.println("Максимальный элемент в массиве \t = " + max);
            System.out.println("Минимальный элемент в массиве \t = " + min);
            System.out.println("Сумма всех элементов в массиве \t = " + sum);
            System.out.println("Среднее арифметическое всех элементов в массиве \t = " + average);
            System.out.println("__________________________________ \n");
        } else {
            System.out.println("Вы ввели неверное значение! Введите чиcло в диапазоне [1; 100].");
            System.out.println("__________________________________ \n");
        }







/*  ЗАДАЧА 2. Создать двумерный массив из 7 строк и 4 столбцов.
    Значения в каждой ячейке задать случайными целыми числами из отрезка [-5;5].
    Вывести массив на экран. Определить и вывести на экран индекс строки
    с наибольшим по модулю произведением элементов.*/

        int[][] matrixx = new int[7][4];
        System.out.println("Ваша матрица matrix[7][4]: \n");

        Random randomm = new Random();
        for (int i = 0; i < matrixx.length; i++) {
            int multiplication = 1;
            for (int j = 0; j < matrixx[i].length; j++) {
                matrixx[i][j] = randomm.nextInt(11) - 5;
                multiplication *= matrixx[i][j];
                System.out.printf("%3d", matrixx[i][j]);
            }
            System.out.printf("\t\t %d\n", multiplication);
        }

        int maximum = 0;
        int index = 0;
        for (int i = 0; i < matrixx.length; i++) {
            int multiplication = 1;
            for (int j = 0; j < matrixx[0].length; j++) {
                multiplication *= matrixx[i][j];
            }
            if (Math.abs(multiplication) > Math.abs(maximum)) {
                maximum = multiplication;
                index = i;
           }
        }
        System.out.printf("Максимальное произведение по модулю = %d, в строке %d", Math.abs(maximum), index + 1);

    }
}
