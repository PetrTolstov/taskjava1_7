package com.company;

import java.lang.reflect.Array;
import java.util.Random;

public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int[] myArr = new int[10];
        int min = 1;
        int max = 100;
        int diff = max - min;

        Random random = new Random();
        for(int i = 0; i < myArr.length; i++){
            int num = random.nextInt(diff + 1);
            num += min;
            myArr[i] = num;
        }

        int sum = 0;

        for(int n : myArr) {
            sum += n;
        }

        int minN = 100;
        for (int n : myArr){
            if (n < minN){
                minN = n;
            }
        }
        int maxN = 0;
        for (int n : myArr){
            if (n > maxN){
                maxN = n;
            }
        }
        for (int i: myArr) {
            System.out.printf("%4d", i);

        }
        System.out.printf("\nСумма всех чисел массива: %d\n", sum);
        System.out.printf("min = %d\n", minN);
        System.out.printf("max = %d\n", maxN);
        System.out.println("----- конец задачи 3 ------");
    }
}
