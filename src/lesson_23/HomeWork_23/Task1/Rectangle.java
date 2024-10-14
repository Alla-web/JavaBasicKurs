package lesson_23.HomeWork_23.Task1;

public class Rectangle extends Shape {

    private double height;
    private double width;

    //constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //getters and setters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //methods


    @Override
    double area() {
        double rectangleArea = width * height;
        return rectangleArea;
    }

    @Override
    double perimeter() {
        double rectanglePerimeter = 2 * (width + height);
        return rectanglePerimeter;
    }
}
