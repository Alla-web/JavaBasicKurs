package lesson_22.HomeWork_22.Task1;

public class TrainingApp {
    public static void main(String[] args) {

        System.out.println("------------------Person------------------------------");
        Person max = new Person("Max");
        max.run();

        System.out.println("------------------AmateurAthlete------------------------------");
        AmateurAthlete peter = new AmateurAthlete("Peter");
        peter.run();

        System.out.println("--------------------ProfeAthlete-------------------------------");
        ProfeAthlete tom = new ProfeAthlete("Tom");
        tom.run();

        System.out.println("------------------------Casting--------------------------------");
        System.out.println("------------------------UpCasting--------------------------------");
        Person natali = new AmateurAthlete("Natali");
        natali.run();
        System.out.println("-----------------------------------");

        Person larisa = new ProfeAthlete("Larisa");
        larisa.run();

        System.out.println("------------------------DownCasting--------------------------------");
        Person marta = new AmateurAthlete("Marta");
        marta.run();
        System.out.println("-----------------------------------");

        AmateurAthlete margaryta = new AmateurAthlete("Margaryta");
        margaryta.run();
        System.out.println("-----------------------------------");

        if (marta instanceof AmateurAthlete) {
            margaryta = (AmateurAthlete) marta;
            margaryta.run();
        } else {
            System.out.println("Невозможно выплнить преобразование Person в AmateurAthlete");
        }

        System.out.println("-----------------------------------");


    }
}
