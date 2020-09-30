package com.company;

import java.util.Scanner;

public class Task7 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Задача 7 ------");
        System.out.println("Введите строку");
        String words = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = scanner.next();
        char[] chr = letter.toCharArray();
        int n = 0;
        char[] ch = words.toCharArray();
        for (char i : ch){
            if (i == chr[0]){
                n+=1;
            }

        }


        System.out.printf("Буква \"%s\" встречается в тексте %d раз\n", letter, n);

        System.out.println("----- конец задачи 6 ------");
    }
}
