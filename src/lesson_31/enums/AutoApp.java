package lesson_31.enums;

public class AutoApp {
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println("color: " + color);

        Auto auto1 = new Auto("Model1", color);
        System.out.println(auto1);
        Auto auto2 = new Auto("Model2", Color.BLUE);
        System.out.println(auto2);

        auto2.setColor(color);
        System.out.println(auto2);

        System.out.println("------------------------Методы enum------------------------------");

        // возвращает массив всех значений
        Color[] colors = Color.values();
        //в классав массивов прописан итератор, поэтому мы можем его перебрать
        // циклом for-each
        for (Color currentColor : colors) {
            System.out.println("currentColor: " + currentColor);
        }

        // возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        // получить имя константы
        String name = Color.RED.name();
        System.out.println("name: " + name);

        //получить порядковый номер, начиная с 0
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal);

        //
        if (auto1.getColor() == Color.GREEN) {
            System.out.println("Цвет авто зелёный");
        } else {
            System.out.println(" Не зелёный");
        }

        // очень часто используется
        switch (color) {
            case RED:
                System.out.println("red");
                break;
            case GREEN:
                System.out.println("green");
                break;
            default:
                System.out.println("цвет какой-то другой");
        }

    }
}
