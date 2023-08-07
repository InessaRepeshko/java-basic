package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите значение числа x: \t");
        double x = getIntFromConsole();
        System.out.print("Введите значение степени n числа х: \t");
        int n = getIntFromConsole();

        double variableInPower = raiseToPower(x, n);
        System.out.println("Результат операции возведения числа n в степень x:  \t" + variableInPower);
    }

    public static int getIntFromConsole() {
        do {
            int variable;
            if (scanner.hasNextInt()) {
                variable = scanner.nextInt();
            } else {
                System.out.println("Введено неверное значение! Повторите ввод данных.");
                System.out.print("Повторите ввод значения данной переменой : \t");
                scanner.nextLine();
                variable = getIntFromConsole();
                }
            return variable;
        } while (true);
    }

    public static double raiseToPower(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n < 0) {
            return 1 / (x * raiseToPower(1 / x, n + 1));
        } else {
            return x * raiseToPower(x, n - 1);
        }
    }
}
