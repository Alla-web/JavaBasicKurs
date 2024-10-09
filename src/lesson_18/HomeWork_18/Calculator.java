package lesson_18.HomeWork_18;

import java.util.Arrays;
import java.util.SortedMap;

public class Calculator {
    /*
    Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
Вычисление длины окружности и площади круга по ее радиусу
     */

/*
Статистические методы можно вызывать в других классах без создания объектов,
а напямую через имя класса
 */

    public static final double PI = 3.14159; // объявили и инициировали константу

    // Methods

    public static int addition(int x, int y) {
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        int result = x + y;
        return result;
    }

    public static int addition(int a, int... numbers) {
        System.out.println("a -> " + a);
        System.out.println(Arrays.toString(numbers));
        int sum = a;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    // TODO доделать метод


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
        if (x == 0) { // можем не проверять У на ноль, выдаст бесконечность
            return Integer.MIN_VALUE;
        }
        int result = x / y;
        return result;
    }

    public static double division(double x, double y) {
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
        if (x == 0) { // можем не проверять У на ноль, выдаст бесконечность
            return Integer.MIN_VALUE;
        }
        double result = x / y;
        return result;
    }

    // вычисляем длину окружности по радиусу
    public static double circumference(double radius) {
        System.out.println("radius -> " + radius);
        double circumference = 2*PI*radius;
        return circumference;
    }

    // вычисляем площадь круга по радиусу
    public static double circleArea(double radius) {
        System.out.println("radius -> " + radius);
        // PI*r^2
        double circleArea = PI*radius*radius;
        return circleArea;
    }


}// class area

