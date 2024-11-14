package consultations.marsel.cons_13_11_24.example2;

public class Programmer extends Human {

    private int experience;

    public Programmer(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }


    public void setExperience(int experience) {
        //TODO сделать проверку на опыт
        this.experience = experience;
    }

    public void sayHi() {
        System.out.println("Я программист и меня зовут " + name);
    }

    public void work() {
        System.out.println("Работаю над проектом");
    }
}
