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
        getUniqueSortedWords(string);

    }// main

    public static List<String> getUniqueSortedWords(String string) {
        System.out.println("string -> " + string);

        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").split(" ");

        Set<String> setList = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(setList);

        List<String> list1 = new ArrayList<>(setList); //преобразуем сэт для сортировки
        list1.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())); //сортируем сэт
        System.out.println(list1);

        return list1;
    }

}//class
