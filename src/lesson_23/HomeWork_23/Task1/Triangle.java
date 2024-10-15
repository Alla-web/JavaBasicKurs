package lesson_23.HomeWork_23.Task1;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;


    // constructor


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = "Triangle";
        if (!isValidSides()) { // ! - знак "false", т.е. если метод isValidSides неправда
            //стороны неправильные
            System.out.println("Построить треугольник с такими сторонами невозможно");
            //TODO надо выбросить ошибку или закрыть конструктор
            // мы просто в случае ошибочных сторон устан-м стороны по умолчанию:
            this.side1 = 3;
            this.side2 = 4;
            this.side3 = 5;
        }
    }

    // getters and setters
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
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
    private boolean isValidSides() {
        return side1 + side2 > side3 && side3 + side1 > side2 && side2 + side3 > side1;
    }

    @Override
    double area () {
        // Формула Герона
        // полупериметр
        double semiPer = perimeter() / 2.0;
        return Math.sqrt(semiPer * (semiPer - side1) * (semiPer - side2) * (semiPer - side3));
        //TODO доделать метод
    }

    @Override
    double perimeter() {
        double trianglePerimeter = side1 + side2 + side3;
        return trianglePerimeter;
    }
}
