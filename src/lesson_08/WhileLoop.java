package lesson_08;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while (условие (предикат)) {
        ТЕЛО ЦИКЛА
        - код, который будет повторяться (итерация)
        }
         */

        // Выести на экран числа от 1 до 5

        int number = 1; // инициализация переменной
        while (number <= 5) { // условие (предикат) цикла
            System.out.println(number); // Действие - вывод числа
            number++; // number = number + 1;
        }
        System.out.println("Цикл закончен! Продолжается выполнение программы");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Бесконечный цикл
        /*
        int y = 5;
        while (y < 10){
        System.out.println(y);
        }
         */


        // Распечатать числа от 100 до 90 в порядке убывания
        int digit = 100;

        while (digit >= 90) {
            System.out.println(digit--);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Задача: найти сумму чисел от 1 до 100
        /*
        1. Перебрать числа от 1 до 100
        2. Каждое число добавить в накапливающую сумму чисел
         */
        int i = 1; // инициализация счётчика цикла
        int sum = 0;

        while (i <= 100) {
            sum += i; // sum = sum + 3
            i++;
        }
        System.out.println(i);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Вывести на экран все чётные числа в диапазоне 0 - 21

        /* запустить перебор от 1 до 20
           проверить - является ли число чётным
                если да - печатаем его
                если нет - ничего не делаем
           увеличить счётчик числа
         */

        int n = 1;

        while (n <= 21) {
            if (n % 2 == 0) System.out.println(n);
            n++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // распечатать каждый символ строки
        // перебрать все индексы от 0 до (length - 1)
        // на каждой итерации берём сивол по индексу. Распечатываем
        // Повторить с другим индексом

        String str = "Hello!";
        i = 0;
        while (i <= str.length() -1) {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }





    }
}
