package lesson_19;

import java.util.Arrays;
import java.util.Random;

public class ArraysExsample {
    // Класс Arrays предоставляет различные статические методы для работы с массивами
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        System.out.println("---------------Возвращает построковое предоставление-----------------");
        // Возвращает построковое предоставление массива
        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("---------------Сортировка массива-----------------");
        // Arrays.sort(array); - полная сортировка
        System.out.println(Arrays.toString(array));

        // сортировка части массива from index???????????????
        Arrays.sort(array, 2,3);
        System.out.println(Arrays.toString(array));

        System.out.println("---------------Бинарный поиск элементов в массиве-----------------");
        // массив должен быть отсортированным
        int index = Arrays.binarySearch(array, 3);
        System.out.println("index -> " + index);
        // если не найдено - возвращается какое-то отрицательное число

        System.out.println("---------------Сравнение массивов на равенство-----------------");
        int[] test = {0, 2, 1, 3};
        System.out.println(array.equals(test)); // для стравнения строк, объектов подходит
        boolean isarraysEquals = Arrays.equals(array, test);
        System.out.println("isarraysEquals -> " + isarraysEquals);
        // должны быть два одинаковых массива с одинаковыми значениями с одинаковым порядком значений элементов

        System.out.println("---------------Сравнение массивов на равенство: c какого индекса отличия-----------------");
        // находит и возвращает индекс первого различия между массивами
        int mismachIndex = Arrays.mismatch(array, test);
        System.out.println("mismachIndex -> " + mismachIndex);

        System.out.println("---------------Многомерные массивы-----------------");
        int[][] arrayD = new int[3][4];
        // возвращает построковое представление массивов, включая вложенные массивы
        System.out.println(Arrays.toString(arrayD)); // печатает только ссылки на эти массивы
        System.out.println(Arrays.deepToString(arrayD));

        System.out.println("---------------Сравнение ногомерных массивов-----------------");
        // сравнение многомерных массивов
        int[][] arrayC = new int[3][4];
        boolean isEquals = Arrays.deepEquals(arrayC, arrayD);
        System.out.println("Arrays.deepEquals(arrayC)" + isEquals);

        arrayC[0][3] = 1;
        arrayC[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));
        boolean isEquals1 = Arrays.deepEquals(arrayC, arrayD);
        System.out.println("Arrays.deepEquals(arrayC)" + isEquals1);

        System.out.println("-----------------copyOf-----------------------");
        /*
        copyOf - создает новый массив заданной длины. при этом копирует элементы из старого массива
        Кол-во копируемых элементов равно новой длине массива
        Если длина нового массива больше старого, оставшиеся ячейки заполняются значениями по умолчанию для типа данных массива
        Если длина нового массива меньше старого - не помещающиеся значения обрезаются
         */
        System.out.println("testArray -> " + Arrays.toString(test));
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest));

        System.out.println("-----------------copyOfRange-----------------------");
        /*
        copyOfRange - создаёт новый массив и записывает в него значения от индекса from
        до индекса to. Последний индекс не включается
         */
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10); // верхний диапазон как-обычно не включается
        System.out.println("Arrays.copyOfRange(ints, 3, 10) -> " + Arrays.toString(rangeFromInts));

        // получить новый массив со значениями старого массива
        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length -> " + Arrays.toString(copyOfInts));

        copyOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOfRange(ints, 0, ints.length) -> " + Arrays.toString(copyOfTest));

        System.out.println("----------------System.arraycopy-----------------------");
        /*
        System.arraycopy - принимает 5 параметров
        1) Массив-донор (от куда берём значения);
        2) Индекс, с которого будут браться значения из массива-донора
        3) Целевой массив, куда будут перезаписаны элементы из массива-донора
        4) Индекс с которого начнут записываться эти значения в целевой массив
        5) Сколько значений массива-донора нужно записать в целевой массив
         */

        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println("target array -> " + Arrays.toString(target));

        System.out.println("----------------fill-----------------------");
        // заполнение массива
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 2, 4, 1000);
        System.out.println(Arrays.toString(arr));

        // альтернатива -  заполняем массив случанйми значениями
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(10));
        System.out.println(Arrays.toString(arr));

    }


}
