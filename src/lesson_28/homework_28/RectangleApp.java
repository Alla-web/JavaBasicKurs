package lesson_28.homework_28;

public class RectangleApp {
    public static void main(String[] args) {

        System.out.println("-------------------------------Task 1------------------------------");
        Rectangle rectangle1 = new Rectangle();

        System.out.println("Length = " + rectangle1.getLength());
        System.out.println("Width = " + rectangle1.getWidth());
        System.out.println();
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(4.5,2.5);

        System.out.println(rectangle2.toString());

        System.out.println("-------------------------------Task 2------------------------------");

        rectangle1.setLength(4.5);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());

        Rectangle rectangle3 = rectangle1;
        Rectangle rectangle4 = new Rectangle(4.5, 1.0);

        System.out.println("rectangle1 (L: " + rectangle1.getLength() + ", W: " + rectangle1.getWidth() + ") == rectangle2 (L " + rectangle2.getLength() + ", W: " + rectangle2.getWidth() + ") -> " + rectangle1.equals(rectangle2));
        // ссылка на один и тот же объект:
        System.out.println("rectangle1 (L: " + rectangle1.getLength() + ", W: " + rectangle1.getWidth() + ") == rectangle3 (L " + rectangle3.getLength() + ", W: " + rectangle3.getWidth() + ") -> " + rectangle1.equals(rectangle3));
        // разные объекты с одинаковыми параметрами:
        System.out.println("rectangle3 (L: " + rectangle3.getLength() + ", W: " + rectangle3.getWidth() + ") == rectangle4 (L " + rectangle4.getLength() + ", W: " + rectangle4.getWidth() + ") -> " + rectangle3.equals(rectangle4));







    }
}
