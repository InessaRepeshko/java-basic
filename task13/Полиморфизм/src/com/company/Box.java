package com.company;

public class Box {

    protected double width;
    protected double height;
    protected double length;
    protected Material material;


    public Box(double width, double height, double length) {
        if (!isWidthValid(width) || !isHeightValid(height) || !isLengthValid(length)) {
            return;
        }
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double width, double height, double length, Material material) {
        this(width, height, length);
        this.material = material;
    }

    public double calculateVolume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", material=" + material.getDescription() +
                '}';
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

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public Material getMaterial() {
        return material;
    }

    private boolean isWidthValid(double width) {
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
}
