package lesson_25.HomeWork_25;

import lesson_16.RubberArray_HW16;

public class RubberArrayGenApp {
    public static void main(String[] args) {
        double[] test = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};

        // создаём объект
        RubberArrayGen<Double> rubberArrayGen = new RubberArrayGen<Double>();
        /*
        //вызываем геттер для получения массива и записываем его в переменную
        //int[] array = rubberArray.getArray();
         */

        System.out.println(rubberArrayGen.toString());

        System.out.println("-------------Вывод количества элементов в массиве------------");
        System.out.println("Cейчас длина массива = " + rubberArrayGen.totalSize());
        System.out.println(rubberArrayGen.toString());

        System.out.println("-----------Добавление элементов в массив: по одному----------");
        rubberArrayGen.add(100.0);
        rubberArrayGen.add(200.0);
        rubberArrayGen.add(300.0);
        System.out.println("Cейчас длина массива = " + rubberArrayGen.size());
        System.out.println(rubberArrayGen.toString());

        System.out.println("-----------Добавление элементов в массив: несколько----------");
        rubberArrayGen.add(10.0, 20.0, 80.0, 40.0, 50.0, 60.0, 70.0, 80.0);
        System.out.println("Cейчас длина массива = " + rubberArrayGen.size());
        System.out.println(rubberArrayGen.toString());

        System.out.println("----------------Возвращение значения элемента массива по его индексу----------------");
        System.out.println("Значение элемента -> " + rubberArrayGen.getElementByIndex(rubberArrayGen.getArray(), 0));

        System.out.println("----------------Удаление элемента массива по его индексу----------------");
        System.out.println(rubberArrayGen.toString());
        rubberArrayGen.remove(0);
        System.out.println("Массив после удаления элемента");
        System.out.println(rubberArrayGen.toString());

        System.out.println("---------------!!!-Удаление элемента массива по его значению----------------");
        rubberArrayGen.removeBiValue(80.0);
        System.out.println(rubberArrayGen.toString());

        System.out.println("----------Поиск элемента массива по его значению - ПЕРВОЕ вхождение--------");
        System.out.println(rubberArrayGen.toString());
        rubberArrayGen.indexOf(80.0);

        System.out.println("----------Поиск элемента массива по его значению - ПОСЛЕДНЕЕ вхождение--------");
        System.out.println(rubberArrayGen.toString());
        rubberArrayGen.lastIndexOf(80.0);
    }
}
