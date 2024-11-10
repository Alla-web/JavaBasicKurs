package lesson_42.homeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    /*
Напишите программу, которая подсчитывает количество слов определенной
длины в заданном тексте (строке).
Инструкции:
Используйте HashMap<Integer, Integer>, где ключом является длина слова,
а значением — количество слов этой длины.
Прочитайте текст и обновите карту соответствующим образом.
Выведите результаты подсчета.
     */
    public static void main(String[] args) {
        String string = "Какое количество слов одной длины содержит этот текст";
        equalWordsNumbers(string);
    }//main

    public static void equalWordsNumbers(String string) {
        String[] words = string.split("\\s");
        System.out.println(Arrays.toString(words));
        Map<Integer, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            wordsMap.put(length, wordsMap.getOrDefault(length, 0) + 1);
        }

        System.out.println(wordsMap);
    }
}//class

