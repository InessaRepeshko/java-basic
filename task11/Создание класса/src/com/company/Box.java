package com.company;

public class Box {

    private double width;
    private double height;
    private double length;
    private String color;
    private String material;

    public Box(double width, double height, double length) {
        if (!isWidthValid(width) || !isHeightValid(height) || !isLengthValid(length)) {
            return;
        }
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double width, double height, double length, String color, String material) {
        this(width, height, length);
        if (!isColorValue(color) || !isMaterialValue(material)) {
            return;
        }
        this.color = color;
        this.material = material;
    }

    public double calculateVolume() {
        return width * height * length;
    }

    public void setWidth(double width) {
        if (!isWidthValid(width)) {
            return;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (!isHeightValid(height)) {
            return;
        }
        this.height = height;
    }

    public void setLength(double length) {
        if (!isLengthValid(length)) {
            return;
        }
        this.length = length;
    }

    public void setColor(String color) {
        if (!isColorValue(color)) {
            return;
        }
        this.color = color;
    }

    public void setMaterial(String material) {
        if (!isMaterialValue(material)) {
            return;
        }
        this.material = material;
    }

    public double getWidth() { return width; }

    public double getHeight() { return height; }

    public double getLength() { return length; }

    public String getColor() { return color; }

    public String getMaterial() { return material; }

    private  boolean isWidthValid(double width) {
        if (width < 0 || width == 0) {
            System.out.println("Вы ввели неверное значение ширины!");
            return false;
        }
        return true;
    }

    private boolean isHeightValid(double height) {
        if (height < 0 || height == 0) {
            System.out.println("Вы ввели неверное значение высоты!");
            return false;
        }
        return true;
    }

    private boolean isLengthValid(double length) {
        if (length < 0 || length == 0) {
            System.out.println("Вы ввели неверное значение длины!");
            return false;
        }
        return true;
    }

    private boolean isColorValue(String color) {
        if (color == "коричневый" || color == "черный" || color == "белый") {
            return true;
        }
        System.out.println("Вы ввели неверное значение цвета коробки! " +
                "Выберите один из трех доступных цветов: коричневый, черный, белый.");
        return false;
    }

    private boolean isMaterialValue(String material) {
        if (material == "бумага" || material == "картон" || material == "дерево") {
            return true;
        }
        System.out.println("Вы ввели неверное значение материала коробки!" +
                "Выберите один из трех доступных материалов: бумага, картон, дерево.");
        return false;
    }
}
