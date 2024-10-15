package lesson_24.HomeWork_24.Task1;
/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class TriathletesMain {
    public static void main(String[] args) {

        Triathlete triathlete0 = new Triathlete("Tom", 25);
        triathlete0.run();
        triathlete0.swim();

        Triathlete triathlete1 = new Triathlete("Mike", 21);

        System.out.println("------------------------Triathletes array-------------------------------------");
        Triathlete[] triathletes = new Triathlete[3];
        triathletes[0] = triathlete0;
        triathletes[1] = triathlete1;
        triathletes[2] = new Triathlete("Nataly", 23);

        printTriathletes(triathletes);
    }

    public static void printTriathletes(Triathlete[] triathletes){
        for (int i = 0; i < triathletes.length; i++) {
            System.out.println(triathletes[i].toString());
        }
    }

}
