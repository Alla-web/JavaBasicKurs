package lesson_22.HomeWork_22.Task1;

public class Person {

    private String name;

    // constructor

    public Person(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    // methods
    public void run() {
        System.out.println(name + " бежит со скоростью 10 км/час");
        rest();
    }

    public void rest() {
        System.out.println(name + " отдыхает 15 минут после пробежки");
    }


}
