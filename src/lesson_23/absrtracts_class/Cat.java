package lesson_23.absrtracts_class;

public class Cat extends Animal {

    //конструктор
    public Cat(String name) {
        super(name);

    }

    @Override
    void eat() {
        System.out.println("Cat " + name + " like to eat!!!");
    }

    @Override
    void move() {
        System.out.println("Cat " + name + " moves");
    }
}
