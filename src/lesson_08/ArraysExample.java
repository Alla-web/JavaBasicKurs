package lesson_08;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arrays; // объявление массива целых чисел
        String[] strings; // объявление массива строк

        // int arrays1[]; // альтернативный способ объявления массива - не рекомендуется

        // Создание (инициализация) массива в физически памяти с 4-мя ячейками
        arrays = new int[4]; // нумерация ячеек начинается с нуля
        strings = new String[10];

        int[] arrays2 = new int[4]; // объявили и создали массив в одной строке
        boolean[] booleans = new boolean[3];
        /*
        Значение по умовлчанию
        1) для всех числовых типов (в т.ч. char) это будет 0 (0,00)
        2) для boolean - false
        3) для всех ссылочных данных (мы пока знаем только String) - null
         */
        System.out.println("----------Получаем данные из массива-------------------");

        int value = arrays[0]; // получить из массива значение, находящееся в ячейке с индексом ноль
        System.out.println("value -> " + value);
        System.out.println("arrays2 -> " + arrays2);
        System.out.println("strings " + strings);
        System.out.println("booleans -> " + booleans);

        // Распечатать все значения в массиве - не получится!
        System.out.println("arrays1 -> " + arrays2);
        // мы распечатаем ссылку (её визуальное исполнение) на адрес ячейке памяти Heat

        System.out.println("----------Явная инициализация массива-------------------");
        int[] numbers = new int[]{45, 56, -16, 0, 159};
        // компилятор сам посчитает кол-во ячеек и запишет туда данные
        int[] ints = {10, 54, 32333, 44}; // упрощённая форма записи явной инициализации массива
        int val = numbers[0];
        System.out.println("val " + val);
        System.out.println("numbers[4] " + numbers[4]);

        // Изменение (присовение нового) значения ячеек массива
        numbers[2] = 100;

        System.out.println("----------Распечатать все значения в массиве-------------------");
        // Как распечатать все значения в массиве?
        System.out.println("Вывести все значения массива");
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j++] + "; ");
        }
        System.out.println();

        System.out.println("-----Создаём массив на 10 элементов со случайными числами -----");
        // создать массив на 10 элементов и заполнить его случайными числами от 0 до 100
        Random random = new Random();
        int[] nums = new int[10];
        int k = 0;

        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.println(nums[k] + ", ");
            k++;
        }
        System.out.println("]");

        System.out.println("-----Находим минимальное значение в созданном выше массиве -----");
        // найти минимальное значение в массиве
        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве -> " + min);
    }


}

