package lesson_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExsample {
    public static void main(String[] args) {
        //интерфейс Collection, который гарантирует наличие базовых методов для
        // всех раширяющих его интерфейсовю Это позволяет единообразно
        // обрабатывать различные типы коллекций

        //создаём коллекцию строк
        //Collection - интерфейс
        //Cсылка типа интерфейс, а справа можем
        // получить разные реализации этого интерфейса
        Collection<String> strings = new ArrayList<>();

        //int size() - возвращает количество эл-в колекции
        System.out.println("strings.size -> " + strings.size());

        // булеан - проверка пустой ли список
        System.out.println("strings.isEmpty -> " + strings.isEmpty());

        //добавление одного элемента
        strings.add("Java");
        strings.add("Python");

        //переопределённый метод туСринг для красивого вывода всех элементов
        System.out.println(strings.toString()); //можно без toString()

        //статический метод .of() в нескольких интерфейсах и классах.
        // Был введён в Джава9. Создаёт неизменяемый экземпляр коллекций из
        // преоставленных элементов. Доступен для Лист, Сэт и Мап
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);//List.of() неизменяемая коллекция
        //integers.add(6);//попытка изменить неизменяемую коллекцию приведёт к ошибке
        System.out.println(integers);

        //добавление сразу несолько элементов
        strings.addAll(List.of("banana", "cat", "car", "1"));
        System.out.println(strings);

        System.out.println("---------------удаление совпадающих элементов-------------------------------------------");
        //boolean removeAll(Collection<?> col) - удаляет все элементы из коллекции вызова,
        //содержащиеся в коллекции col

        //создаём изменяемую коллекцию
        Collection<Integer> numbers = new ArrayList<>(); //new ArrayList<>(); изменяемая коллекция
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5));
        System.out.println("Collection<Integer> numbers" + numbers);
        numbers.removeAll(List.of(3, 2, 1));
        System.out.println("numbers.removeAll(List.of(1,2,3) -> " + numbers);

        System.out.println("---------------пересечение множеств---------------------------");
        //boolean retainAll(Collection<?> col) - оставляется в коллекции вызова только те элементы,
        // которые содержатся в коллекции col (т.е. удаляет все несовпадающие в коллекциях элементы)

        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(10,20,30,20,40,50));
        System.out.println("colA -> " + colA);
        Collection<Integer> colB = new ArrayList<>();
        colB.addAll(List.of(20,30,40));
        System.out.println("colB -> " + colB);
        colA.retainAll(colB);
        System.out.println("colA after colA.retainAll(colB) -> " + colA);
        System.out.println("----------------------------------------------------------");

        //boolean remove(Object obj) - удаляет элемент из коллекции.
        //возвращает true - если такой элемент был
        System.out.println("colA.remove(100) -> " + colA.remove(100));
        System.out.println("colA.remove(40) -> " + colA.remove(40));

        System.out.println("--------все конструкторы принимают другую коллекцию----------");
        //создаётся коллекция, содержащая все эл-ты из указанной коллекции
        Collection<String> strings1 = new ArrayList<>(List.of("Test1", "Test2", "Test3"));
        System.out.println("strings1 -> " + strings1);
        strings1.add("Test4");
        System.out.println("strings1 -> " + strings1);

        System.out.println("-------------------------------------------------------------");
        //передаём коллекцию прямо в конструктор при создании
        Collection<String> stringCopy = new ArrayList<>(strings1);
        System.out.println("stringCopy -> " + stringCopy);
        stringCopy.addAll(strings);
        System.out.println("stringCopy -> " + stringCopy);




    }

}
