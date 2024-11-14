package consultations.marsel.cons_13_11_24.example1;

public class Programmer {

    private int age;
    private final String name;
    private int experience;

    public Programmer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("Возраст должен быть в пределах 0-120");
        } else {
            this.age = age;
        }
    }

    public void setExperience(int experience) {
        //TODO сделать проверку на опыт
        this.experience = experience;
    }

    public void sayHi() {
        System.out.println("Я программист и меня зовут " + getName());
    }

    public void work() {
        System.out.println("Работаю над проектом");
    }
}
