package com.company;

public class Box {

    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double calculateVolume() {
        return width * height * length;
    }
}
