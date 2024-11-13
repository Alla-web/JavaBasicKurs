package lesson_44.homeWork_44;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task3 {
    /*
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
     */
    public static void main(String[] args) {

        List<Integer> integers = List.of(11, 20, 33, 45, 50, 60);
        filteredIntegers(integers);
    }

    private static void filteredIntegers(List<Integer> integers) {

        List<Integer> newList = integers.stream()
                .filter(integer -> (integer % 2) == 0)
                .map(integer -> integer * 2)
                .collect(Collectors.toList());

        System.out.println(newList);
    }

}
