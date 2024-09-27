package lesson_12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysMain {
    public static void main(String[] args) {

        // О(n)

        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77};
        System.out.println("ints.length: " + ints.length);

        System.out.println("----------------Вызов метода из другого класса--------------");
        // вызов метода из другого класса - ArraysUtils.
        int index = ArraysUtils.linerSearch(ints, 100);
        System.out.println("index: " + index);

        System.out.println("----------------Сортировка чисел массива--------------");

        System.out.println("Массив до сортировки " + Arrays.toString(ints));

        ArraysUtils.sortSelection(ints); // вызвали метод сортировки без присвоения в другой массив
        System.out.println("Массив после сортировки " + Arrays.toString(ints));

        System.out.println("-------------------------------------------------------");

        int number = 87; // ищем чифру 87 в массиве ints
        int idx = ArraysUtils.binarySearch(ints, number);
        System.out.println("Индекс ячейки искомого числа (87) в массиве: " + idx);

        // переназначить число 87 по найденной его ячейке


        System.out.println("----------------Ищем бинарным поиском в ОГРОМНЫХ массивах--------------\n");
        int testArrayLength = 1_000_000;
        int[] testArray = new int[testArrayLength];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(10_001);
        }

        System.out.println("------------------------------------");

        Arrays.sort(testArray); // сортировка - потом разберём

        number = 5000;
        idx = ArraysUtils.binarySearch(testArray, number);
        System.out.println("Индекс ячейки искомого числа (бинарным поиском) " + number + " в " + testArrayLength + " массиве: " + idx);
        // что-то не так - проверить алгоритм бинарного поиска

        System.out.println("------------------------------------");
        // тоже самое но линейным поиском
        idx = ArraysUtils.linerSearch(testArray, number);
        System.out.println("Индекс ячейки искомого числа (линейным поиском) " + number + " в " + testArrayLength + " массиве: " + idx);


    }


}
