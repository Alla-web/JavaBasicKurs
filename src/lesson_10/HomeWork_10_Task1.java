package lesson_10;

import java.util.Arrays;

public class HomeWork_10_Task1 {
    /* Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy Arrays.copyOf() использовать нельзя.
Суть задачи - написать собственную реализацию этого метода
         */
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        copyOfArrey(array, 10);

        int[] array2 = null;
        copyOfArrey(array2, 10);

        // null - это способ указать, что ссылка не ссылается ни на какой объект
        String str = null;
        str = "java";
        // чтобы избежать ошибки нужно делать проверку строки на null:
        if (str != null) {
            System.out.println("str.length: " + str.length());
            System.out.println("toUpperCase: " + str.toUpperCase());
        }

        int[] array1 = null;
        if (str.equals("java")) {
            array1 = new int[10];
        } else {
            array1 = new int[2];
        }


    } // main area


    public static void copyOfArrey(int[] array, int newLength) {

        if (array == null) {
            return;
        }

        int[] result = new int[newLength];
        // Массив всегда заполняется значениями по-умолчанию:
        //      числовые (byte, short, int, long, float, double, char) -> 0
        //      ссылочные типы (в том числе String) -> null

        // printArray(result); - наш метод для печати массива
        // существующий метод для печати массивов
        String arrayStr = Arrays.toString(result); // - получаем строку
        System.out.println(arrayStr); // - печатаем строку
        System.out.println(Arrays.toString(result)); // делаем всё в одной строке

        // переносим данные в созданный в этом методе массив из входящего массива
        for (int i = 0; i < array.length && i< result.length; i++) {
            // условие - прекратить работу цикла, когда мы достигнем длины array или result
            result[i] = array[i];
        }
        System.out.println(Arrays.toString(result)); // делаем всё в одной строке





    }


    // метод для печати массива
    public static void printArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
    }


} //class area
