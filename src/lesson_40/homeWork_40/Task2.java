package lesson_40.homeWork_40;

import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    /*
    Создайте два множества строк (Set<String>), каждое из которых будет
    заполнено различными словами. Некоторые слова должны повторяться в обоих множествах.
    ----------------------------------------------------
    Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
    содержащее все уникальные элементы из обоих множеств (объединение множеств).
    ----------------------------------------------------
    Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает
    множество, содержащее только элементы, которые присутствуют в обоих исходных множествах
    (пересечение множеств).
    ----------------------------------------------------
    Реализуйте метод difference(Set<String> set1, Set<String> set2),
    который возвращает множество элементов, которые есть в первом множестве,
    но отсутствуют во втором (разность множеств).
    ----------------------------------------------------
    Результат каждого метода необходимо выводить в консоль для наглядности.
    Следует обеспечить, чтобы в исходных множествах были как уникальные,
    так и общие элементы для наглядности результатов операций.
         */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(set1,set2));
        System.out.println(intersection(set1,set2));
        System.out.println(difference(set1,set2));
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        //все уникальные элементы из обоих множеств (объединение множеств)
        result.addAll(set2);
        return result;
    }

    private static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        //элементы, которые присутствуют в обоих исходных множествах (пересечение множеств)
        result.retainAll(set2);
        return result;
    }


    private static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        //элементы, которые есть в первом множестве, но отсутствуют во втором (разность множеств)
        result.removeAll(set2);
        return result;
    }

}
