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

    public String toSring() {
        return String.format("Auto - model: %s; power: %d. Total amount of cars: %d", model, powerPS, totalCarProduced);
    }


    public void info() {
        System.out.println(toSring());
    }

    public static void tesStatic(){
        // static не используют слово this
        // this.model
        System.out.println("Hello static method!");
    }



}
