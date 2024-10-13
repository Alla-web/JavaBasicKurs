package lesson_22.HomeWork_22.flowers;

public class Snowdrop extends Flower {

    // переопределеить родительский метод
    @Override
    public void blow() {
        System.out.println("I am blooming earlier then all");
    }
}
