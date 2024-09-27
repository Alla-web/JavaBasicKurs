package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class SelfLearning {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("==========Увеличиваем число до 5-ти================");
        int rand = random.nextInt(11);
        System.out.println("rand -> " + rand);
        System.out.println("---------------------------------------------------");
        while (rand <= 5) {
            System.out.println("rand -> " + rand);
            rand++;
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Программа выполнилась! Едем дальше");

        System.out.println("======Выбираем меньшее число из списка чисел=======");

        int[] arrays = {1, 2, 3, 4, 5};
        System.out.println(arrays[0] + " | " + arrays[1] + " | " + arrays[2] + " | " + arrays[3] + " | " + arrays[4]);
        int min = arrays[0]; // задаём певый символ массива как минимальный
        int i = 1;

        // цикл для поиска минимального значения
        while (i > arrays.length) {
            if (arrays[i] > min) { // проверяем не меньше ли символы массива чем min
                min = arrays[i]; // если да -> записываем их в min
            }
            i++; // увеличиваем номер символа на 1
        }
        System.out.println("min -> " + min);

        System.out.println("--------------------------Arrays----------------------------");
        int[] arrays1; // обьявили массив
        arrays1 = new int[10]; // создали массив с 10-ю ячейками (нумерация начинается с нуля)

        int[] arrays2 = new int[10]; // объявили и создали массив с 10 ячейками

        int arrVal = arrays1[0];
        System.out.println(arrVal);
        System.out.println("============================================================");

        // выводит на печать цифры от 1 до 5
        int number = 1;
        while (number <= 5) {
            System.out.print(number + ", ");
            number++;
        }
        System.out.println();

        System.out.println("============================================================");
        // Напишите программу (с while), которая вычисляет сумму
        // всех чисел от 1 до 10

        int n = 10;

        int digit = 1; // переменная для отслеживания текущего числа
        int sum = 0; // переменная для хранения суммы

        while (digit <= n) {
            sum += digit; //
            digit++;
        }
        System.out.println("Sum -> " + sum);

        System.out.println("===================Яблоки уменьшаются====================================");

        // Задача о яблоках (начальное значение 30 яблок).
        // Запустить цикл, в котором яблоки берутся из корзины до тех пор,
        // пока они там есть. Последнее сообщение: "Яблоки кончились!".


        int apples = 30;
        int count = 1; // переменная для остлеживания числа и количества циклов

        while (count <= 30) {
            apples = apples - 1;
            //apples -= 1; более коротко
            count++;
        }
        System.out.println("We don`t have more apples -> " + apples);

        System.out.println("===================Яблоки уменьшаются №2====================================");

        int apples0 = 30;

        while (apples0 < 30) {
            apples0 = apples0 - 1;
            //apples -= 1; более коротко
        }

        System.out.println("Осталось яблок -> " + apples);

        System.out.println("===================Яблоки увеличиваются================================");
        // Задача о яблоках (начальное значение 0 яблок). Запустить цикл,
        // где яблоки кладутся в корзину, пока она не заполнится (50 яблок влазит),
        // за раз в коризу кладут по 3 яблока.
        // Последнее сообщение: "Корзина полная!".

        int apples1 = 0; // can be sum or other variables for accumulate
        int count1 = 1; // сколько яблок кладём в корзину за 1 раз
        int basket = 50;

        while (apples1 < 50) {
            apples1 = apples1 + count1;
            // apples1 += count1;
        }
        System.out.println("Basket ist full -> " + apples1);

        System.out.println("============Print numbers=========================");
        // Распечатать числа от 100 до 90 в порядке убывания
        int number1 = 100;

        while (number1 >= 90) {
            //System.out.print(number1 + ", ");
            //number1 = number1 - 1;
            //number1--; или так
            System.out.print(number1-- + ", "); // боле кратко
        }
        System.out.println();

        System.out.println("============Sum of numbers=========================");
        // Найти сумму чисел от 1 до 100

        int number2 = 1;
        int sum2 = 0;
        while (number2 <= 100) {
            sum2 = sum2 + number2;
            // sum2 += number2;
            number2++;
            System.out.print(sum2 + ", ");
        }
        System.out.println();
        System.out.println("Sum of digits from 1 to 100 -> " + sum2);

        System.out.println("============Print even numbers=========================");
        // вывести на экран все чётные числа от нуля до 21
        int n1 = 1;

        while (n1 <= 21) {
            if (n1 % 2 == 0) System.out.print(n1 + " ");
            n1++;
        }
        System.out.println();

        System.out.println("============Print all characters of string=========================");

        String str = "Alla + Marharyta";
        int i2 = 0; // номер символа в строке


        while (i2 < str.length()) {
            System.out.print(str.charAt(i2) + " ");
            i2++;
        }
        System.out.println();

        System.out.println("============Sum digits=========================");
        /*
        Напишите программу, которая вычисляет сумму всех чисел от 1 до N,
        где N - это число, введенное пользователем.
        Условия:
            Пользователь вводит число N.
            Программа вычисляет сумму всех чисел от 1 до N с помощью цикла while.
            Выводится результат суммы.
         */
        int digit3 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digit");
        int n3 = scanner.nextInt();
        System.out.println();
        System.out.println("Your entered digit -> " + n3);

        int sum3 = 0;

        while (digit3 <= n3) {
            sum3 = sum3 + digit3;
            digit3++;
            System.out.println("Interim sum " + sum3);
        }
        System.out.println("Total sum -> " + sum3);

        System.out.println("============Sum digits=========================");
        /*
        Найдите произведение всех чисел от 1 до 15 включительно.
        Результат выведите на экран
         */

        int digit4 = 1;
        long product = 1;
        while (digit4 <= 15) {
            product *= digit4;
            digit4++;
        }
        System.out.println("Total product -> " + product);


    }


}
