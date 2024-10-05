package lesson_16;

import java.util.Arrays;

public class TestRubberArray {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // создаём объект
        RubberArray_HW16 rubberArray = new RubberArray_HW16();
        /*
        //вызываем геттер для получения массива и записываем его в переменную
        //int[] array = rubberArray.getArray();
         */

        System.out.println(rubberArray.toString());

        System.out.println("-------------Вывод количества элементов в массиве------------");
        System.out.println("Cейчас длина массива = " + rubberArray.totalSize());
        System.out.println(rubberArray.toString());

        System.out.println("-----------Добавление элементов в массив: по одному----------");
        rubberArray.add(100);
        rubberArray.add(200);
        rubberArray.add(300);
        System.out.println("Cейчас длина массива = " + rubberArray.size());
        System.out.println(rubberArray.toString());

        System.out.println("-----------Добавление элементов в массив: несколько----------");
        rubberArray.add(10, 20, 80, 40, 50, 60, 70, 80);
        System.out.println("Cейчас длина массива = " + rubberArray.size());
        System.out.println(rubberArray.toString());

        System.out.println("----------------Возвращение значения элемента массива по его индексу----------------");
        System.out.println("Значение элемента -> " + rubberArray.getElementByIndex(rubberArray.getArray(), 0));

        System.out.println("----------------Удаление элемента массива по его индексу----------------");
        System.out.println(rubberArray.toString());
        rubberArray.remove(0);
        System.out.println("Массив после удаления элемента");
        System.out.println(rubberArray.toString());

        System.out.println("---------------!!!-Удаление элемента массива по его значению----------------");
        rubberArray.removeBiValue(80);
        System.out.println(rubberArray.toString());

        System.out.println("----------Поиск элемента массива по его значению - ПЕРВОЕ вхождение--------");
        System.out.println(rubberArray.toString());
        rubberArray.indexOf(80);

        System.out.println("----------Поиск элемента массива по его значению - ПОСЛЕДНЕЕ вхождение--------");
        System.out.println(rubberArray.toString());
        rubberArray.lastIndexOf(80);
    }
}
