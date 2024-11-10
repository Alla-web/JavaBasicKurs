package lesson_41.homeWork_41;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    Частотный словарь слов: Напишите метод, который принимает строку текста и
     возвращает Map<String, Integer>, где каждому слову соответствует количество
     его вхождений в текст.
     */
    public static void main(String[] args) {
        String string = " В этой слова повторяются. Слова повторяются несколько раз ";
        Map<String, Integer> wordsFrequency = numberOfDuplicates(string);
        System.out.println(wordsFrequency);

    }//main

    /*
     public static Map<String, Integer> numberOfDuplicates(String string) {
        //разделяем строку на отдельные слова, переводим в нижний регистр
        //убриаем пробелы перед и после строкой, а также орфографические знаки
        string = string.trim().replaceAll("[^a-zA-Z0-9a-яА-Я\\s]", "");
        String[] words = string.toLowerCase().split("\\s");
        System.out.println(Arrays.toString(words));

        //создаём пустую мапу по умолчанию на 16 корзин
        Map<String, Integer> wordsFrequency = new HashMap<>();

        //проходимся итератором по массиву слов, высчитываем частоту повтора и записываем в мапу
        for (String word : words) {
            int count = wordsFrequency.getOrDefault(word, 0);
            wordsFrequency.put(word, count + 1);
        }
        return wordsFrequency;
    }
     */

    public static Map<String, Integer> numberOfDuplicates(String string) {
        //разделяем строку на отдельные слова, переводим в нижний регистр
        //убриаем пробелы перед и после строкой, а также орфографические знаки
        string = string.trim().replaceAll("[^a-zA-Z0-9a-яА-Я\\s]", "");
        String[] words = string.toLowerCase().split("\\s");
        System.out.println(Arrays.toString(words));

        //создаём пустую мапу по умолчанию на 16 корзин
        Map<String, Integer> wordsFrequency = new HashMap<>();

        //проходимся итератором по массиву слов, высчитываем частоту повтора и записываем в мапу
        for (String word : words) {
            int count = wordsFrequency.getOrDefault(word, 0);
            wordsFrequency.put(word, count + 1);
        }
        return wordsFrequency;
    }


}//class
