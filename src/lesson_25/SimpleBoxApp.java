package lesson_25;

public class SimpleBoxApp {
    public static void main(String[] args) {

        SimpleBox box = new SimpleBox(10);
        System.out.println(box);

        SimpleBox box1 = new SimpleBox(20);
        System.out.println(box1);

        int sum = (int) box.getValue() + (int) box1.getValue(); // хотим просуммировать значения
        // нельзя складывать 2 объекта
        // поэтому привели оба значения к (int)
        System.out.println("sum (box + box1) = " + sum);

        System.out.println("--------------------Array--------------------");

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0] = box;
        boxes[1] = box1;
        boxes[2] = new SimpleBox("30"); // случайно передали строку, а не число

        // считаем сумму элементов массива
        int sum1 = 0;
        for (int i = 0; i < boxes.length; i++) {
            sum1 += (int) boxes[i].getValue(); // ошибка - нельзя привести строку "30" к числу
        }
        System.out.println("sum1 = " + sum1);

        /*
        тип данных Object слишком широкий
        было бы здорово создавать универсальные классы, которые  могли бы содержать разные типа данных,
        но какие типы это будут решает программист -> придумали Generic классы

         */







    }
}
