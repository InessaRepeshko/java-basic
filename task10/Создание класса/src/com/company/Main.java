//ДЗ 10. Создать класс Box с полями ширина, высота, длина.
//        Определить метод класса, который вычисляет объем этой коробки
//        (ширина * высоту * длину).
//        Создать 5 конкретных объектов этого класса и
//        задать с помощью конструктора или методов конкретное состояние
//        этих объектов (конкретные величины ширины, высоты и длины).
//        Вывести на экран объемы этих коробок

package com.company;

public class Main {

    public static void main(String[] args){

        Box[] boxesArray = new Box[5];
        for (int i = 0; i < boxesArray.length; i++) {
            boxesArray[i] = new Box(i+1, 10, 10);
            System.out.printf("Объем %1d коробки равен: \t %2$.2f \t %3$s%n", i+1, boxesArray[i].calculateVolume(), "см^3");
        }
    }
}


