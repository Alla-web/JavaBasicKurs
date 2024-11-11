package lesson_42.homeWork;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    Напишите программу, которая проверяет, являются ли две заданные строки
    анаграммами (то есть содержат ли они одинаковые буквы в разном порядке).
    Инструкции:
    Используйте HashMap<Character, Integer> для подсчета количества каждого
    символа в строках.
    Сравните две карты, чтобы определить, являются ли строки анаграммами.

    Пример:
    “listen” и “silent” — анаграммы.
    “triangle” и “integral” — анаграммы.
    “apple” и “papel” — анаграммы.
    “hello” и “billion” — не анаграммы.
     */
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        if (areAnagrams(string1, string2)) {
            System.out.println("Strings " + string1 + ", " + string2 + " are anagrams");
        } else {
            System.out.println("Strings aren`t anagrams");
        }

    }//main

    public static boolean areAnagrams(String str1, String str2) {
        //проверяем совпадают ли длины строк, как одно из условий анаграмм
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram, because they have different length");
            return false;
        }

        //получаем из наших строк карты символ-количество вхождений
        Map<Character, Integer> map1 = getCharMap(str1);
        Map<Character, Integer> map2 = getCharMap(str2);

        return map1.equals(map2);
    }

    private static Map<Character, Integer> getCharMap(String string) {
        string = string.replaceAll("\\s+", " ").toLowerCase();

        //переводим строку в массив символов
        char[] chars = string.toCharArray();

        //создаём результирующую карту ключ (символ) - значение (колчество вхождений)
        Map<Character, Integer> charMap = new HashMap<>();

        //проходимся итератором по массиву символов
        // и записываем сиволы в карту с указанием кол-ва вхождений
        for (char ch : chars) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        return charMap;
    }
}//class
