package com.company;

public class Human {
    String fio;
    int age;
    String sex;

    @Override
    public String toString() {
        return "ФИО " + fio + " Возраст " + age + " Пол " + sex;
    }
}
