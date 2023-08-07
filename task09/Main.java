//ДЗ 9. Сортировка массива
//Отсортировать массив целых чисел сортировкой выбором.
//https://www.youtube.com/watch?v=KZxP5JqtKKA&ab_channel=RomanTsarev
//https://prog-cpp.ru/sort-select/

package com.company;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
        SplittableRandom sRandom = new SplittableRandom();
        int[] array = sRandom
                .ints(10, 1, 11 )
                .toArray();
        System.out.println("Ваш массив данных: \t");
        System.out.println(Arrays.toString(array));

        selectionSort(array);
        System.out.println("Ваш массив данных отсортированный сортировкой выбором: \t");
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] arrray) {
        for (int min = 0; min < arrray.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < arrray.length; j++) {
                if (arrray[j] < arrray[least]) {
                    least = j;
                }
            }
            int temporary = arrray[min];
            arrray[min] = arrray[least];
            arrray[least] = temporary;
        }
    }
}
