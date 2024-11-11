package lesson_43.homeWork_43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    /*
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную
букву (например, "A"), удалите дубликаты и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
     */
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "World", "Happy", "day", "hat", "apple", "banana");
        System.out.println(filteredList(strings));
    }

    private static List<String> filteredList(List<String> strings) {
        if (strings == null || strings.isEmpty()) return new ArrayList<>();
        Stream<String> stream = strings.stream()
                .filter(string -> Character.toUpperCase(string.charAt(0)) == 'H');

        List<String> filteredList = stream.collect(Collectors.toList());
        return filteredList;
    }


}
