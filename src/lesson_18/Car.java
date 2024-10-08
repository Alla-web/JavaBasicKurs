package lesson_18;

public class Car {
    // статическая переменная не может быть объявлена внутри матода класса
    // а только полем (членом) класса
    public static int totalCarProduced; //единая для всех переменная


    private String model;
    private int powerPS;

    // конструктор
    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        // чтобы при каждом добавлении нового авто
        // наша общая для всех переменная увеличивалась на 1 и накапливала в себе это количесво
        totalCarProduced++;
    }

    public final int getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(int powerPS) {
        this.powerPS = powerPS;
    }

    public String toSring() {
        return String.format("Auto - model: %s; power: %d. Total amount of cars: %d", model, powerPS, totalCarProduced);
    }


    public void info() {
        System.out.println(toSring());
    }

    public static void tesStatic() {
        // static не используют слово this
        // this.model
        System.out.println("Hello static method!");
    }

    // final в параметрах метода
    public void test(final int number) {
        // number++; - ошибка, нельзя менять final переменную
        int x = number + 10; // так можем менять значение final переменной
    }

    public void test(final int[] numbers){
        // numbers = new int[100]; - ошибка, нельзя менять ссылку

        // можем так изменять ссылку:
        int[] newNumbers = numbers;
        newNumbers = new int[100];

        // можем изменять состояние объекта
        numbers[0] = 10000;
    }
}
