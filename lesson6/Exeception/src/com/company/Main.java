package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("введите пароль");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(!s.equals("пароль")) {
            throw new RuntimeException("Ввел неправильный пароль");
        }
        System.out.println("продолжаем выполнение");
    }

    private static void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("example"));
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


