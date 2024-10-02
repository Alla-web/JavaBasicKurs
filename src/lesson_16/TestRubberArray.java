package lesson_16;

import java.util.Arrays;

public class TestRubberArray {
    public static void main(String[] args) {

        RubberArray_HW16 rubberArray = new RubberArray_HW16();
        System.out.println(rubberArray.toString());

        // Вывод количества элементов в массиве:
        System.out.println("Cейчас длина массива = " + rubberArray.size());

        // Добавление элементов в массив:
        rubberArray.add(10, 20, 30, 40, 50, 60, 70, 80);
        System.out.println("Cейчас длина массива = " + rubberArray.size());
        System.out.println(rubberArray.toString());

        // Возвращение значения по индексу:
        System.out.println("Значение элемента -> " + rubberArray.getElementByIndex(rubberArray.array, 0));






    }
}
