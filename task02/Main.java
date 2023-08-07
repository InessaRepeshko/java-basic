package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение массы тела\t(в килограммах):\t\t");
        double weight = scanner.nextDouble();

        System.out.print("Введите значение роста\t(в метрах):\t\t");
        double height = scanner.nextDouble();

        System.out.printf("Индекс массы тела\t(кг/м2) = \t\t %1$f \n", weight/(height*height));

    }
}

