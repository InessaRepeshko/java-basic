package com.company;

public class Warehouse {
    private Box[] arrayBoxes;
    private int quantity = 0;

    public Warehouse() {
        arrayBoxes = new Box[10];
    }

    public Warehouse(int capacity) {
        arrayBoxes = new Box[capacity];
    }

    public void addBox(Box box) {
        if (quantity + 1 > arrayBoxes.length) {
            System.out.println("Ошибка: склад переполнен!");
            return;
        }
        arrayBoxes[quantity++] = box;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Warehouse{\n");
        for (int i = 0; i < quantity; i++) {
            result.append("\t")
                    .append((i+1) +".")
                    .append(arrayBoxes[i].toString())
                    .append("\n");
        }
        result.append("}");

        return result.toString();
    }
}
