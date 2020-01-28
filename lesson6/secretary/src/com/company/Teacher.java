package com.company;

public class Teacher extends Human{
    String subject;

    @Override
    public String toString() {
        return super.toString()+ " предмет: " + subject;
    }
}
