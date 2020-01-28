package com.company;

public class Student extends Human {
    String group;

    @Override
    public String toString() {
        return super.toString() + " группа " + group;
    }
}
