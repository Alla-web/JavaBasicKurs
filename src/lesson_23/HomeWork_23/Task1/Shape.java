package lesson_23.HomeWork_23.Task1;

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами
для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и
периметр всех фигур в массиве.
 */
abstract class Shape {

    protected String type;

    // constructor
    public Shape() {
        this.type = "Shape";
    }

    abstract double area();

    abstract double perimeter();

    public String toString() {
        return "{" + type + ", area: " + area() + ", perimeter: " + perimeter() + "} \n";
    }

}
