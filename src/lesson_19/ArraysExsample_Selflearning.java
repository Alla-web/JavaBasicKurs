package lesson_19;

import java.util.Arrays;
import java.util.SortedMap;

public class ArraysExsample_Selflearning {
    public static void main(String[] args) {

        int[] ints = new int[5];
        ints[0] = 60;
        ints[1] = 20;
        ints[2] = 50;
        ints[3] = 40;
        ints[4] = 30;

        System.out.println("------------------Возвращает построковое представление массива------------------------");
        String intsToString = Arrays.toString(ints);
        System.out.println(intsToString);
        System.out.println(Arrays.toString(ints)); // 2-й способ - сразу печать строку

        System.out.println("------------------Complete Sort array------------------------");
        // Arrays.sort(ints); // сначала отсортировали
        //System.out.println(Arrays.toString(ints)); // потом печатаем построчное представление

        System.out.println("------------------Sort array by code------------------------");
        Arrays.sort(ints, 1,5);
        System.out.println(Arrays.toString(ints)); // потом печатаем построчное представление

        System.out.println("------------------Sort array by code------------------------");




    } // main area


}// class area
