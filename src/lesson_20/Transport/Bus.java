package lesson_20.Transport;

public class Bus extends Vehicle {
// связь м/д классами IS - A (это есть) определяется словом extends
// должно быть справедливо высказывание, что Bus это Vehicle
// Smartphone тоже имеет год выпуска и модель, но это не Vehicle
// ВАЖНО не нарушать логику наследования,
// иначе это будет грубая рархитектурная (логическая) ошибка
// нельзя унаследоваться сразу от нескольких классов - можно только от одного

    private int capacity;
    private int countPassengers;

    // constructor
    public Bus(String model, int year, int capacity) {
        // нужно создать сначала объект родителя
        super(model, year); // super - слово обозн-е конструктор родителського класса
        this.capacity = capacity;
        // не используем в конструкторе countPassengers, потому что нас в последующих расчётах
        // устраивает его нулевое значение по умолчанию
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Passenger takes the Bus" + this.getModel());
            return true;
        }
        System.out.printf("In the Bus %s eren`t places. Now are %d passengers\n", this.getModel(), countPassengers);
        return false;
    }

    public boolean dropPassenger() {
        if(countPassengers > 0) { // проверяем есть ли у нас пассаижиры в автобусе?
            countPassengers--; // пассажир выходит
            System.out.println("Passenger gets off the Bus" + this.getModel());
            System.out.printf("Amount of Passengers %d passengers\n", countPassengers);

            return true;
        }
        System.out.printf("In the Bus %s eren`t Passengers. Amount of Passengers %d passengers\n", this.getModel(), countPassengers);
        return false;
    }


} // class
