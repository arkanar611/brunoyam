package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 Кельвин 2 Фаренгейт");
        Scanner scanner = new Scanner(System.in);
        Converter converter;
        switch (scanner.nextInt()){
            case 1: converter = new KelvinConverter();break;
            case 2: converter = new FarenheitConverter(); break;
            default: converter = new KelvinConverter();
        }
        System.out.println("введите температуру");
        convert(converter,scanner.nextInt());
    }

    public static void convert(Converter converter, double t){
        System.out.println("Температура " + converter.convertToCelicia(t));
    }
}
