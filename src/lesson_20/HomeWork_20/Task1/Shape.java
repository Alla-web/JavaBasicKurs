package lesson_20.HomeWork_20.Task1;

public class Shape {

    private String name;
    private String color;

    // constructor

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // methods
    public void displayInfo() {
        System.out.printf("Shape: %s, color: %s\n", name, color);
    }


}// class area
