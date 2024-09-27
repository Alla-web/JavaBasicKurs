package lesson_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork_10_Task3 {
    /*
        Task 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел,
присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
         */
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        int[] primeArray = getArrayWithOnlyPrime(numbers);
        System.out.println(Arrays.toString(primeArray));
        System.out.println();
    }

    public static int[] getArrayWithOnlyPrime(int[] numbers) {
        // считам количество простых чисел
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        System.out.println("count: " + count);

        // если количество простых чисел = 0, мы возвращаем пустой массив
        if (count == 0) return new int[0];

        // создаём массив, где будут храниться только простые числа
        int[] result = new int[count];

        // заполнить массив простыми числами
        for (int i = 0, idxPrime = 0; i < numbers.length && idxPrime < count; i++) {
            if (isPrime(numbers[idxPrime++])) {
                result[idxPrime++] = numbers[i];
            }
        }
        return result;
    }

    // метод для проверки чисел простые ли они
    public static boolean isPrime(int number) {
        // простые числа как-правило нечётные и больше единицы
        if (number <= 1) return false; // т.е. наше число не является простым

        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i != 0) return false;
            count++;
            if (number % i == 0)return false;
        }
        return true;
    }
} // class area
