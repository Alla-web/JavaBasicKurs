package lesson_24.interfaces;

public class Prasatation implements ColorPrintable {

    String title;
    String author;
    String theme;
    int pages;

    //constructor
    public Prasatation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    // methods
    @Override
    public void colorPrint() {
        System.out.println("Отправляю в типографию\n");
        System.out.printf("Printing presentation in colors: %s, by author: %s, title: %s\n", theme, author, title);

    }

    @Override
    public void print() {
        System.out.printf("Presentation %s, by author: %s, title - %s\n", theme, author, title);
    }

}
