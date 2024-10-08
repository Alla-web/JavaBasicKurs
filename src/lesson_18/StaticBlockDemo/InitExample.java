package lesson_18.StaticBlockDemo;

public class InitExample {
    // инициализацию сложных ссылочных объектов лучше делать отдельно
    // после объявления и перед конструктором
    static String[] colors; // статика существует до создания объектов
    static int counter = 1;

    private String title = "Hello!";
    // инициализация int-го значния, простого в одну строку, делается в момент объявления этой перемеенной
    private int capacity = 10; // выполняется первым присвоение

    // СТАТИЧЕСКИЙ блок инициализации
    // вызывается только 1 раз в момент загрузки классав JVM и
    // инициализации статических полей до создания объектов

    // инициализировали static String[] colors и static int counter
    static {
        System.out.println("Static init block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";

        counter = 10; // второй запуск
    }

    // можно разделять блоки инициализации статических полей
    static {
        System.out.println("Second static init block run!");
        counter = 100; // 10 перезапишется на 100
    }

    // НЕ СТАТИЧЕСКИЙ  блок инициализации
    // выполняется 1 раз - ДО конструктора
    {
        System.out.println("NON-static init block run!");
        this.title = "NON-static title";
    }

    // constructor
    // если мы инициализируем поля в конструкторе, то
    // мы сможем с ними работать только посе создания объектов
    public InitExample() {
        System.out.println("Constructor run!");
        this.title = "Constructor"; // 2-е присвоение - переприсвоение

    }

    public static void changeColors(String color1, String color2) {
        colors[0] = color1;
        colors[1] = color2;
    }

    public String toString() {
        return "title: " + title + ", capacity: " + capacity + ", static counter: " + counter;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
} // class area
