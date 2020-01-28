package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pointOfMenu =-1;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();

        while (pointOfMenu != 0){
            System.out.println("Введите пункт меню:");
            System.out.println("1.Добавить учителя 2.Добавить студента 3. Вывести всех студентов " +
                    "4. Вывести всех преподавателей 0.Выйти");

            pointOfMenu = scanner.nextInt();

            switch (pointOfMenu) {
                case 1: {
                    teachers.add(reader.getTeacher());
                    break;
                }
                case 2: {
                    students.add(reader.getStudent());
                    break;
                }
                case 3: {
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }
                    break;
                }
                case 4: {
                    break;
                }
            }
        }
    }
}
