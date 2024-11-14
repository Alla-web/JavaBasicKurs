package lesson_44;

import lesson_43.Cat;

import java.util.*;
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
        ПРОМЕЖУТОЧНЫЕ методы:
        Stream<T> filter(Rredicate<T> predicate) - оставляет в потоке только те элементы,
            которые predicate вернёт true. Т.е. оставляет эл-ты удовлетворяющие условию (отбрасывает
            эл-ты не отвечающие условию)
        -------
        sorted() - сортирует эл-ты в естесственном порядке
        sorted(Compatator<T> comparator) - сортирует эл-ты
        -------
        Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
        в том числе в другой тип данных

        distinct() - определяет дубликаты из потока, сравнивая эл-ты методом equals

        void peek(Consumer<T> action) - выполняет действие для каждого элемента

        limit(long maxSize) - ограничивает кол-во эл-в в потоке с его начала по указанному
                в нём значению

        skip(long n) - пропускает первые n эл-в в потоке

        mapToObj(IntFunction() mapper) - преобразование примитивного типа данных
                в ссылочный тип при помощи заданной функции

        mapToInt - преобразует поток Stream<Integer> в IntStream (непараметрпзированный)

        boxed() - используется для преобразования потока примитивов в поток их
                соответствующих обёрток (Stream )
         */

        /*
        ТЕРМИНАЛЬНЫЕ методы:
        R collect(Collector <T, A, R> collector) - преобразует эл-ты потока
            в разыне типы коллекции или другие структуры данных

        void forEach(Consumer<T> action) - выполняет действие для каждого элемента

        Optional<T> min(Comparator<T> comparator) - эл-т с минимальным значением в соответствии с компаратором
        Optional<T> max(Comparator<T> comparator) - эл-т с максимальным значением в соответствии с компаратором

        orElse

        ifPresent

        findFirst

        findAny

         */
        //task1();

        //task2();

        //task3();

        //task4();

        //task5();

        //task6();

        //task7();

        //task8();

        //task9();

        //task10();

        //task11();

        //task12();

        task13();
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

    private static void task6() {
        //получить список имён кошек, у которых имена короче 5 символов
        List<Cat> cats = getListCats();

        System.out.println("------------------Более эффективный метод--------------------------------------");
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getName().length() < 6)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());
        System.out.println(catNames);

        System.out.println("------------------Менее эффективный метод--------------------------------------");
        /*
        с точки зрения эффективности работы метода этот (ниже) метод работает менее
        эффективно, т.к. сначала извлекаются у всех объектов, которые позже будут
        отфильтрованы
        ЗОЛОТОЕ ПРАВИЛО - сначала отфильтровуем элементы, а потом преобразовуем их.
        Т.е.сначала прописываем все .filter(), а потом все преобразования
         */
        List<String> catNames2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 6)
                .collect(Collectors.toList());
        System.out.println(catNames2);
    }

    private static void task7() {
        //изменить имя котиков, вес которых меньше 5
        //вывести в консоль все элементы потока

        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5)//отфильровуем котиков
                .peek(cat -> cat.setName("Slim_" + cat.getName()))
                .peek(System.out::println);//выполняем действие для каждого эд-та
        System.out.println("------------------------------");
        catStream.forEach(cat -> System.out.println(cat));
        //catStream.forEach(System.out::println);
        System.out.println("cats -> " + cats);
    }

    private static void task8() {
        //новые объекты класса Cat
        Cat cat1 = new Cat("Bear", 5, "braun");
        Cat cat2 = new Cat("Python", 7, "green");
        Cat cat3 = new Cat("Tiger", 3, "gray");
        Cat cat4 = new Cat("Panda", 4, "black");

        //собради эти объекты в массив
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4};

        //получить список кошек, вес которых больше 4
        List<Cat> bigCats = Arrays.stream(cats)//получить поток из эл-в массива
                .filter(cat -> cat.getWeight() > 4)
                .collect(Collectors.toList());
        System.out.println(bigCats);

        System.out.println("-------------------Тоже самое с проверкой на null---------------------------");
        //новые объекты класса Cat
        Cat cat5 = new Cat("Bear", 5, "braun");
        Cat cat6 = new Cat("Python", 7, "green");
        Cat cat7 = new Cat("Tiger", 3, "gray");
        Cat cat8 = null;

        //собради эти объекты в массив
        Cat[] cats2 = new Cat[]{cat5, cat6, cat7, cat8};

        //получить список кошек, вес которых больше 4
        List<Cat> bigCats2 = Arrays.stream(cats)//получить поток из эл-в массива
                //.filter(cat -> cat != null)//оставить только не null
                //.filter(cat -> Objects.nonNull(cat))//оставить только не null
                .filter(Objects::nonNull)//оставить только не null
                .filter(cat -> Objects.nonNull(cat.getName()))//проверка какого-то поля объекта Cat на null
                .filter(cat -> cat.getWeight() > 4)
                .collect(Collectors.toList());
        System.out.println(bigCats2);
    }

    private static void task9() {
        //создаём стрим Map
        Map<String, Integer> map = new HashMap<>();

        map.put("banana", 1);
        map.put("apple", 5);
        map.put("cherry", 0);

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }

    private static void task10() {
        // min, max, Optional
        // Optional<T> - класс-обёртка, который может содержать, или объект типа Т, или null
        //в методах в возвращаемым типом данных объект может быть не найден искомый объект и
        //вернуться null. Поэтому нужно возвращаемое значение обернуть в Optional<User>

        List<Integer> integers = List.of(15, 14, 59, 32, 24, -1, -6);

        //хочу найти максимальное отрицательное значение
        Optional<Integer> max = integers.stream()
                .filter(integer -> integer < 0)
                .max(Comparator.naturalOrder());

        //Проверка значения в Optional
        //вернёт true, если значение присутствует (т.е. там не null)
        System.out.println("max.isPresent() -> " + max.isPresent());
        //вернёт true, если значение отсутствует (т.е. там null)
        System.out.println("max.isEmpty() -> " + max.isEmpty());


        //1-й метод
        if (max.isPresent()) {
            //возвращает значение, если оно присутствует.
            // Если внутри null - будет исключение - ошибка - noSuchElement
            Integer value = max.get();
            System.out.println("value -> " + value);
        } else {
            System.out.println("Завёрнут null");
        }

        //2-й метод
        //возвращает значение, если оно присутствует.
        // Если внутри null - вернёт defaultValue
        Integer optValue = max.orElse(-1000);
        System.out.println("optValue -> " + optValue);

        //Создание объекта
        Optional.empty();//возвращает пустой Optional (завёрнут null)

        //возвращает Optional с не null значением.
        // Если попфтаемся завернуть null - будет ошибка NPE
        Optional.of(new Object());

        //возвращает Optional. Можно завернуть или значение,
        // или null (вернет пустой Optional)
        Optional.ofNullable(null);
    }

    private static Optional<Cat> findCat(String name) {
        List<Cat> cats = getListCats();
        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
            }
        }
        return Optional.ofNullable(result);
        //заворачивая результирующий объект в Optional мы привлекаем внимание коллег,
        // что нужно проверить объект на null
    }

    //тоже самое, но как мы делали раньше
    private static Cat findCat4(String name) {
        List<Cat> cats = getListCats();

        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;
    }

    private static void task11() {
        List<Cat> cats = getListCats();
        //вернуть самое длинное имя из списка котов
        /*
        Стрим Cat -> Стрим имён
        Найти самое длинное имя
        Сравнить имена по их длине (max + Comparator по длине в порядке возрастания)
         */
        Optional<String> longestName = cats.stream()
                .filter(Objects::nonNull)
                .map(Cat::getName)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length));

        if (longestName.isPresent()) {
            System.out.println(longestName.get());


        } else {
            System.out.println("Котов с именами не найдено");
        }

        String longestNullString = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse(null);

        System.out.println(longestNullString);
    }

    private static void task12() {
        //получить список из 3-х самых маленкьих элементов коллекции
        List<Integer> integers = List.of(0, 5, 1, 4, 7, 55, 78);
        integers = List.of(10, 5);
        List<Integer> smallestIntegerList = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallestIntegerList ->" + smallestIntegerList);


        //получить массив чисел, отбросив 2 самых маленьких
        List<Integer> array = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("array -> " + array);

        //
        Integer[] arrayIntegers = integers.stream()
                .toArray(Integer[]::new); //new - вызов конструктора и передача в метод

    }

    private static void task13() {
        //преобразовать коллекцию примитивов в коллекцию
        // (коллекции не работают с примитивами)
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> integers = Arrays.stream(ints)
                .boxed()
                //.mapToObj(i -> i)
                //.mapToObj(i -> Integer.valueOf(i)) //альтернативный вариант предыдущему
                .collect(Collectors.toList());
        System.out.println(integers);

        //
        int[] intsArray = integers.stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println("intsArray -> " + intsArray);

    }
}
