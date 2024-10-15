package lesson_24.interfaces;

public class Book implements Printable {// implements Printable - значит этот класс подписался
    // реализовать интерфейс, а значит, он должен реализовать все методы интерфейса

    String title;
    String author;

    //constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Alt + Enter - методы - чтобы узнать, какие методы нужно реализовать

    @Override
    public void print() {
        System.out.printf("Book - %s (%s)\n", title, author);
    }
}
