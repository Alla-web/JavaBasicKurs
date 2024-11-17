package consultations.marsel.cons_13_11_24.example2;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Marsel", 25);
        Human human2 = new Human("Igor", 36);
        Human human3 = new Human("Katja", 18);

        Human human4 = new Human();

        human1.sayHi();
        human1.setAge(131);
        System.out.println("Human " + human1.getName() + ", age: "+ human1.getAge());
        human2.sayHi();
        human3.sayHi();
        human4.sayHi();

        System.out.println("--------------------Programmer-----------------------------");
        Programmer prog = new Programmer("Bogdan", 27, 5);
        prog.sayHi();
        prog.work();
        prog.setAge(220);//???

        System.out.println("--------------------Student-----------------------------");
        Student student = new Student("Sergej", 25, 5);
        student.sayHi();
        student.studi();
        student.setAge(35);
        System.out.println(student);

        System.out.println("--------------------Student-----------------------------");
        Sportsman sportsman = new Sportsman("Olga", 36, 42);
        sportsman.run();
        sportsman.sayHi();

    }

}
