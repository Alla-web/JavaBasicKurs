package lesson_40.set;

import java.util.*;

public class SetExample {
    /*
    Для корректной работы hach-коллекций есть важное првило, называющееся -
    Контракт между методами equals() и hachCode()
    и состоит из 3-х условий:
        1) если 2 объекта равны по методу equals(), их hach-коды должны быть равны
        2) если hach-коды 2-х объектов различны, то объекты точно не равны по методу equals()
            Обратное не всегда верно, т.е. разные объекты могут иметь одинаковый hach-код и
            называется это КОЛЛИЗИЯ.
        3) вызов метода hachCode() должен возвращать одиниковое значение при
            многократном ввзове на неизменённом объекте
Т.е. после написания наших классов мы должны перегинерировать наши методы equals() и hachCode()
     */
    public static void main(String[] args) {

        System.out.println("-----------------------Кострукторы-------------------------");
        //создаём пустой hach-сэт ёмкостью 16 и коэффициент загрузки 0,75
        Set<Integer> set = new HashSet<>();

        // создаёт пустой hach-сэт с заданной ёмкостью и коэффициент загрузки 0,75
        set = new HashSet<>(20);

        //создаёт новый hach-сэт, содержащий уникальные элементы из указанной коллекции
        set = new HashSet<>(List.of(1, 2, 3, 4, 5, 3, 6, 3, 3, 3, 6, 6, 6, 9, 9, 10, 10)); //дубликаты не поддреживаются
        System.out.println("set -> " + set);

        System.out.println("--------------------------Methods---------------------------");
        //создали стартовый список целых чисел
        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 3, 8, 6, 15, 7, 0, 16, 32));

        //HashSet не поддерживает порядок элементов
        //поменялся порядок элементов (отсортировался)
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers -> " + integers);

        //LinkedHashSet удаляет дубликаты, но сохраняет порядок элементов
        Set<Integer> linkedHashSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedHashSet -> " + linkedHashSet);

        System.out.println("----------------------Set methods-----------------------");
        System.out.println("----------------------добавление элемента по значению-----------------------");
        // add() добавление элемента
        // вернет true, если элемент добавлен
        System.out.println("integers.add(100) -> " + integers.add(100));
        System.out.println("integers" + integers);
        //2-й раз нельзя добавить, т.к. будет дубликат, а дубликаты не поддерживаются
        System.out.println("integers.add(100) -> " + integers.add(100));
        System.out.println("integers -> " + integers);

        System.out.println("------------------удаление элемента по значению--------------------");
        //remove() - удаление эл-та по значению
        System.out.println("integers.remove(100) -> " + integers.remove(100));
        System.out.println("integers -> " + integers);
        System.out.println("integers.remove(100) -> " + integers.remove(100));
        System.out.println("integers -> " + integers);

        System.out.println("----------------сожержит----------------------");
        //contains() - проверяет присутствие значения во множестве (в сэте)
        System.out.println("integers.contains(100)" + integers.contains(100));
        System.out.println("integers.contains(32)" + integers.contains(32));

        /*
        int size() - показывает кол-во элементов множества
        boolean isEmpty() - показывает пустое ли множество, если да выдаёт true
        slear() - удаляет все эл-ты
        iterator() - для перебора элементов множества
         */
        for (Integer value : integers) {
            System.out.print(value + ", ");
        }
        System.out.println();

        /*
        неаписать метод, который принимает список (лист) и возвращает список (лист)
        состоящий только из уникальных элеменнтов начального списка - убрать дубликаты

        deleteDuplicates()
         */

        System.out.println("----------------------------SortedSet-------------------------");
        System.out.println("--------------------------Constructors------------------------");
        //по умолчнию естественный порядок, если реализован Comparable

        //создаёт пустое упорядоченное в естесственном порядке множество
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.addAll(startValues);
        System.out.println("sortedSet - > "+ sortedSet);

        System.out.println("----------------------------------------------------");
        //конструктор, принимающий колекцию. Естесственный порядок
        //будут переданы все элементы из передаваемой коллекции
        sortedSet = new TreeSet<>(startValues);
        System.out.println("sortedSet - > "+ sortedSet);

        System.out.println("-----------------------Comparator-----------------------------");
        // коснтруктор с компаратором, определяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());//обратный естессвенному порядок сортировки
        treeSet.addAll(startValues);
        System.out.println("treeSet -> "+treeSet);

        treeSet=new TreeSet<>((i1, i2) -> i1.compareTo(i2));
        treeSet=new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet -> "+treeSet);

        System.out.println("------------------------Methods-------------------------");
        //first() - возвращает самый левый (наименьший по мнению Comparator-a) элемент
        System.out.println("sortedSet.first() -> " + treeSet.first());

        //last() - возвращает самый правый (наибольший по мнению Comparator-a) элемент
        System.out.println("sortedSet.last() -> " + treeSet.last());

        // создали новое множество
        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.println("integerSortedSet -> " + integerSortedSet);

        //heatSet(E element) - возвращает часть множества,
        //элементы которого строго меньше чем принимаемый элемент
        //метод создаёт новое множество, исходное оставляя без изменений
        SortedSet<Integer> heatSet = integerSortedSet.headSet(8);
        System.out.println("heatSet -> " + heatSet);

        //tailSet(E element) - возвращает часть множества,
        //элементы которого строго больше или равны, чем принимаемый элемент
        //метод создаёт новое множество, исходное оставляя без изменений
        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8);
        System.out.println("tailSet -> " + tailSet);

        //subSet(E fromElement, E toElement) - возвращает новое множество, которое находится
        // в диапазоне от fromElement (включительно) до toElement (не включительно)
        SortedSet<Integer> subSet = integerSortedSet.subSet(3, 16);
        System.out.println("subSet -> " + subSet);

        //comparator() - возвращает компаратор, используемый для упорядочивания элементов
        // в этом множестве. Вернёт null, если используется естесственный порядок:
        System.out.println("integerSortedSet.comparator() -> " + integerSortedSet.comparator()); //здесь естесственный порядок
        System.out.println("treeSet.comparator() -> " + treeSet.comparator()); //здесь используется компаратор на лямбда выражени

        //присвоим го в компаратор
        Comparator<Integer> comparator = (Comparator<Integer>) treeSet.comparator();
        System.out.println("comparator -> " + comparator);

    }//Main

    public static <T> List<T> deleteDuplicates(List<T> list) {
        System.out.println(list);
        //получить множество без дубликатов
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

}

