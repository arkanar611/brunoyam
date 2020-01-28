package com.company;

import java.util.Scanner;

public class Reader {
    Student getStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Введите ФИО студента");
        student.fio = scanner.nextLine();
        System.out.println("Введите возраст");
        student.age = scanner.nextInt();
        System.out.println("Введите пол");
        student.sex = scanner.nextLine();
        System.out.println("Введите группу");
        student.group = scanner.nextLine();
        return student;
    }

    Teacher getTeacher() {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.println("Введите ФИО студента");
        teacher.fio = scanner.nextLine();
        System.out.println("Введите возраст");
        teacher.age = scanner.nextInt();
        System.out.println("Введите пол");
        teacher.sex = scanner.nextLine();
        System.out.println("Введите группу");
        teacher.subject = scanner.nextLine();
        return teacher;
    }
}
