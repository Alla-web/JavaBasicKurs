package lesson_07;

import java.util.Scanner;

public class HomeWork_07_Task1 {
    public static void main(String[] args) {
        /*
        Task 1
Необходимо написать программу, которая предлагает пользователю
ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: 1, 2, or 3");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("You entered one -> " + number);
        } else if (number == 2) {
            System.out.println("You entered two -> " + number);
        } else if (number == 3) {
            System.out.println("You entered three -> " + number);
        } else if ((number != 1) & (number != 2) & (number != 3)) {
            System.out.println("Wrong number -> " + number);
        }

        switch (number) {
            case 1:
                System.out.println("You entered one -> " + number);
                break;
            case 2:
                System.out.println("You entered two -> " + number);
                break;
            case 3:
                System.out.println("You entered three -> " + number);
                break;
            default:
                System.out.println("Other");
        }
    }
}
