package lesson_22.HomeWork_22.Task1;

public class AmateurAthlete extends Person {

    // constructor
    public AmateurAthlete(String name) {
        super(name);
    }

    //methods


    @Override
    public void run() {
        System.out.println(getName() + " бежит со скоростью 15 км/час");
        rest();
    }

    @Override
    public void rest() {
        System.out.println(getName() + " отдыхает 10 минут после пробежки");
    }
}
