package lesson_14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class HomeWork_14_Task2 {
    /* Task 2. Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------------------");

        int[] array = {3, 4, 3, 4, 5, 4, 10, 7, 7, 4};
        System.out.println(Arrays.toString(array));
        sumEvenNumber(array);


    } // main area

    public static void sumEvenNumber(int[] arr) {
        int sumEvenNumbers = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                sumEvenNumbers += arr[i];
                System.out.print(arr[i] + ((arr[i] < arr.length - 1) ? ", " : ", "));
            }
        }
        System.out.println();
        System.out.println("Сумма чётных чисел массива = " + sumEvenNumbers);

    }


} // class area




