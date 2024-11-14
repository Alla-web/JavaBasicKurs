package lesson_44.homeWork_44;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {
    /*
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
     */
    public static void main(String[] args) {
        List<String> strings = List.of("I", "want", "to", "go", "home");

        shortestString(strings);
    }

    private static Optional<String> shortestString(List<String> strings) {

        Optional<String> shortestString = strings.stream()
                .min(Comparator.comparing(String::length));

        return shortestString;
    }


}
