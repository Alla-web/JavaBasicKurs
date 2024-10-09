package lesson_20.HomeWork_20.Task1;

public class ShapesApp {
    public static void main(String[] args) {

        System.out.println("--------------------Rectangle-------------------------");
        Rectangle rectangle = new Rectangle("Rectangle1", 5.5, 3.2);
        rectangle.displayInfo();

        rectangle.setDimensions(8.5, 6.9);
        rectangle.calculateArea();

        System.out.println("------------------------------------------------------");
        Rectangle rectangle1 = new Rectangle("Rectangle2", "red", 10, 5);
        rectangle1.displayInfo();

        System.out.println("----------------------Circle-------------------------");
        Circle circle = new Circle("Circle1", 6);
        circle.displayInfo();

        circle.setRadius(5);
        circle.calculateCircleArea();

        System.out.println("------------------------------------------------------");
        Circle circle1 = new Circle("Circle2", "black", 5);
        circle1.displayInfo();
    }
}
