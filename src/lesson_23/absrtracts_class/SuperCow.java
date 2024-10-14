package lesson_23.absrtracts_class;

public class SuperCow extends Cow{

    //constructor
    public SuperCow(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("superCow moves");
    }

    @Override
    public void sayHello() {
        System.out.println("Super cow says Hello!");
    }
}
