package lesson_23.HomeWork_23.paper;

public class Marker extends Pen{

    @Override
    void draw(String figure) {
        System.out.println("Рисую маркером фигуру: " + figure);
    }
}
