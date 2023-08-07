//ДЗ 13. Применение полиморфизма
//Для классов Box и ColorBox из предыдущей домашки переопределить метод toString класса Object,
// в котором в реализации класса Box выводить информацию о длинне, ширине и высоте, а также материала коробки,
// а для класса ColorBox - всю ту же информации плюс информацию о цвете коробки.
//Также создать класс Склад (Warehouse, например), который будет в себе содержать массив коробок
// (именно базовый тип коробок - Box) и количество коробок, которые уже добавлены в этот массив.
// Массив создавать в конструкторе этого класса (размер массива принимать как параметр конструктора).
// Реализовать метод в этом классе для добавления коробки в массив (тип брать опять же базовый - Box),
// предусмотреть валидацию - проверять, можно ли ещё добавить в массив коробку, количество добавленных коробок
// не должно превышать длину масcива. Также переопределить метод toString для этого класса -
// который будет выводить информацию о всех коробках, которые хранит в себе склад.
//В методе main создать экземпляр класса Склад (задать его вместимость с помощью конструктора).
// Заполнить склад коробками (разными - как экземплярами Box, так и ColorBox)
// и вывести информацию о складе (вызвать метод склада toString).

package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args){

        Box box = new Box(2.35, 3.5, 5, Material.WOOD);
        System.out.println(box.toString());

        Box colorBox = new ColorBox(2, 3, 4, Material.CARDBOARD, Color.WHITE);
        System.out.println(colorBox.toString());

        Warehouse warehouse = new Warehouse(5);

        for (int i = 1; i <= 7; i += 2) {
            warehouse.addBox(new Box(i, i, i , Material.CARDBOARD));
            warehouse.addBox(new ColorBox(i, i, i, Material.CARDBOARD, Color.BROWN));
        }

        System.out.println(warehouse);

    }
}


