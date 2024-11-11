package lesson_43;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        //Функциональный интерфейс - имеет один абстрактный метод

        System.out.println("----------------------interface Consumer<T> ------------------------");
        /*
        Consumer<T> - выполняет операцию над объектом типа T и ничего(никакого результата) не возвращает
        void accept(T t)
         */
        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {

            }
        };

        Consumer<String> printConsumer = string -> System.out.println(string);
        printConsumer.accept("Hello World!");
        printConsumer.accept("Hello JAVA World!");

        System.out.println("-----------------составной interface Consumer<T>-------------------");
        Consumer<String> consumer1 = string -> System.out.println("1. " + string.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");
        //составляем оба консьюмера в один общий:
        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        System.out.println("---------------------Predicate<T>-----------------------");
        /*
        Predicate<T> - функция, которая принимает объект типа T и возвращает булевое значение
        такая себе проверка на соответствие условию
        boolean test(T t) - абстрактный метод

        and() - логическое И(&&)
        or() - логическое ИЛИ (||)
        nagate() - логическое ОТРИЦАНИЕ (!)
         */

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        //проверяем, что строка не пустая
        Predicate<String> isNotEmpty = string -> !string.isEmpty();
        boolean result = isNotEmpty.test("Hello, World!");
        System.out.println(result);
        System.out.println("isNotEmpty.test(\"\") -> " + isNotEmpty.test(""));

        //Метод, возвращающий список всех элементов, удовлетворяющих усовию
        //список всех чётных чисел
        List<Integer> nunbers = new ArrayList<>(List.of(-1, 3, 4, 10, -10, -45, 11, 17, 24));
        //список всех отрицательных чисел
        List<Integer> res1 = filterByPredicate(nunbers, integer -> integer < 0);
        System.out.println("integer < 0 -> " + res1);

        //список всех положительных чисел
        List<Integer> res2 = filterByPredicate(nunbers, integer -> integer > 0);
        System.out.println("integer > 0 -> " + res2);

        //список всех чётных элeментов списка
        List<Integer> res3 = filterByPredicate(nunbers, integer -> integer > 0 && (integer % 2) == 0);
        System.out.println("integer > 0 && (integer % 2) == 0 -> " + res3);

        System.out.println("---------------------составной Predicate-------------------");
        Predicate<String> isLengthGreate6 = string -> string.length() > 6;
        Predicate<String> isContainsJava = string -> string.contains("Java");
        String test = "Java!";
        Predicate<String> combineString = isLengthGreate6.or(isContainsJava);
        System.out.println("combineString.test(test) -> " + combineString.test(test));


        System.out.println("---------------------Function<T, R>-----------------------");
        /*
        Function<T, R> - производит операцию над объектом типа T и возвращает результат типа R
        R apply(T t)
         */

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        Function<String, Integer> function = string -> string.length();
        int length = function.apply("Hello World");
        System.out.println("(Hello World) length -> " + length);

        //Function<String, String> toUpperCase = string -> string.toUpperCase();
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println("toUpperCase.apply(\"Test string\") -> " + toUpperCase.apply("Test string"));

        Function<String, String> concatenate = FunctionalInterfaces::test;
        String result1 = concatenate.apply("Hello World");
        System.out.println("result1 -> " + result1);

    }

    public static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer integer : integers) {
            if (predicate.test(integer)) {
                result.add(integer);
            }
        }
        return result;
    }

    public static String test(String str) {
        return str + "!!!";
    }


}
