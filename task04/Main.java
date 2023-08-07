package com.company;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

/*ДЗ 4. Работа с циклами
Человек подтягивается лесенкой: 1 раз, 2 раза, 3 раза, итд.
- Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры
- Вывести сколько времени займет N подходов
* каждое подтягивание занимает 5 секунд, перерыв 60 секунд.
* каждый следующий перерыв между подходами увеличивается на 20%, вывести общее время в формате mm:ss (например 15:45)*/

public class Main {

    public static void main(String[] args) {

        System.out.println("Расчет времязатрат на подтягивания лесенкой и количества выполенных подтягиваний");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество подходов (N):\t");

        int N = scanner.nextInt();  // количество подходов введенное с консоли
        int pullup = 5; // сек, время выполненния одного подтягивания (каждое подтягивание занимает 5 секунд)
        double rest = 60; // сек, время отдыха (перерыв 60 секунд)
        double increment = 1.2; // инкремент, каждый следующий перерыв между подходами увеличивается на 20%

        int restTime = 0; // общее время отдыха между подходами
        int pullupTotal = 0; // общее количество подтягиваний за N подходов
        int pullupTime = 0; // общее время выполнения всех подходов подтягиваний
        int workoutTime = 0; // общее время затраченное на выполнение упражнений

        for (int i = 1; i <= N; i++) {
            pullupTime += pullup;
            restTime += rest;
            restTime = restTime + (int) (restTime * 0.2);
            pullupTotal += i;
        }
        System.out.println("Количество подтягиваний за N подходов: \t" + pullupTotal );

        workoutTime = restTime + pullupTime;
        int minutes = workoutTime / 60;
        int seconds = workoutTime % 60;
        System.out.printf("Cколько времени займет выполенение N подходов: \t %02d:%02d минут\n", minutes, seconds);
        return;

    }
}
