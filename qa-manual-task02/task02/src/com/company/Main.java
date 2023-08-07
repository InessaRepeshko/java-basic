package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
// Задание: Создать двумерный массив из 5 строк по 8 столбцов
// в каждой из случайных целых чисел из отрезка [-99;99].
// Вывести массив на экран. После на отдельной строке вывести на экран
// значение максимального элемента этого массива (его индекс не имеет значения).
        //Создадим двумерный массив на 5 строк и 8 столбцов
        int[][] array = new int[5][8];

        //Заполним данный массив рандомными числами в диапазоне [-99;99] и выведем его на экран.
        Random random = new Random();
        System.out.println("Ваш двумерный массив размером 5x8 заполненный рандомными числами в диапазоне [-99; 99]: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(200) - 100; //заполняем массив цифрами в диапазоне [-99; 99]
                System.out.printf("%4d", array[i][j]); //выводим все элементы массива на экран
            }
            System.out.println("");
        }

        //Найдем значение максимального элемента данного массива и выведем его на экран.
        int maxValue = -99;     //указываем в maxValue самое минимальное значение диапазона чисел, которыми заполнялся массив
        int line = 0; // значение строки положения элемента
        int column = 0; // значение колонки положения элемента
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) { // сравниваем текущее значение элемента с maxValue
                    maxValue = array[i][j]; // если значение текущего элемента больше maxValue, то присваеваем его в maxValue
                    line = i+1; // запоминаем положение max элемента в массиве (строку)
                    column = j+1; // запоминаем положение max элемента в массиве (столбец)
                }
            }
        }
        System.out.println("\nМаксимальное значение элемента данного двумерного массива = " + maxValue + ".");
        System.out.println("Положение максимального элемента в массиве: [" + line + "][" + column + "] - "
                + line + " строка, " + column + " столбец." );

    }
}
    




