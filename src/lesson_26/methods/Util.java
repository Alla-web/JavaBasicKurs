package lesson_26.methods;

import list.MyArrayGenList;

public class Util {


    // ПАРАМЕТРИЗИРОВАННЫЙ метод, возвращающий построковое представление любого массива
    public static <T> String printArray(T[] array) {
        if (array == null || array.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append((i < array.length - 1) ? ", " : "]");
        }
        return sb.toString();
    }

    //метод вывода на печать объекта списка, а не массива
    public static <T> String printArray(MyArrayGenList<T> list) {
        if (list == null || list.size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            sb.append((i < list.size() - 1) ? ", " : "]");
        }
        return sb.toString();
    }

    // поменять местами 2 элемента в любом массиве по их индексу
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Ограничения сверху Upper Bounds

    // метод, который расчитает сумму элементов в массиве
    // это возможно только в числовых массивах

    //чтобы сказать, что метод будет работать только с числовыми данными
    //мы добавляем в параметр "extends Number", т.е. наш тип данных должен быть либо
    //типом Number, либо его наследником
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];

            // doubleValue() потому, что метод возвращает double
            sum += element.doubleValue();
        }
        return sum;
    }

    // метод принимает MyArrayList только с элементами или его наследниками

    //мы хотим принять из параметризированного класса только числовые объекты
    // указываем "? extends Number" в параметрах и читается это как -
    // мы работаем только с объектами Number и его наследниками
    public static double listSum(MyArrayGenList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        return sum;
    }


}
