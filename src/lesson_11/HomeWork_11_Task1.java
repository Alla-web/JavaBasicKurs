package lesson_11;

import java.util.Arrays;

public class HomeWork_11_Task1 {
    /*
    Task 1
Написать метод, который считает сумму всех элементов в массиве.
     */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));
        int sum = calculateSumNumbers(numbers); // здесь вызовем метод
        System.out.println();
        System.out.println("sum: " + sum);
        System.out.println("-------------Olternetive int-----------------------");
        int[] ints = {-1, 2, 3, 4};
        System.out.println(calculateSumNumbers(ints));


    }// main area

    public static int calculateSumNumbers(int[] array) {
        if (array == null || array.length <= 0) {
            //проверяем не null ли наш массив и не 0-е ли у него количество данных
            System.out.println("Программа не может посчитать сумму, т.к. массив не содержит данных");
            return 0;
            //return Integer.MAX_VALUE;
            //return Integer.MIN_VALUE;
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Total sum: " + sum);
            return sum;
        }
    }


} // class area
