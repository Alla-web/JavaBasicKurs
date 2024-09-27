package lesson_10;

import java.util.Random;

public class ForLoopExemple {
    public static void main(String[] args) {
        // несколько раз повторять в коде один и тот же функционал - это ошибка.
        // такой функционал нужно выносить в метод и потом применять его там, где нужно

        /*
        for (БЛОК инициализации> ;
            <БЛОК проверок/условие выхода из цикла> ;
                !!! главное условие, чтобы условие было булевым - давало ответ true или false
            <БЛОК изменений>) {
            Тело цикла
        }
            Ни один из блоков цикла не являются обзательными!
        */

        // Вывести все числа от 0 до 10
        System.out.println("------- Вывести все числа от 0 до 10-----WHILE-----------");
        int j = 1;
        System.out.print("[ ");
        while (j <= 10) {
            System.out.print(j + ((j < 10) ? ", " : " ]\n"));
            j++;
        }
        System.out.println("End the while loop " + j); // переменная j остаётся висеть

        System.out.println("------- Вывести все числа от 0 до 10-----FOR-----------");
        System.out.print("[ ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ((i < 10) ? ", " : " ]\n"));
        }
        //System.out.println("End the while loop " + i); - выдаст ошибку, потому что
        // переменная видна только в области видимости for

        /*
        Как работает for:
        1. Объявлена и инициализирована переменная - int i = 0;
        2. Проверка условия i <= 10; - если условие выполняется
            - 1 раз запускается тело цикла
        3. После выполнения цикла метод идёт в переменную цикла - i++
            и в нашем случае увеличивает её на 1 и снова в блок проверки
            и так по кругу, пока выполняется условие проверки
        */

        System.out.println("--------Блоки не обязательные-----------------");
        // Ни один из блоков не является обязательным

        /*
        for ( ; ; ) {
            System.out.println("Hello World!");
        }
        получаем бесконечный цикл, т.к. условия выполнения цикла не заданы
        */

        for (j = 8; j <= 10; j++) { // мы переназначили ранее обьявленную переменную j
            System.out.print(j + ", ");
        }

        System.out.println("----------------Переполнение типа данных-------------------");
        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 += 1_000_000_000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();
        System.out.println("i1 -> " + i1);
        // доходим до максимального значения типа int -> 2 147 483 648,
        // потом идём в его минусовое значение и приходим в переполнение данных

        // в блоке инициализации может быть переменная любого типа
        System.out.println("-----------------Любые переменные в инициализации-----------");

        for (String string = "Hello"; string.length() < 10; string += "!") {
            System.out.println(string);
        }

        System.out.println("------Инициализация нескольких переменных в блоке цикла-------");
        // мы можем инициализировать неколько переменных в блоке инициализации
        // а также в блоке изменений можем менять несколько переменных

        int k = 14;
        // завели 2 int-х переменных в блоке инициализации
        // задали изменения сразу 3-х переменных в блоке изменний
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        System.out.println("-----------Создаём массив целых чисел случайной длины--------");
        // Создать массив целых чисел случайной длины в диапазоне от 5 до 15
        // Заполнить массив случайными числами от -50 до 50 включительно
        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5]; // получить случайную длину от 5 до 15
        System.out.println("Arrays length: " + ints.length);
        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // получаем числа (0..100) - 50 -> (-50..50)
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : " ]\n"));
        }

        System.out.println("----------continue, break--------------");
        // continue, break - операторы продолжения и прирыва цикла

        System.out.println("------все подряд значения i от 0 до 6------");
        // циклы перебирают все значения от 0 до 6
        for (int i = 0; i < 7; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("------continue -> все подряд значения i от 0 до 6, кроме 3------");
        // циклы перебирают все значения от 0 до 6, кроме 3
        for (int i = 0; i < 7; i++) {
            if (i == 3) continue;
            // прервать текущую итерацию и перейти к следующей итерации цикла
            // Мы перейдем в блок изменения переменных, потом в блок проверки условия
            // В текущей итерации после continue все операторы в теле цикла будут пропущены.
            // по сути -> цикл дошёл до значения i = 3, пропустил его и пошёл дальше
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("------break -> все подряд значения i от 0 до 3------");
// циклы перебирают все значения от 0 до 6, кроме 3
        for (int i = 0; i < 7; i++) {
            if (i == 3) break;
            // break заканчивает текущую итерацию цикла и весь цикл.
            // Все последующий итерации выполнены не будут
            // по сути -> цикл дошёл до значения i = 3 и закончился на этом
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("----------while: continue, break--------------");
        // continue и break работают аналогичным образом в циклах while

        int y = 0;
        while (y < 7) {
            if (y == 3) {
                y++;
                continue;
            }
            System.out.print(y++ + ", ");
        }
        System.out.println("\nEnd while loop with continue");

        int y1 = 0;
        while (y1 < 7) {
            if (y1 == 3) {
                y1++;
                break;
            }
            System.out.print(y1++ + ", ");
        }
        System.out.println("\nEnd while loop with continue");


    }
}
