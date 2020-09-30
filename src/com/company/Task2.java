package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public void run() {
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        int min = 5;
        int max = 10;
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println("Отгадай: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == i) {
            System.out.println("Ты выиграл");
        } else {
            System.out.println("Ты ты проиграл");
        }
        System.out.printf("Число равно: %d\n", i);
        System.out.println("----- конец задачи 2 ------");


    }
}
