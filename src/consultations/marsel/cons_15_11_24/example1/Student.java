package consultations.marsel.cons_15_11_24.example1;

public class Student extends Human {
    private double averageMark;

    public Student(String name, int age, double averageMark) {
        super(name, age);
        this.averageMark=averageMark;
    }

    public void sayHi() {
        System.out.println("I am student, my name "+ name);
    }

    public void studi() {
        System.out.println("I am studying");
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "\nHuman{" +
                "name:'" + name + '\'' +
                ", age:" + age +
                ", averageMark: " + averageMark +
                '}';
    }
}
