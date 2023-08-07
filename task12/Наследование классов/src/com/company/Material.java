package com.company;

public enum Material {
    PAPER ("Бумага", "001"),
    CARDBOARD ("Картон", "002"),
    CORRUGATEDBOARD ("Гофрокартон", "003"),
    WOOD ("Дерево", "004"),
    PLYWOOD ("Фанера", "005");

    private String description;

    private String code;

    Material(String description, String code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }
}
