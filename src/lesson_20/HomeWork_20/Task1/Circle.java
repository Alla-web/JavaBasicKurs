package lesson_20.HomeWork_20.Task1;

public class Circle extends Shape {

    private double radius;
    public static final double PI = 3.14159;

    // constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateCircleArea() {
        System.out.println("radius = " + radius);
        double circleArea = PI * radius * radius;
        System.out.println("circleArea = " + circleArea);
    }


}// class area
