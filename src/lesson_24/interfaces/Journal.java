package lesson_24.interfaces;

public class Journal implements Printable {

    String title;
    int number;

    // constructor
    public Journal(String title, int number) {
        this.title = title;
        this.number = number;
    }

    //methods
    @Override
    public void print() {
        System.out.printf("Journal - %s, number: %d\n", title, number);
    }

    @Override
    public void test() {
        Printable.super.test();
    }
}
