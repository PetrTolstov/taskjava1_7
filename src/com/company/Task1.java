package com.company;

import java.util.Scanner;

public class Task1 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        int C = scanner.nextInt();
        int T = (C * 9 / 5) + 32;
        System.out.printf("По Фарингейту это будет: %d\n", T);
        System.out.println("----- конец задачи 1 ------");
    }
}
