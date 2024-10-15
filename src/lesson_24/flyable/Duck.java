package lesson_24.flyable;

public class Duck implements Flyable, Swimmable{

   // метод от имплементированного интерфейса Flyable
    @Override
    public void fly() {
        System.out.println("Duck flying!");
    }

    // метод от имплементированного интерфейса Swimmable
    @Override
    public void swim() {
        System.out.println("Duck swimming!");
    }
}
