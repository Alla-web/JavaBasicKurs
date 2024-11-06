package lesson_40.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExsample {
    public static void main(String[] args) {
        /*
        тип ссылки поределяет 2 вещи:
        1) ссылку на объект какого типа можно сохранить в эту переменную
        2) список доступных методов
         */

        //Конструкторы ArrayList

        //создает список с начальной ёмкостью 10 элем-в
        List<Integer> list = new ArrayList<>();
        //если мы заранее знаем, что у нас в массиве будет 1000 эл-в,
        // сразу расширяем массив при помощи initialCapacity
        list = new ArrayList<>(50);

        //создаёт список, содержащий все эл-ты указанной колекции
        // (копирует эл-ты из другой коллекции)
        list = new ArrayList<>(List.of(1, 10, 0, 25, -100));

        //Конструкторы LinkedList
        list = new LinkedList<>(); // пустой конструктор

        //создаёт список, содержащий все эл-ты указанной колекции
        // (копирует эл-ты из другой коллекции)
        list = new ArrayList<>(List.of(1, 10, 0, 25, -100));

        System.out.println("-------------------------Методы---------------------");
        //boolean add(E e) - добавляет эл-т в конец
        list.add(1000);
        list.add(-100);
        System.out.println("list" + list);

        //void add(int Index, E element) - добавление элемента на указанную позицию
        list.add(2, 500);
        System.out.println("list" + list);

        // E get(int Index) - геттер
        int value = list.get(5);
        System.out.println("int value = list.get(5) -> " + value);

        // E remove(int Index) - удаляет по указанному индексу,
        // возвращает предидущее/старое значение
        System.out.println("list.remove(5) -> " + list.remove(5));
        System.out.println("list -> " + list);

        //Метод удаления по значению (из интерфейса Collection) - принимает Object (ссылочный тип)
        list.remove(Integer.valueOf(1000));

        System.out.println("-------Поиск элементов по значению. Возвращает индекс------");
        // int index.of(Object obj)
        // int lastIndex.of(Object obj)
        System.out.println(list.indexOf(-100));
        System.out.println(list.lastIndexOf(-100));

        System.out.println("-------------------------Сортировка------------------------");
        //void sort(Comparator<? super E> comparator)
        //сортирует список с использованием указанного компаратора
        list.sort((i1, i2) -> i2.compareTo(i1)); // через лямбда выражения

        /* альтернативный компаратор через анонимный класс
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                i1.compareTo(i2);
            }
        });
         */

        //List<E> sublist(int indexFrom, int indexTo)
        //возвращает список элементов, находящихся в пределах указанных индексов

        List<Integer> sublist = list.subList(1, 5);
        System.out.println("sublist -> " + sublist);

    }


}
