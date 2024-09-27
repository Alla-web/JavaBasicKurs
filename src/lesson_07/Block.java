package lesson_07;

public class Block {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 5;
            x = x + y;
            System.out.println("x " + x);
            System.out.println("y " + y);
        }
        //x = x + y; // ошибка компеляции. Переменная у не невидна (не доступна) вне своего блока
        //int y = 124; // в этом блоке нужно вводить свою переменную У
        System.out.println("x " + x);
    }
}
