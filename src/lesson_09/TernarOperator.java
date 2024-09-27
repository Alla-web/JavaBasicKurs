package lesson_09;

import java.util.Random;
import java.util.SortedMap;

public class TernarOperator {
    public static void main(String[] args) {
        int x = 15;
        String result;

        if (x > 0) {
            result = "положительное";
        } else {
            result = "отрицательное";
        }

        System.out.println("число " + result);
        System.out.println("----------Тернарный оператор--------------------------");
        // Тернарный оператор - альтернатива if / else
        // используется для конструкций с 2-мя вариантами
        String res1 = (x >= 0) ? "положительное" : "отрицательное";
        System.out.println("число " + ((x >= 0) ? "положительное" : "отрицательное"));

        System.out.println("-------------------------------------------------------");
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Your number" + number);
        String result1;
        // создали строку, где будет вывод уведомления при выполнении условий if и else


        if (number % 2 == 0) {
            result1 = "Even number)";
        } else {
            result1 = "Odd number(";
        }

        System.out.println("---Повторяем тоже самое, но с тернарным оператором---");
        System.out.println((number % 2 == 0) ? "Even number" : "Odd number");

        System.out.println("---Тернарный оператор 2 ----");
        int a = random.nextInt(11);
        System.out.println("a -> " + a);
        int b = random.nextInt(11);
        System.out.println("b -> " + b);
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("Your max: " + max);
        System.out.println("---А теперь тоже самое, но тернарным оператором---");
        int max1 = (a > b) ? a : b;
        System.out.println("Your (ternar) max: " + max1);


    }


}