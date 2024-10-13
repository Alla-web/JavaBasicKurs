package lesson_22.HomeWork_22.flowers;

public class GardenApp {
    public static void main(String[] args) {

        System.out.println("----------------------------Peony-----------------------------");
        Peony peony=new Peony();
        System.out.println(peony.toString());
        peony.blow(); // родительский метод от класса Flower
        peony.smell(); // сосбтвенный метод

        System.out.println("----------------------------Rose-----------------------------");
        Rose rose = new Rose();
        System.out.println(rose.toString());
        rose.blow(); // переопределённый родительский метод от класса Flower
        rose.blow("the night"); // перегруженный родительский метод от класса Flower
        rose.prick(); // собственный метод

        System.out.println("----------------------------Snowdrop-----------------------------");
        Snowdrop snowdrop = new Snowdrop();
        System.out.println(snowdrop.toString());
        snowdrop.blow(); // переопределённый родительский метод от класса Flower

    }








}
