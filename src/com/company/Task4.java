package com.company;

import java.util.Random;

public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] = new int[10];
        Random random = new Random();
        int min = 1;
        int max = 100;
        int diff = max - min;

        for(int i = 0; i < myArr.length; i++){
            int randomNum = random.nextInt(diff + 1);
            randomNum += min;
            randomNum = randomNum /2 * 2;
            myArr[i] = randomNum;
        }

        for (int n : myArr){
            System.out.printf("Число %d\n", n);
        }
        System.out.println("----- конец задачи 4 ------");
    }
}

