package com.pb.didenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число с пяти попыток.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 5; // Допустимое количество попыток.
        int attempt = 0;           // Счетчик попыток.

        Scanner in = new Scanner(System.in);

            Random random = new Random();
            int x = random.nextInt(101);

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;

            }
            Integer i1 = new Integer(value);
            if (i1 != x) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}
