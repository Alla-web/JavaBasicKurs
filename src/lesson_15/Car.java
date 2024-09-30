package lesson_15;

public class Car {

    // 1. Создаём ПОЛЯ КЛАССА, которое будут описывать характеристики (свойства) объектов
    String brand;
    String model;
    String color;
    int year;
    int power;
    int consumption;
    double prise;

    // 2. Пишем КОНСТРУКТОРы КЛАССА
    // 2.1. Конструктор по умолчанию
    public Car() {
    }

    // 2.2. Наши конструкторы
    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(String brand, String model, String color, int year, int power, int consumption, double prise) {
        this(brand, model, color);
        this.year = year;
        this.power = power;
        this.consumption = consumption;
        this.prise = prise;
    }

    // 3. Пишем методы, которые опишут поведение объектов

    public void stay() {
        System.out.println("I am staying");
    }

    public void drive() {
        System.out.println("I am driving");
    }

    public void repair() {
        System.out.println("I am repairing");
    }

    public void whoIAm() {
        System.out.printf("I am %s, my brand is %s, my color is %s, i was created in %d, my power is %d, my consumption is %d, my prise is %f\n", model, brand, color, year, power, consumption, prise);
    }

}
