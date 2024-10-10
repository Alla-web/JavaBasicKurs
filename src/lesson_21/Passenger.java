package lesson_21;

public class Passenger {

    private static int counterId;
    private final int id;
    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id=++counterId; // сначала каунтер увеличится, а потом присвоился
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    //methods
    public String toString() {
        return String.format("Passenger id: %d, name: %s", id, name);
    }
}
