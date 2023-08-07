package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Конвертация оценки из 12-балльной системы в 5-балльную систему");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку в 12-балльной системе: \t\t");
        String mark = scanner.next();

        switch (mark) {
            case "12":
            case "11":
            case "10": {
                System.out.println("Оценка в 5-балльной системе: \t\t"+ "5");
                break;
            }
            case "9":
            case "8":
            case "7": {
                System.out.println("Оценка в 5-балльной системе: \t\t"+ "4");
                break;
            }
            case "6":
            case "5":
            case "4": {
                System.out.println("Оценка в 5-балльной системе: \t\t"+ "3");
                break;
            }
            case "3":
            case "2":
            case "1": {
                System.out.println("Оценка в 5-балльной системе: \t\t"+ "2");
                break;
            }
            default: {
                System.out.println("Ошибка: введенное значение оценки не соответствует 12-балльной шкале!");
            }


        }


        // ВАРИАНТ ДЛЯ ВЕРСИИ JAVA >= 12

        /*
        System.out.println("Конвертация оценки из 12-балльной системы в 5-балльную систему");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку в 12-балльной системе: \t\t");
        String mark = scanner.next();

        int result = switch (mark) {
            case 1, 2, 3 -> 2;
            case 4, 5, 6 -> 3;
            case 7, 8, 9 -> 4;
            case 10, 11, 12 -> 5;
            default -> 0;
        };

        if ( mark == 0) {
            System.out.println("Ошибка: введенное значение оценки не соответствует 12-балльной шкале!");
        } else {
            System.out.println("Оценка в 5-балльной системе: \t\t" + result);
        }*/

        }

    }


