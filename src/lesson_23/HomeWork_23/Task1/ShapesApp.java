package lesson_23.HomeWork_23.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShapesApp {
    public static void main(String[] args) {
        System.out.println("-------------------------Circle-----------------------------");
        Circle circle = new Circle(5.5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println("-------------------------Rectangle-----------------------------");
        Rectangle rectangle = new Rectangle(15.5, 25.5);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        System.out.println("-------------------------Triangle-----------------------------");
        Triangle triangle = new Triangle(2.5, 5.5, 5.5, 5.5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        System.out.println("-------------------------Shapes array-----------------------------");
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        System.out.println(Arrays.toString(shapes));

        System.out.println("---------------------------Total area-----------------------------");
        double totalArea = shapesArea(shapes);
        System.out.println("totalArea = " + totalArea);

        double totalPerimeter = shapesPerimeter(shapes);
        System.out.println("totalPerimeter = " + totalPerimeter);
    }

    public static double shapesArea(Shape[] shapes) {
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].area();
        }
        return totalArea;
    }

    public static double shapesPerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalPerimeter += shapes[i].area();
        }
        return totalPerimeter;
    }
}
