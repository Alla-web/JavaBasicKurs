package lesson_19;

import java.util.Arrays;
import java.util.Random;
import java.util.SortedMap;

public class ArraysExsample_Selflearning {
    public static void main(String[] args) {

        int[] ints = new int[10];
        ints[0] = 60;
        ints[1] = 20;
        ints[2] = 50;
        ints[3] = 40;
        ints[4] = 30;
        ints[5] = 70;
        ints[6] = 55;
        ints[7] = 45;
        ints[8] = 15;
        ints[9] = 5;

        System.out.println("------------------Возвращает построковое представление массива------------------------");
        String intsToString = Arrays.toString(ints);
        System.out.println(intsToString);
        System.out.println(Arrays.toString(ints)); // 2-й способ - сразу печать строку

        System.out.println("------------------Complete Sort array------------------------");
        // Arrays.sort(ints); // сначала отсортировали
        //System.out.println(Arrays.toString(ints)); // потом печатаем построчное представление

        System.out.println("------------------Sort array by code------------------------");
        Arrays.sort(ints, 0, 5);
        System.out.println(Arrays.toString(ints)); // потом печатаем построчное представление

        System.out.println("------------------Binary search------------------------");
        // массив должен быть сначала отсортирован
        int index = Arrays.binarySearch(ints, 60);
        System.out.println("Index of searched element -> " + index);

        System.out.println("------------------Сравнение массивов на равенство------------------------");
        int[] ints1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean arraysEquals = Arrays.equals(ints, ints1);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println("arraysEquals -> " + arraysEquals);
        // должны быть два одинаковых массива с одинаковыми значениями
        // с одинаковым порядком значений элементов

        System.out.println("---------Сравнение массивов на равенство: c какого индекса начинаются отличия-------------");
        int misMathIndex = Arrays.mismatch(ints, ints1);
        System.out.println("Отличия элементов массива начинаются с индекса -> " + misMathIndex);
        // находит и возвращает индекс первого различия между массивами

        System.out.println("-----------------------Многомерные массивы------------------------");
        // возвращает построковое представление массивов, включая вложенные массивы
        int[][] intsA = new int[3][3];
        intsA[0][0] = 10;
        intsA[0][1] = 20;
        intsA[0][2] = 5;

        intsA[1][0] = 6;
        intsA[1][1] = 2;
        intsA[1][2] = 1;

        intsA[2][0] = 11;
        intsA[2][1] = 1;
        intsA[2][2] = 2;

        System.out.println(Arrays.deepToString(intsA));

        System.out.println("---------------Сравнение ногомерных массивов-----------------");
        int[][] intsB = new int[3][3];
        System.out.println(Arrays.deepToString(intsA));
        System.out.println(Arrays.deepToString(intsB));
        boolean intsABEquls = Arrays.deepEquals(intsA, intsB);
        System.out.println("Массивы intsA и intsB равны -> " + intsABEquls);

        System.out.println("-----------------copyOf-----------------------");
        /*
        copyOf - создает новый массив заданной длины. При этом копирует элементы из старого массива
        Кол-во копируемых элементов равно новой длине массива
        Если длина массива больше старого, оставшиеся ячейки заполняются значениями по умолчанию для типа данных массива
        Если длина нового массива меньше старого - не помещающиеся значения обрезаются

         */
        System.out.println(Arrays.toString(ints1));
        int[] copyOfInts1 = Arrays.copyOf(ints1, 15);
        System.out.println(Arrays.toString(copyOfInts1));

        copyOfInts1 = Arrays.copyOf(ints1, 5);
        System.out.println(Arrays.toString(copyOfInts1));

        System.out.println("-----------------copyOfRange-----------------------");
        /*
        copyOfRange - создаёт новый массив и записывает в него значения от индекса from
        до индекса to. Последний индекс не включается (как всегда)
         */
        System.out.println(Arrays.toString(ints1));
        int[] rangeFromInts1 = Arrays.copyOfRange(ints1, 3, 10);
        System.out.println("copyOfRange.ints1, 3, 10 -> " + Arrays.toString(rangeFromInts1));

        System.out.println("----------------System.arraycopy-----------------------");
        /*
        System.arraycopy - принимает 5 параметров
        1) Массив-донор (от куда берём значения);
        2) Индекс, с которого будут браться значения из массива-донора
        3) Целевой массив, куда будут перезаписаны элементы из массива-донора
        4) Индекс с которого начнут записываться эти значения в целевой массив
        5) Сколько значений массива-донора нужно записать в новый целевой массив
         */
        System.out.println(Arrays.toString(ints));
        int[] targerInts = new int[20];
        System.arraycopy(ints, 0, targerInts, 3, 10);
        System.out.println(Arrays.toString(targerInts));

        // в целевом массиве должно быть достаточно места для копируемых элементов
        int[] targerInts1 = new int[5];
        System.arraycopy(ints, 0, targerInts1, 0, 5);
        System.out.println(Arrays.toString(targerInts1));

        System.out.println("----------------fill-----------------------");
        // заполнение массива
        int[] ints2 = new int[10];
        Arrays.fill(ints2, 10);
        System.out.println(Arrays.toString(ints2));

        // альтернатива -  заполняем массив случанйми значениями
        Random random = new Random();
        Arrays.fill(ints2, random.nextInt(10));
        System.out.println(Arrays.toString(ints2));



    } // main area


}// class area
