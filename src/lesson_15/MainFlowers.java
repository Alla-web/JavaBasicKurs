package lesson_15;

public class MainFlowers {
    public static void main(String[] args) {

        Flower flower = new Flower("Rose", "red");
        System.out.println("name: " + flower.name);
        System.out.println("color: " + flower.color);

        flower.blow();
        flower.smell();

        System.out.println("-----------------------------------------------------");

        Flower flower1 = new Flower("Peony", "pink", 25.5);
        flower1.whoIAm();



    }// main area




} // class area
