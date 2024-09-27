package lesson_07;

import java.util.Scanner;

public class HomeWork_07_Task3 {
    public static void main(String[] args) {
        /*
        Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом,
должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом".
Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:
Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
         */
        System.out.println("Enter your four-digit");
        Scanner scanner = new Scanner(System.in);
        String fourDigit = scanner.nextLine();
        System.out.println("Length of digit -> " + fourDigit.length());

        if (fourDigit.length() != 4) {
            System.out.println("Wrong digit");
            System.out.println("Your four-digit -> " + fourDigit);
            // я не понимаю, почему программа идёт дальше( ведь уловие НЕ выполняется?
        } else {
            char char1 = fourDigit.charAt(0); // charAt(0) - 48
            char char2 = fourDigit.charAt(1);
            int sum1 = (char1 - '0') + (char2 - '0'); // сравнить можно и по сумме кодов!
            System.out.println("sum1 -> " + sum1);

            char char3 = fourDigit.charAt(2);
            char char4 = fourDigit.charAt(3);
            int sum2 = (char3 - '0') + (char4 - '0');
            System.out.println("sum2 -> " + sum2);

            System.out.println("-------------------------------");

            if (sum1 == sum2) {
                System.out.println("Lucky ticket! :)");
            } else {
                System.out.println("Not lucky ticket! :)");
            }
        }

        System.out.println("-------------------------------");


        if (fourDigit.length() == 4) {
            int input = Integer.parseInt(fourDigit);
            System.out.println("input " + input);

            // 1234
            int digit0 = input % 10;
            input = input / 10;

            int digit1 = input % 10;
            input = input / 10;

            int digit2 = input % 10;
            input = input / 10;

            int digit3 = input % 10;
            input = input / 10;
            System.out.println(digit0 + " | " + digit1 + " | " + digit2 + " | " + digit3);


        }


    }
}
