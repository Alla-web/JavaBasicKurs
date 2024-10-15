package lesson_24.flyable;

public class Airplane extends Transport implements Flyable {

    // constructor
    public Airplane(int capacity) {
        super(capacity);
    }

    // methods
    // от родителя Transport
    @Override
    boolean takePassenger() {
        if (amount < capacity) {
            amount++;
            return true;
        }
        return false;
    }

    // от имплементированного интерфейса Flyable
    @Override
    public void fly() {
        System.out.println("Airplane flying!");
    }
}
