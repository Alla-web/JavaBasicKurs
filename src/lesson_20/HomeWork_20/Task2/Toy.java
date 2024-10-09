package lesson_20.HomeWork_20.Task2;

public class Toy {

    private String name;
    private String brand;
    private int ageOfChild;

    //constructor
    public Toy(String name, String brand, int ageOfChild) {
        this.name = name;
        this.brand = brand;
        this.ageOfChild = ageOfChild;

    }

    // getters
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getAgeOfChild() {
        return ageOfChild;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAgeOfChild(int ageOfChild) {
        this.ageOfChild = ageOfChild;
    }

    //methods
    public void play() {
        System.out.println("Child play pith me!");
    }




}
