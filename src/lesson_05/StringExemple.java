package lesson_05;

public class StringExemple {
    public static void main(String[] args) {

        // обьявление и инициализация переменной типа String
        // String string1 = new String("Hello!"); // не рекомендуется - старый способ создания новой строки }

        String string = "Java"; // рекомендуется
        System.out.println("string: " + string);
        System.out.println("========================================================");

        // Получить количество символов в строке
        int lengthOfStr = string.length(); // метод получения числа символов в строке
        System.out.println("Length of string, characters: " + lengthOfStr);
        System.out.println("========================================================");

        // Перевести все символы строки в верхний регистр
        System.out.println("String (uppercase): " + string.toUpperCase()); // метод перевода символов в верхний регистр
        // String является immutable - неизменной:
        System.out.println("String: " + string);
        System.out.println("========================================================");

        // если я хочу сохранить результат работы методы - я должен сохранить его в какую-то переменную
        String stringUpper = string.toUpperCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);
        System.out.println("========================================================");

        // toLowerCase() - переводит все символы строки в нижний регистр
        stringUpper = stringUpper.toUpperCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println("========================================================");

        // объединение символов строки
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // варианты склеивания / объединения строк
        String concaStr = str1 + str2 + str3;
        System.out.println("concaStr: " + concaStr);
        System.out.println("========================================================");

        // конкатенация vs. мат.операция сложение
        System.out.println(1 + 3); // сложение
        System.out.println(1 + 3 + " : " + 2 + 3);

        // КОНКАТЕНАЦИЯ 1
        /*
        1 + 3 - видит как число и выводит 4,
        а после " : " понимает как символы (после конкатенации) и выводит 23
        */
        System.out.println(1 + 3 + " : " + (2 + 3));
        // чтобы получилось сложение символов до и после конкатенации ("" - символ конкатенации)
        System.out.println((1 + 3) + " : " + (2 + 3)); // можно для верности тоже поставить скобки
        System.out.println("========================================================");

        // Конкатенаяция 2
        String concatStr2 = str1.concat(str2); // к строке str1 пришили строку str2
        concatStr2 = concatStr2.concat(str3); // str1 + str2 + str3
        System.out.println("concatStr2 " + concatStr2);

        // цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat("!"); // (str1 + st2) + str3 + "!"
        System.out.println("concatStr3 " + concatStr3);

        // Конкатенация 3
        // "One", "hello", "java" -> "One hello java"
        String concatStr4 = str1 + " " + str3 + " " + "java";
        System.out.println("concatStr4 " + concatStr4);
        concatStr4 = String.join(" ", str1, str3, "java", "!");
        System.out.println("concatStr4 " + concatStr4);

        // приведение типов
        int id1 = 1;
        int id2 = 2;
        String string2 = "Hello" + id1 + id2; // -> "Hello12"
        System.out.println("string2 " + string2);

        string2 = "Hello" + (id1 + id2); // -> "Hello3"
        System.out.println("string2 " + string2);
        System.out.println("========================================================");


        String digits = "0123456789";

        // метод вывода длины строки - количества символов в строке digits:
        System.out.println("digit.length(): " + digits.length());

        // взять символ из строки digits по его индексу (номеру):
        char firstChar = digits.charAt(0); // берём символ на позиции 0 из строки digits
        System.out.println("firstChar " + firstChar);
        char lastChar = digits.charAt(digits.length() - 1); // рассчитываем последний символ в строке digits
        System.out.println("lastChar " + lastChar);
        System.out.println("========================================================");

        // выделение подстрок
        // выделить подстроку со второго индекса строки digits и до конца строки:
        String subString = digits.substring(2);
        System.out.println("subString " + subString);
        System.out.println("digit " + digits); // изначальная строка остаётся неизменной
        System.out.println("===========================================================");

        // взять все символы (включительно) со 2-го по 7-й:
        String subString2 = digits.substring(2, 7);
        /* в диапазонах Java символы включают начальное значение
        и не включают конечное: 2-й символ включит, а 7-й нет
         */
        System.out.println("subString2 (2-7 characters): " + subString2);


    }
}
