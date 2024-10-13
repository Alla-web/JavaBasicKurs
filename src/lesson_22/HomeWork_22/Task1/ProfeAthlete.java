package lesson_22.HomeWork_22.Task1;

public class ProfeAthlete extends AmateurAthlete {

    // constructor
    public ProfeAthlete(String name) {
        super(name);
    }

    // methods
    @Override
    public void run() {
        System.out.println(getName() + " бежит со скоростью 25 км/час");
        rest();
    }

    @Override
    public void rest() {
        System.out.println(getName() + " отдыхает 5 минут после пробежки");
    }
}
