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
        System.out.println(filteredList(strings, 'h'));
    }

    private static List<String> filteredList(List<String> strings, char ch) {

        // boolean startWith(String str) - проверяет, что строка начинается с указанной
        // boolean endWith(String str) - проверяет, что строка заканчивается с указанной
//        boolean res = text.startsWith("Abc"); // true
//        System.out.println("text.startsWith(\"Abc\"): " + res);
//        System.out.println("text.startsWith(\"abc\"): " + text.startsWith("abc")); // false
//        System.out.println(text.endsWith("ef")); // true
//        System.out.println(text.endsWith("f")); // true


        if (strings == null || strings.isEmpty()) return new ArrayList<>();
        Stream<String> stream = strings.stream()
                .filter(string -> Character.toLowerCase(string.charAt(0)) == ch)
                .sorted();

        List<String> filteredList = stream.collect(Collectors.toList());
        return filteredList;
    }


}
