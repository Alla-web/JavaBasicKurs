package lesson_23.absrtracts_class;

public class Dog extends Animal {

    //constructor
    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sayHello() {
        System.out.println("Dog " + name + " says HELLO! BarK!");
    }

    @Override
    void move() {
        System.out.println("Dog " + name + " moves");
    }
}
