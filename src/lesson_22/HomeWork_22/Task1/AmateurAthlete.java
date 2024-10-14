package lesson_22.HomeWork_22.Task1;

public class AmateurAthlete extends Person {


    // constructor

    public AmateurAthlete(String name) {
        super(name);
        setSpeedRun(15);
        setTimeRest(10);
        setTypeRunner("Amateur");
    }

    //methods

    @Override
    public void run() {
        System.out.println(getTypeRunner() + " " + getName() + " бежит со скоростью " + getSpeedRun() + " км/час");
        rest();
    }

    @Override
    public void rest() {
        System.out.println(getTypeRunner() + " " + getName() + " отдыхает после пробежки " + getTimeRest() + " минут");
    }
}
