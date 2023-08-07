package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getIntFromConsole();
        char operation = getOperation();
        int operand2 = getIntFromConsole();
        int result = doCalculation(operand1, operand2, operation);
        System.out.println("Результат операции:  \t" + result);
    }

    public static int getIntFromConsole() {
        do {
            System.out.print("Введите целое число: \t");
            int operand;
            if (scanner.hasNextInt()) {
                operand = scanner.nextInt();
            } else {
                System.out.println("Введено не целое число! Повторите ввод данных.");
                scanner.nextLine();
                operand = getIntFromConsole();
            }
            return operand;
        } while (true);
    }

    public static char getOperation() {
        char operation;
        System.out.print("Введите операцию: \t\t");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Введена неверная операция! Повторите ввод данных.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int doCalculation(int operand1, int operand2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Введена неверная операция! Повторите ввод данных.");
                result = doCalculation(operand1, operand2, getOperation());
        }
        return result;
    }
}
