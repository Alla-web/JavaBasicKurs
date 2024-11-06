package lesson_39.homework_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task1 {
    /*
    Напишите метод, который принимает на вход две реализации интерфейса List.
    Метод должен возвращать список состоящий из элементов,
    которые присутствуют в обеих коллекциях.
     */
    public static void main(String[] args) {
        Collection<Integer> integers1 = new ArrayList<>(List.of(4, 1, 2, 3, 4, 5, 6, 5, 6, 9));
        Collection<Integer> integers2 = new ArrayList<>(List.of(3, 4, 5, 6));

        intersectionOfSets(integers1, integers2);
    }

    //boolean
    public static <T> Collection<T> intersectionOfSets(Collection<T> col1, Collection<T> col2) {

        if ((col1 == null || col1.isEmpty()) || (col2 == null || col2.isEmpty())) {
            return new ArrayList<>();
        }
        System.out.println("col1 -> " + col1);
        System.out.println("col2 -> " + col2);
        //создали копию col1 для сохранения исходного варианта col1 для печати
        Collection<T> result = new ArrayList<>(col1);
        result.retainAll(col2);
        System.out.println("col1.retainAll(col2) -> " + result);
        return result;
    }
}
