package lesson_17.ObjectArray;

import java.lang.reflect.Array;

public class Persons {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading and music");
        System.out.println(garry.toString());

        Person[] peoples = new Person[5];

        peoples[0] = garry;
        peoples[3] = john;
        peoples[1] = new Person("Tom", 5, "Crying");

        System.out.println("----------------------------------------------");

        System.out.println(peoples[0].toString()); // вытаскивает все данные элемента
        System.out.println("peoples[0].getName(): " + peoples[0].getName());

        peoples[0].setName("Peter"); // изменили имя объекта из 1-й ячейки
        System.out.println("peoples[0].getName(): " + peoples[0].getName());
        System.out.println("garry.getName(): " + garry.getName());

        System.out.println("-----------------------------For-------------------------------");
        for (int i = 0; i < peoples.length; i++) {
            if (peoples != null && peoples[i] != null) {
                System.out.print(peoples[i].toString());
                System.out.println("(peoples[i].getName()" + peoples[i].getName());
            } else {
                System.out.println("null!!!");
            }
        }

        System.out.println("------------------------------------------------------------");

        Person test = new Person("Test", 45, "Drawing");
        peoples[2] = test;
        System.out.print(peoples[2].toString());

        test = null;
        System.out.println("\npeoples[2].getHobby() -> " + peoples[2].getHobby());





    }
}
