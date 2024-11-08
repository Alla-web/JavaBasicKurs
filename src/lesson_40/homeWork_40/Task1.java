package lesson_40.homeWork_40;

import java.lang.reflect.Array;
import java.util.*;

public class Task1 {
    /*
    Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
    отсортированный в порядке увеличения длин слов.
    Если строки имеют одинаковую длину - сортировать в естественном порядке
     */
    public static void main(String[] args) {
        String string = "Тестовая строка для удаления слов, которые повторяются. \\\"строка\\\" для удаления!";
        System.out.println("Список уникальных слов: "+getUniqueSortedWords(string));

    }// main

    public static List<String> getUniqueSortedWords(String string) {
        System.out.println("string -> " + string);
        //удалили пробелы вначала и вконце (trim()), а в середине не трогаются пробелы, знаки припинания из нашей строки
        string = string.trim().replaceAll("[^a-zA-Z0-9a-яА-Я\\s]", "");
        System.out.println("string -> " + string);

        //разделили строку на отдельные слова по пробельному символу и записали их в массив стрингов
        String[] words = string.split("\\s"); //ищи пробелы в ловах
        System.out.println(Arrays.toString(words));

        //создаём коллецию
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));
        return new ArrayList<>(uniqueWords);
    }

}//class
