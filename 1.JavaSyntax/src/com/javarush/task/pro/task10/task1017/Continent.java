package com.javarush.task.pro.task10.task1017;

public class Continent {
    private final int area;
    public String name;

    public Continent(int area) {
        this.area = area;
    }

    public Continent(String name, int area) {
        this.name = name;
        this.area = area;
    }
}
