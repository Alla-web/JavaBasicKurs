package lesson_17;

public class CatApp {
    public static void main(String[] args) {
        // создали объект
        Cat_17 cat = new Cat_17("Catty", 8, 5);


        //Cat_17 cat2 = new Cat_17();

        cat.sayMeow();
        System.out.println(cat.toString());

        // меняем значения переменных
        // cat.name = null; // не доступны, т.к. помечены privet
        //cat.age = -1000;
        // cat.weight = 1500; // не доступны, т.к. помечены privet
        cat.toString();
        System.out.println(cat.toString());

        // геттеры
        String name = cat.getName();
        System.out.println("name " + name);
        System.out.println("age  " + cat.getAge());
        System.out.println("weight  " + cat.getWeight());

        // сэттеры
        cat.setAge(25);
        System.out.println(cat.toString());






    }
}
