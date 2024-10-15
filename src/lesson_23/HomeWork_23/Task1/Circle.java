package lesson_23.HomeWork_23.Task1;

public class Circle extends Shape {

    public final double PI = 3.14159;
    private double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
        this.type = "Circle";
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods
    @Override
    double area() {
        double circleArea = PI * radius * radius;
        return circleArea;
    }

    @Override
    double perimeter() {
        double circlePerimeter = 2 * PI * radius;
        return circlePerimeter;
    }
}
