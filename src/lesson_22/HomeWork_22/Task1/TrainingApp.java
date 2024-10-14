package lesson_22.HomeWork_22.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrainingApp {
    public static void main(String[] args) {

        Person personMax = new Person("Max");
        AmateurAthlete amateurPeter = new AmateurAthlete("Peter");
        ProfiAthlete profiTom = new ProfiAthlete("Tom");
        personMax.run();
        amateurPeter.run();
        profiTom.run();

        System.out.println("------------------------Casting--------------------------------");
        System.out.println("------------------------UpCasting--------------------------------");
        Person natali = new AmateurAthlete("Natali");
        natali.run();
        System.out.println("-----------------------------------");

        Person larisa = new ProfiAthlete("Larisa");
        larisa.run();

        System.out.println("------------------------DownCasting--------------------------------");
        Person personMarta = new AmateurAthlete("Marta");
        personMarta.run();
        System.out.println("-----------------------------------");

        AmateurAthlete amateurMargaryta = new AmateurAthlete("Margaryta");
        amateurMargaryta.run();
        System.out.println("-----------------------------------");

        if (personMarta instanceof AmateurAthlete) {
            amateurMargaryta = (AmateurAthlete) personMarta;
            amateurMargaryta.run();
        } else {
            System.out.println("Невозможно выплнить преобразование Person в AmateurAthlete");
        }

        System.out.println("---------------------------------------------------------------");
        // создали массив бегунов:
        Person[] people = new Person[5];
        people[0] = personMax;
        people[1] = amateurPeter;
        people[2] = profiTom;
        people[3] = personMarta;
        people[4] = amateurMargaryta;

        // печатаем отдельный объект
        System.out.println(personMax.toString());

        System.out.println("---------------------------------------------------------------");

        // печатаем массив объектов
        System.out.println(Arrays.toString(people));














    }
}
