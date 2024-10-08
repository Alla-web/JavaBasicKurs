package lesson_18.HomeWork_18;

public class Calculator {
    /*
    Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
     */

    private int x;
    private int y;

    // constructor
    public Calculator() {

    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x >= 0) {
            System.out.println("Wrong x");
            return;
        }
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
        if (y >= 0) {
            System.out.println("Wrong y");
            return;
        }
    }

    // Methods

    public static int addition(int x, int y) {
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        int result = x + y;
        return result;
    }

    public static int subtraction(int x, int y) {
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        int result = x - y;
        return result;
    }

    public static int multiplication(int x, int y) {
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        int result = x * y;
        return result;
    }

    public static int division(int x, int y) {
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        int result = x / y;
        return result;
    }


}// class area

