package lesson_20.Transport;

public class TransportApp {
    public static void main(String[] args) {

        System.out.println("----------------------Bus--------------------------");
        Bus bus = new Bus("X1", 2020, 10);
        System.out.println("-------Печатаем новый объект при помощи метода из родителького класса----");
        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("Model -> " + bus.getModel());

        System.out.println("Capacity -> " + bus.getCapacity());


        System.out.println("----------------------Train--------------------------");

        Train train = new Train("Skoda", 2022, 4, 40);
        System.out.println(train.toString());
        train.start();
        train.stop();
        System.out.println("Model -> " + train.getModel());
        System.out.println("Capacity -> " + train.getCapacity());
        train.setCountWagons(3);
        System.out.println("Capacity -> " + train.getCapacity());


        System.out.println("----------------------Bus--------------------------");
        System.out.println("-----------------------Пассажирвы заходят в автобус------------------------------------");
        Bus bus1 = new Bus("Bus-X2", 2024, 3);
        System.out.println(bus1.takePassenger());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.takePassenger());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.takePassenger());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.takePassenger());

        System.out.println("-----------------------Пассажирвы выходят из автобуса------------------------------------");

        System.out.println("Count of Passengers -> " + bus1.getCountPassengers());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.dropPassenger());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.dropPassenger());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.dropPassenger());
        System.out.println("-----------------------------------------------------------");
        System.out.println(bus1.dropPassenger());




    } // main


} // class
