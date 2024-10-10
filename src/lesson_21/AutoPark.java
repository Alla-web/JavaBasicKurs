package lesson_21;

public class AutoPark {
    public static void main(String[] args) {
        // 1 шаг при создания автобуса
        //нам нужно создать водителя -
        // т.к. он приходит в конструктор автобуса из вне
        BusDriver busDriver = new BusDriver("John", "LN123456");
        // теперь создаем автобус
        Autobus bus = new Autobus(busDriver, 15);

        // создаем нового водителя и новый автобус
        BusDriver busDriver1 = new BusDriver("Margo", "AE123456");
        Autobus bus1 = new Autobus(busDriver1, 24);

        System.out.println("bus " + bus.toString());
        System.out.println("bus1 " + bus1.toString());

        // создаём 3-го водителя
        BusDriver peter = new BusDriver("Peter", "DF123456");
        bus1.setDriver(peter);
        System.out.println("bus1" + bus1.toString());

        System.out.println(peter.toString());

        //поменяли автопилот
        bus.installNewPilot("AP-987654");
        System.out.println(bus.toString());

        busDriver.setName("Sebastian");
        System.out.println(bus.toString());

        System.out.println("-------------------------Passenger------------------------------");
        System.out.println("Amount of passengers = " + bus.getCountPassengers());
        bus.showListOfPassenger();

        // создаем пассажиров
        Passenger john = new Passenger("John");
        Passenger margo = new Passenger("Margo");

        bus.takePassenger(john);
        bus.showListOfPassenger();
        System.out.println("--------------------------------------------------");
        bus.takePassenger(margo);
        bus.showListOfPassenger();
        System.out.println("--------------------------------------------------");
        bus.takePassenger(margo);
        bus.showListOfPassenger();

    }
}
