package consultations.marsel.cons_13_11_24.example1;

public class Human {

    private final String name;
    private int age;

    public Human() {
        this.name = "newHuman";
        this.age = 1;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            System.out.println("Возраст должен быть в пределах 0-120");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "\nHuman{" +
                "name:'" + name + '\'' +
                ", age:" + age +
                '}';
    }

    public void sayHi() {
        System.out.println("Hi, my name " + name);
    }

}
