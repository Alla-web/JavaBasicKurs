package lesson_15;

public class Cat {

    // ПОЛЯ КЛАССА, которое описывают характеристики (свойства) кота (по сути это переменные)
    public String name;
    public String color;
    public int age; // или double если нецелые

    // КОНСТРУКТОР КЛАССА
    // специальный тип метода, который автоматически устанавливает начальные значения свойств объекта
    /*
    1. Имя конструктора совпадает с именем класса
    2. Конструктор не имеет возвращаемого типа (void не указывается)
    3. Конструктор вызывается автоматически при создании объекта
     */

    // КОНСТРУКТОРА: Java-class не может существовать без КОНСТРУКТОРА
    public Cat(String catName) {
        name = catName; // запиши автоматически это в переменную name при вызове метода
    }

    // Конструктор по умовлчанию:
    public Cat() {

    }
    // и мы получили перегрузку конструктора

    public Cat(String catName, String color) {
        name = catName; // без this потому что name и catName
        this.color = color; // обращаюсь к текущему объекту и говорю ему присвоить тот color, который пришёл в методе, иначе будет конфликт
        // ключевое слово this используется в нутри класса для ссылки на текущий объект
        // this поможет нам для разрешения конфликта имен между полями класса и параметрами методов конструкторов
    }

    public Cat(String name, String color, int age) {
        //this(name, color); // вызов другого конструктора должен всегда идти 1-й строкой исполняемого кода
        // вызов конструктора класса, принимающий 2 стринги
        // соответствующие поля будут проинициализированы
        // this может для вызова использования других конструкторов класса
        // или передачи текущего объекта в качестве параметров метода

        this.name = name;
        this.color = color;
        this.age = age;
    }

    //ПОВЕДЕНИЕ ОБЪЕКТОВ описывают методы
    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void run() {
        System.out.println("I am running");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }

}// class area
