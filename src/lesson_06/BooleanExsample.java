package lesson_06;

import java.util.Random;

public class BooleanExsample {
    public static void main(String[] args) {
        boolean boll = true;
        boll = false;
        int x = 10;
        int y = 5;

        // Операции сравнения

        // сравнение на равенство
        boolean b1 = x == y; // утверждение х равен у. Джава проверяет это утверждение
        System.out.println(x + " == " + y + " -> " + b1); // 10 не равно 10 -> false

        // не равенство
        b1 = x != y; // утверждение х НЕ равен у. Джава проверяет это утверждение
        System.out.println(x + " != " + y + " -> " + b1); // 10 не равно 5 -> true

        // больше ">". х больше чем у
        y = 10;
        b1 = x > y; // 10 равно 10 -> false
        System.out.println(x + " > " + y + " -> " + b1);

        // больше или равно ">="
        b1 = x >= y; // 10 равно 10 -> true
        System.out.println(x + " >= " + y + " -> " + b1);

        // меньше или равно "<="
        x = 7;
        b1 = x <= y; // 7 меньше 10 -> true
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the Best";
        boolean contains = str.contains("Java"); // строка str содержит "Java"
        System.out.println("str.contains(\"Java\"): " + contains);
        System.out.println("==================================================");


        // Логические операции

        // логическое НЕ (отрицание) - меняет значение boolean на противоположное
        boolean b2;
        b2 = !false; // получим противоположное значение false -> true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5)" + b2);

        // логическое и "&"
        // используется, когда нужно, чтобы оба утверждения были ситинными
        // Рим столица Италии и Берлин столица Голландии
        // если хотя бы в одной части выражения будет false, мы получим -> false
        b2 = true & true;
        System.out.println("true & true" + b2);

        b2 = (2 < 5) & (11 == 10); // true & false
        System.out.println("(2 < 5) & (11 == 10): " + b2);

        // введите число от 0 до 100, проверка
        int x1 = 50;
        boolean b3 = x1 > 0 & x1 < 100;

        // логическое или "|"
        // достаточно хотя бы одного истинного условия из условия
        boolean b4 = true | false;
        System.out.println("true | false -> " + b4);

        // введите или чётное или число, которое делится на 5 без остатка
        // чётное число = число, которое делится без остатка на 2

        //генерация случайного числа
        Random random = new Random();
        // в диапазоне от 0 до х
        int rand = random.nextInt(100); // 0 ... 99 включительно
        System.out.println("rand: " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);


        // логическое исключающее ИЛИ (XOR) "^"
        // возвращает true, если две части разные
        /* boolean b5 = true ^ false;
        System.out.println("true ^ false" + b5);
        boolean b5 = false ^ true;
        System.out.println("false ^ true" + b5);
        boolean b5 = false ^ false;
        System.out.println("false ^ false" + b5);
        boolean b5 = true ^ true;
        System.out.println("true ^ true" + b5);
        */
        // TODO

        // Логическое сокращённое И &&
        // выдает true, только если обе части выражения true,
        // но перестаёт проверять, если первая часть уравнения уже false
        boolean b6 = true && false;
        System.out.println("true && false: " + b6);
        b6 = true && true;
        System.out.println("true && true: " + b6);
        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11): " + b6);

        int a = 10;
        int b = 0;

        // правая часть уже не выполняется, т.к. (b != 0) -> уже false, то значение переменной не зависит от правой части -> (a / b > 2)
        boolean b7 = (b != 0) && (a / b > 2);
        System.out.println("a / b > 2: " + b7);

        // логическое сокращённое ИЛИ "||"
        // выдаёт true, если хотя бы отдна часть выражения равна true
        boolean b8 = true || (a / b > 2);
        System.out.println("b8: " + b8);
        System.out.println("==================================================");

        // Приоритет логических операций
        /*
                !  - получаем противоположное значение
                &  - и
                ^  - исключающее ИЛИ (XOR)
                |  - или
                && - и сокращённое
                || - или сокращённое
         */
        System.out.println(true ^ true & false);
        // 1. true & false
        System.out.println(true ^ false);
        // 2. true ^ false
        System.out.println(true);

    }
}
