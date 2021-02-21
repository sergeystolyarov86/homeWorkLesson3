package com.company;
// Сдаю домашку с одним заданием,второе задание сделаю позже для себя
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random numbers = new Random();
            int tryInput = 0;
            int random = numbers.nextInt(9);
            System.out.print("Угадай число от 0 до 9");
            System.out.println("");
            while (tryInput < 3) {
                int number = input.nextInt();
                if (number > random) {
                    System.out.println("Загаданное число меньше");
                } else if (number < random) {
                    System.out.println("Загаданное число больше");
                } else if (number == random) {
                    System.out.println("Ты угадал!");
                    break;
                }
                tryInput++;
            }
            System.out.print("Повторить игру еще раз? 1 – да / 0 – нет" + "  ");
            String inpUser = input.next();
            if (inpUser.equals("1")) {
                main(null);// этот шаг подглядел
            } else if (inpUser.equals("0")) {
                System.out.println("Игра окончена!");
            }


    }
}

















