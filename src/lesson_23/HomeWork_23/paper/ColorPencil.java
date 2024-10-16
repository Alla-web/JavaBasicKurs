package lesson_23.HomeWork_23.paper;

public class ColorPencil extends Pencil{

    private String color = "red";

    @Override
    void draw(String figure) {
        System.out.printf("Рисую цветным %s карандашём фигуру: %s !\n", color, figure);
    }

    //constructors
    public ColorPencil() {
    }

    public ColorPencil(String color) {
        this.color = color;
    }

    //setter

    public void setColor(String color) {
        this.color = color;
    }
}
