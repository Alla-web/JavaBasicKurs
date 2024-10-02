package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String info() {
        return "I am dog " + name + ", my weight is " + weight + " kg";
    }

    void eat() {
        System.out.println("I am eating!");
        weight++;
    }

    void run() {
        /*
        1. проверить - достаточен ли вес собачки для совершения пробежки
        2. если вес слишком мал - собачка должна поесть перед тренировкой
         */
        while (weight < 3) {
            System.out.println("Sorry, I am too hungry. I need to eat!");
            System.out.println("My weight now is " + weight + " kg");
            eat();
        }
        System.out.println("I am running!");
        weight -= 2;
        System.out.println("Weight is after running " + weight + " kg");
        System.out.println("-----------------------------------------");
    }


}// class area
