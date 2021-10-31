package com.pb.didenko.hw2;

import java.util.Scanner;

//2) Напишите программу определения интервала.
//Создайте класс Interval в пакете hw2.
//Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
//Программа должна выяснить в какой промежуток попадает введенное число [0 -14] [15 - 35] [36 - 50] [51 - 100].
//Вывести на экран сообщение с подходящим промежутком.
//Если введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.


public class Interval {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int operand = nextInt();
        if (operand >= 0 && operand < 15) {
            System.out.println("Вхождение в [0 - 14]");
        } else if (operand > 14 && operand < 36) {
            System.out.println("Вхождение в [15 - 35]");
        } else if (operand > 36 && operand < 51) {
            System.out.println("Вхождение в [36 - 50]");
        } else if (operand > 50 && operand < 101) {
            System.out.println("Вхождение в [51 - 100]");
        } else {
            System.out.println("введенное число не попадает в один из имеющихся промежутков");
        }
    }

    public static int nextInt() {
        System.out.println("Введите число.");
        int operand = scan.nextInt();
        return operand;
    }


}
