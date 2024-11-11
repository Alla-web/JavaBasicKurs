package lesson_43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
    /*
    Stream api - часть библиотеки - не нужно ничего встраивать.
    - мощный инструмент, позволяющий обрабатывать наборы инструментов в декларативном стиле.
    Декларативный стиль - это ???
    Stream - это поток данных, который представляет собой последовательность элементов.
    Поток даёт нам возможность поочерёдного получения элемента данных для обработки.
    Stream может быть создан из различных источников(массивы, коллекции, и т.д., но 90% из коллекций)
    Потоки это способ получения и поледовательной обработки данных.

    PipeLine - последовательность операций, выполняемых на потоке

    Промежуточные операции (методы) - это операции, кот. преобразуют поток в другой поток (возвращают поток).
    Их может быть много (как минимум больше, чем одна).


    Терминальные операции (методы) - это операции, которые запускают обработку потока и закрыват его.
    Их может быть ТОЛЬКО ОДИН!
    После выполнения терминальной операции поток перестаёт быть доступным для дальнейшей обработки

    Ленивые операции:
    //стримы не выполняют промежуточные операции, пока не вызван терминальный метод


    Как создать поток:
    stream() - создание потока из элементов коллекции

    */

        /*
        Промежуточные методы:
        Stream<T> filter(Rredicate<T> predicate) - оставляет в потоке только те элементы,
            которые predicate вернёт true. Т.е. оставляет эл-ты удовлетворяющие условию (отбрасывает
            эл-ты не отвечающие условию)
        -------
        sorted() - сортирует эл-ты в естесственном порядке
        sorted(Compatator<T> comparator) - сортирует эл-ты
        -------
        Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
        в том числе в другой тип данных
         */

        /*
        Терминальные методы:
        R collect(Collector <T, A, R> collector) - преобразует эл-ты потока
            в разыне типы коллекции или другие структуры данных
         */
        //task1();

        //task2();

        //task3();

        //task4();

        task5();
    }

       private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {

        //привычная нам схема
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        //получит список, содержащий положительные числа
        // и отсортировннай в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer i : integers) {
            if (i > 0) {
                result.add(i);
            }
            result.sort(Comparator.naturalOrder());
            System.out.println(result);
        }

        //у всех коллекций есть метод stream(), создающий поток из элементов коллекции
        List<Integer> integerList = integers.stream()//создание потока на основе элементов списка
                //вызываем ПРОМЕЖУТОЧНЫЕ методы:
                //фильтрация элементов потока^
                .filter(i -> i > 0)
                //сортировка эл-тов в порядке возрастания:
                .sorted()
                //вызываем ТРМИНАЛЬНЫЙ метод:
                //собирает эл-ты потока в коллекцию лист
                .collect(Collectors.toList());

        System.out.println("integerList -> " + integerList);

        //PipeLine
        //integers.stream().filter(i -> i>0).sorted().collect(Collectors.toList());

    }


    private static void task2() {
        List<Cat> cats = getListCats();

        //получить список кошек с весом больше 4 килограмм
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);
        //Терминальный метод
        List<Cat> fatCats = catStream.collect(Collectors.toList());
        //повторно использовать "закрытый"(на котором был вызван терминальный метод) поток нельзя.
        //fatCats = catStream.filter(c -> c.getWeight() > 5).collect(Collectors.toList()); - будет исключение (ошибка)

    }


    private static void task3() {
        List<Cat> cats = getListCats();

        //получить список котов с именем, длинее 4 символов
        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);
        //!!! стримы не выполняют промежуточные операции, пока не вызван терминальный метод ->
        List<Cat> longName = stream.collect(Collectors.toList());
    }

    private static void task4() {
        List<Cat> cats = getListCats();
        //Получить список имён всех кошек

        //Получить поток элементов другого типа
        Stream<String> names = cats.stream()
                .map(cat -> cat.getName());
        //поток не закрыт - на нём не вызван ТЕРМИНАЛЬНЫЙ метод
        //поэтому мы можем спокойно сделать альтернативно:

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("catNames -> " + catNames);
    }

    private static void task5() {

        //изменить тип потока Cat -> name (String)
        //собрать в список

        //получить список имён кошек, чей вес больше 4 кг
        List<Cat> cats = getListCats();

        //создать поток
        //оставить там кошек, чей вес больше 4 кг
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
//                .map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

}
