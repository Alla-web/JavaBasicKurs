package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int y = 20;

        //if (y > 11) System.out.println("Всем привет");
        // если условие true - выполняется команда - вывести текст на экран
        /*
        if (условие) оператор - {блок кода}
        если условие выполняется - идёт на выполнение следующая команда
        если условие не выполняется - следующая команда не запускается
         */
        //
        if (y > 11) {
            System.out.println("Всем привет");
            System.out.println("у = " + y);
            System.out.println("Сейчас у меня выполняется условие! Мы в блоке if");
        } else if (y > 7) {   // else-if оператор второго условия после if - {блок кода}
            System.out.println("Мы находимся в блоке else-if");
            System.out.println("у = " + y);
        } else {    // else - оператор - {блок кода}
            System.out.println("Мы находимся в блоке else");
            System.out.println("у = " + y);
        }


        System.out.println("Продолжение программы");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else if (number == 10) {
            System.out.println("Вы ввели число 10");
        } else {
            System.out.println("Вы ввели неверное число!");
        }
        System.out.println("=============================================");

        // нахождение минимума из нескольких чисел
        Random ranndom = new Random();
        int v1 = ranndom.nextInt(50);
        int v2 = ranndom.nextInt(50);
        int v3 = ranndom.nextInt(50);
        System.out.println(v1 + " | " + v2 + " | " + v3 + " | ");
        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) {
            min = v3;
        }
        System.out.println("min -> " + min);

    }
}
