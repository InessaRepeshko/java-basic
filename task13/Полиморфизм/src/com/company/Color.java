package com.company;

public enum Color {

    BROWN ("Коричневый", "A52A2A"),
    BLACK ("Черный", "000000"),
    WHITE ("Белый", "FFFFFF"),
    RED ("Красный", "FF0000"),
    ORANGE ("Оранжевый", "FFA500"),
    YELLOW ("Желтый", "FFFF00"),
    GREEN ("Зеленый", "008000"),
    CYAN ("Голубой", "00FFFF"),
    BLUE ("Синий", "0000FF"),
    PURPLE ("Фиолетовый", "800080");

    private String description;

    private String codeHEX;

    Color(String description, String codeHEX) {
        this.description = description;
        this.codeHEX = codeHEX;
    }

    public String getDescription() {
        return description;
    }

    public String getCodeHEX() {
        return codeHEX;
    }
}
