package com.company;

public class Lion implements Animal, Comparable {
    @Override
    public void eat() {
        System.out.println("Я ем мясо");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
