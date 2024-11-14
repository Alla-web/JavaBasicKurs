package lesson_44.homeWork_44;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    /*
    Из списка целых чисел выделите те значения, которые больше 10;
    отсортируйте эти значения по значению последней цифры в числе
    и выведите результат на экране
     */
    public static void main(String[] args) {

        List<Integer> integers = List.of(91, 82, 73, 64, 55, 46, 37, 28, 19);
        //filteredNumbers(integers);
    }

    private static List<Integer> filteredNumbers(List<Integer> integers) {

        integers.stream()
                .filter(integer -> integer > 10)
                .sorted(Comparator.comparingInt(integer -> integer % 10))
                .forEach(integer -> System.out.print(integer + ", "));

        return integers;
    }

}


