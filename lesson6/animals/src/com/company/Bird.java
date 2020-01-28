package com.company;

public class Bird implements Animal, Comparable{
    @Override
    public void eat() {
        System.out.println("Я ем зерно");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
