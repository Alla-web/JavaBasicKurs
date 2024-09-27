package lesson_11;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_11_Task2 {
    /*
    Task 2
Написать метод, который находит
среднее значение элементов в массиве (среднее арифметическое).
     */
    public static void main(String[] args) {
        System.out.println("---------Training Random Array----------------------");

        Random random = new Random();
        int[] ints = new int[random.nextInt(5) + 5]; // Получаем случайную длину массива
        System.out.println("Random arrays length: " + ints.length);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(ints));
        System.out.println();

        System.out.println("-----------Среднее арифмнтическое чисел в массиве");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double arithmeticMean = arithmeticMean(numbers); // вызовем метод потом
        System.out.println("arithmeticMean: " + arithmeticMean);

    } // main area

    public static double arithmeticMean(int[] array) {
        if (array == null || array.length <= 0) {
            //проверяем не null ли наш массив и не 0-е ли у него количество данных
            System.out.println("Программа не может посчитать среднее, т.к. массив не содержит данных");
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(Arrays.toString(array));
            System.out.println("sum: " + sum);
            System.out.println("array.length: " + array.length);
            return (double) sum / array.length;
        }
    }

} //
