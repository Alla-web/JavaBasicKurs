package consultations.marsel.cons_13_11_24.example2;

public class Main2 {
    public static void main(String[] args) {

        Human human = new Human("Marsel", 25);
        Programmer prog = new Programmer("Bogdan", 27, 5);
        Student student = new Student("Sergej", 25, 5);
        Sportsman sportsman = new Sportsman("Alla", 41, 3);

        //восходящее преобразование
        Human h1 = human;
        Human h2 = prog;
        Human h3 = student;
//        Human h4 = sportsman;

        prog.work();
//        h2.work(); нет такого метода у родителя Human
        h1.sayHi();
        h2.sayHi();
        h3.sayHi();

        Human[] humans0 = new Human[3];
        humans0[0] = h1;
        humans0[1] = h2;
        humans0[2] = h3;
        System.out.println("----------------------------");
        Human[] humans = {human, prog, student};
        allSayHi(humans);
    }

    public static void allSayHi(Human[] humans){
        for (int i = 0; i < humans.length; i++) {
            humans[i].sayHi();
        }
    }
}
