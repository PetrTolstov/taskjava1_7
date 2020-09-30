package com.company;

import java.util.Random;

public class Task6 {
    public void run() {
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][];
        boolean b = false;
        int n = -1;

        Random random = new Random();


        int min = 1;
        int max = 100;
        int diff = max - min;

        for (int i = 0; i < myArr.length; i++) {

            if (i == 5 | b) {
                b = true;
                n++;
            } else {
                n = i;
            }
            int num = n + 5;
            myArr[i] = new int[num];
            for (int j = 0; j < myArr[i].length; j++) {
                int randomNum = random.nextInt(diff + 1);
                randomNum += min;

                myArr[i][j] = randomNum;
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            for (int nu : myArr[i]) {
                System.out.printf("%4d", nu);

            }
            System.out.println("");

        }
        System.out.println("----- конец задачи 6 ------");
    }
}
