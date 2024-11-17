package consultations.marsel.cons_15_11_24.example1;

import consultations.marsel.cons_13_11_24.example1.Human;

public class Sportsman extends Human {

    private int distance;

    public Sportsman(String name, int age, int distance) {
        super(name, age);
        this.distance = distance;
    }

    public void run() {
        System.out.println("I am running " + getName());
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}


