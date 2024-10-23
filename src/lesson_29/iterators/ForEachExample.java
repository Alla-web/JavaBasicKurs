package lesson_29.iterators;

import list.MyArrayGenList;
import list.MyList;

import java.util.Iterator;

public class ForEachExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayGenList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        // цикл for-each
        // более удобная форма записи функционала, который был уже написан
        /*
        for (типПеременной переменная : коллекция элементов) {
            // действия с переменной
            }
         */

        // цикл for-each будет работать только,
        // если мы имплементировали интерфейс Iterable
        for (String s : list) {
            System.out.println(s);
        }

        // цикл for-each НЕ ДОЛЖЕН менять внутри обрабатываемые списки
        // это будет приводить к ошибкам
        // только перебор
        for (String s : list) {
            if(s.equals("World"));
            list.add("JS");
        }
        System.out.println(list);




    }



}
