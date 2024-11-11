package lesson_43.homeWork_43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    /*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка,
которые соответствуют всем условиям: четные, больше 10 и меньше 100
Для фильтрации используйте Stream API
     */
    public static void main(String[] args) {
        List<Integer> integers = List.of(100, -2, 35, 14, 56, -60, 78, 87, 900);
        System.out.println(filteredList(integers));
    }

    private static List<Integer> filteredList(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) return new ArrayList<>();
        //получаем отвечающий нашим условям список
        Stream<Integer> stream = integers.stream()
                .filter(integer -> (integer % 2 == 0) && integer > 10 && integer < 100);
        //вызываем терминальный метод и загружаем в него полученный список
        List<Integer> filteredList = stream.collect(Collectors.toList());
        return filteredList;
    }


}
