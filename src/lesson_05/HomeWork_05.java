package lesson_05;

import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {
       /* Task 1.
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени,
другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления)
первого и последнего символа имени.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Length of name: " + name.length());
        char firstLetter = name.charAt(0);
        System.out.println("First letter of name: " + (int) firstLetter);
        char lastLetter = name.charAt(name.length() - 1);
        System.out.println("Last letter of name: " + (int) lastLetter);
        System.out.println("=================================================");

        /* Task 2.
Создайте строки: "Java", "is", "a", "powerful", "language".
Склейте эти строки двумя разными способами, чтобы получить строку:
"Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
         */
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String unitedStr1 = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println("String united1: " + unitedStr1);
        System.out.println("Length of string1: " + unitedStr1.length());


        String unitedStr2 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("String united2: " + unitedStr2);
        System.out.println("Length of string2: " + unitedStr2.length());
        System.out.println("=================================================");

        /*
        Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос:
содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
         */
        String str6 = "super";

        // замена подствроки
        String newUnitedStr = unitedStr1.replace(str4, str6); // меняет все переменные/сочетания символов, которые найдёт в файле
        System.out.println("newUnitedString: " + newUnitedStr);
        System.out.println("Length of newUnitedString: " + newUnitedStr.length());

        String replaseMy = "AbAbAc";
        String replaseMy1 = replaseMy.replaceFirst("Ab", "C"); // нашло первое!!! выражение Ab и заменило его
        System.out.println(replaseMy1);

        // поиск символов в строке
        int index = unitedStr2.indexOf("ava"); // ищет в строке подствроку и будет выдан индекс вхождения в подствоку. Если не найдёт - выведет -1 (такого индекса не существует)
        System.out.println("index: " + index);

        int index1 = unitedStr1.lastIndexOf("ful"); // находит в строке последний символ???
        System.out.println("index1: " + index1);

        boolean containsAge = newUnitedStr.contains("age");
        System.out.println("containsAge: " + containsAge);
        System.out.println("=================================================");

        /*
        Task 3.
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:
Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
         */
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку чётной длины");
        String string3 = scanner.nextLine();
        int middleOfStr = string3.length() / 2 - 1;
        System.out.println("middleOfStr: " + middleOfStr);

        // 1 способ
        char firstChar = string3.charAt(middleOfStr);
        char secondChar = string3.charAt(middleOfStr + 1);
        System.out.println("" + firstChar + secondChar);

        // 2 способ
        String unitedStr = string3.substring(middleOfStr, middleOfStr + 2);
        // +2 - потому что последний предел будет невключён
        System.out.println(unitedStr);

    }


}
