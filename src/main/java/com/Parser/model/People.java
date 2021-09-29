package com.Parser.model;

public class People {
    private final String name;
    private final int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + '\'' + ",age=" + age + '}';

    }
}
