package com.company;

import java.util.Random;

public class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");

        Random random = new Random();

        int myArr[][] = new int[10][5];

        int min = 1;
        int max = 100;
        int diff = max - min;


        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                int randomNum = random.nextInt(diff + 1);
                randomNum += min;
                myArr[i][j] = randomNum;

            }
        }
        for(int i = 0; i < myArr.length; i++){
            for(int n : myArr[i]){
                System.out.printf("%4d", n);

            }
            System.out.println("");
        }

        System.out.println("----- конец задачи 5 ------");
    }
}
