package lesson_20.Transport;

public class Train extends Vehicle {

    private int capacity;
    private int countPassenger;

    private int countWagons;
    private final int wagonCapacity;

    // коструктор
    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year); // получили из конструктора родительского класса Vehicle
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity(); // чтобы пересчитывалась Capacity в момент создания нового объекта
    }

    // геттеры
    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    // сэттер
    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity(); // чтобы пересчитывалась Capacity в момент изменения countWagons
    }

    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }
}
