package lesson_15;

public class Flower {
    // 1. Создаём ПОЛЯ КЛАССА, которое будут описывать характеристики (свойства) объектов
    String name;
    String color;
    double prise;

    // 2. Пишем КОНСТРУКТОРы КЛАССА
    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Flower(String name, String color, double prise) {
        this(name, color);
        this.prise = prise;
    }

    // 3. Пишем методы, которые опишут поведение объектов
    public void blow() {
        System.out.println("I am blooming bright");
    }

    public void smell() {
        System.out.println("I am smelling good");
    }

    public void whoIAm() {
        System.out.printf("I am %s, my color is %s, my prise is %f euro\n", name, color, prise);
    }
}// clas area
