package lesson_07;

import java.util.Scanner;

public class HomeWork_07_Task4 {
    public static void main(String[] args) {
        /*
        Task 4
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее.
Если 6 или 7 — "Выходной".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Day off");
                break;
            case 7:
                System.out.println("Day off");
        }

    }
}
