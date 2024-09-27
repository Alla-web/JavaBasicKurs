package lesson_10;

import java.util.Random;

public class MethodWithReturn {
    public static void main(String[] args) {
        System.out.println("----------------Возвратный метод-------------");
        int a = 5;
        int b = 10;

        int sum1 = sum(a, b); // 2. пишу куда вернуть результаты расчёта
        System.out.println(sum1);
        sum1 = sum(10, 20); // вызываем метод и возвращаем его результат
        System.out.println(sum1);

        System.out.println("----------------Возвратный метод -> Число в квадрате-------------");
        System.out.println("squareNumber -> " + squareNumber(2.5)); // распечатали
        double var1 = squareNumber(4.0);
        System.out.println("var1 = " + var1);

        System.out.println("----------------Возвратный метод -> Строка-------------");
        String concat = concatStr("Java", 17);
        System.out.println("concat -> " + concat);

        System.out.println("---Метод создает массив интов на 10 элементов. Заполняет случайным значениями---");
        int[] ints = fillArray();

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println();


    } // main area

    // Метод создает массив интов на 10 элементов. Заполняет случайным значениями
    public static int[] fillArray() { // метод не принимает ничего
        int[] result = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(101);
        }
        return result;
    }


    // String метод, который переводит все типы в строку
    public static String concatStr(String str, int x) {
        String result = str + x + "!!!";
        return result;
    }

    // double-метод, который считает квадрат числа
    public static double squareNumber(double number) {
        /*
        double result = number * number;
        return result;
        */
        return number * number;
    }


    // int-метод, который рассчитывает сумму чисел
    public static int sum(int x, int y) {
        /*
        я хочу, чтобы мой метод не просто рассчитал результат и распечатал его в консоль,
        а мне нужно использовать результат расчёта в дальнейшем коде, тогда
        */
        // 1. метод int, а не void, потому что он будет возвращать int-е значение, и
        // тип метода зависит от типа вохвращаемых данных
        int result = x + y;
        return result; // указываем, что мы возвращаем при срабатывании метода и завершаем его работу
    }


} // class area
