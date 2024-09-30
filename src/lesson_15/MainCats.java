package lesson_15;

public class MainCats {
    public static void main(String[] args) { // точка входа для выполнения программы

        Cat cat = new Cat();
        // создаём объект класса Cat - конструктор по умолчанию
        // 1. Физически создаётся объект в памяти
        // 2. Вызывается конструктор класса для инициализации свойств объекта (заполнение полей)


        cat.sayMeow(); // в переменной вызвали метод sayMeow
        cat.run();
        cat.sleep();

        // по умолчанию все поля инициализируются значениями по умолчанию
        // для своих типов данных:
        // int -> 0
        // double -> 0.00
        // ссылочные, в т.ч. String -> null

        // присвоение переменных
        String catName = cat.name;
        System.out.println("Name: " + catName);

        int catAge = cat.age;
        System.out.println("Age: " + cat.age);

        System.out.println("---------------------------------------------------");

        Cat cat1 = new Cat("Max");
        // Будет новый объект класса cat
        // Строка, которая была передана в конструкторе будет присвоена полю класса name

        System.out.println("color: " + cat1.color);
        System.out.println("name: " + cat1.name);
        System.out.println("---------------------------------------------------");

        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        System.out.println("---------------------------------------------------");
        Cat cat3 = new Cat("Barsik", "whit", 2);
        cat3.whoAmI();



    } // main area


} // class area
