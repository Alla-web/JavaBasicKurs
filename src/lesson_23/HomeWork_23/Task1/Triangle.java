package lesson_23.HomeWork_23.Task1;

public class Triangle extends Shape {

    private double hightTtiangle;
    private double side1;
    private double side2;
    private double side3;


    // constructor


    public Triangle(double hightTtiangle, double side1, double side2, double side3) {
        this.hightTtiangle = hightTtiangle;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // getters and setters


    public double getHightTtiangle() {
        return hightTtiangle;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setHightTtiangle(double hightTtiangle) {
        this.hightTtiangle = hightTtiangle;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //methods

    @Override
    double area() {
        double triangleArea = (1.0 / 2.0) * side3 * hightTtiangle;
        return triangleArea;
    }

    @Override
    double perimeter() {
        double trianglePerimeter = side1 + side2 + side3;
        return trianglePerimeter;
    }
}
