package lesson_22.HomeWork_22.Task1;

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class Person {

    private String name;
    private int speedRun;
    private int timeRest;
    private String typeRunner = "Person";

    // constructor
    public Person(String name) {
        this.name = name;
        this.speedRun = 10;
        this.timeRest = 15;

    }

    //getters
    public String getName() {
        return name;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getTimeRest() {
        return timeRest;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public void setTimeRest(int timeRest) {
        this.timeRest = timeRest;
    }

    // methods
    public void run() {
        System.out.println(typeRunner + " " + name + " бежит со скоростью " + speedRun + " км/час");
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " " + name + " отдыхает после пробежки " + timeRest + " минут");
    }

    // переопредяем метод toString
    @Override
    public String toString() {
        return "{" +
                "type: " + typeRunner +
                ", name: " + name +
                ", speedRun: " + speedRun +
                ", restTime: " + timeRest +
                "} \n";
    }
}
