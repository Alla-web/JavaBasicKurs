package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_14_Task3 {
/*
Task 3 * (Опционально)
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
 */

    public static void main(String[] args) {
        int[] array1 = new int[15];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("---------------------------------------------------");

        int[] array = {6, 0, 8, 10, 7, 3, 1, 1, 10, 6};
        System.out.println(Arrays.toString(array));


    } // main area

    public static int secondBigNumber(int[] array) {
        if (array.length < 2) {
            System.out.println("Массив должен содержать более 1 числа");
        }
        return -0;
    }


} // class area
