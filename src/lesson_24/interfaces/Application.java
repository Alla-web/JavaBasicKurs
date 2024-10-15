package lesson_24.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "М. Булгаков");
        book.print();
       /*
       Object objBook = (Object) book; // при этом нам будут доступны
                                        // только методы Object

        */

        Printable book1 = new Book("Philosophy of Java", "B. Ekkel");
        book1.print();

        // new Journal("Cosmopolitan", 12/2024);
        // сборщик мусора удалит этот объект, т.к. на него нет никакой ссылки

        // делаем объект со ссылкой
        Journal journal = new Journal("Cosmopolitan", 122024);
        // здесь будет доступна реализация класса Journal или вышестоящего класса Printable

        Printable printable = journal; // неявное приведение типа ссылки
        printable.print();

        /*
        классы, которые имплементируют интерфейс (implements Printable)
        можно собрать в кучку Printable, т.к. они имеют одинаковый набор методов
         */
        System.out.println("-----------------методы по умолчанию используем----------------------");
        book.test();
        journal.test();

        System.out.println("-----------------статические методы используем----------------------");
        Printable.testStatic("Hello!");

        System.out.println("----------------используем родные и унаследованные методы интерфейсов----------------------");
        Prasatation prasatation = new Prasatation("Наследование", "Без имени", "Наследование в ООП", 20);
        prasatation.print();
        prasatation.colorPrint();
        prasatation.test();



    }
}
