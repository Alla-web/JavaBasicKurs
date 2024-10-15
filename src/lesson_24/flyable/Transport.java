package lesson_24.flyable;

public abstract class Transport {

    int capacity;
    int amount;

    //constructor
    public Transport(int capacity) {
        this.capacity = capacity;
    }

    // getters and setter
    public int getCapacity() {
        return capacity;
    }

    public int getAmount() {
        return amount;
    }

    //methods
    abstract boolean takePassenger();

    public int countPassengers() {
        return amount;
    }
}
