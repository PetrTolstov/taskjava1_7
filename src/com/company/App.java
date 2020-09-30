package com.company;

import java.util.Scanner;

public class App {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания: ");;
        int C = scanner.nextInt();
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        while (true) {
            switch (C) {
                case 1 -> task1.run();
                case 2 -> task2.run();
                case 3 -> task3.run();
                case 4 -> task4.run();
                case 5 -> task5.run();
                case 6 -> task6.run();
                case 7 -> task7.run();
                default -> System.out.println("Wrong");
            }
        }
    }
}
