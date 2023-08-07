package com.company;

public class ColorBox extends Box {

    protected Color color;

    public ColorBox(double width, double height, double length, Material material, Color color) {
        super(width, height, length, material);
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", material=" + material.getDescription() +
                ", color=" + color.getDescription() +
                '}';
    }
}
