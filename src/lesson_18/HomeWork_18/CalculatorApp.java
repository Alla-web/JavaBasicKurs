package lesson_18.HomeWork_18;

public class CalculatorApp {
    public static void main(String[] args) {

        int sum = Calculator.addition(10, 20);
        System.out.println("sum = " + sum);

        System.out.println("------------------------------------------------------------");

        int sum2 = Calculator.addition(5, 1,2,3,4,5);
        System.out.println("sum2 = " + sum2);

        System.out.println("------------------------------------------------------------");

        int subtract = Calculator.subtraction(30, 20);
        System.out.println("subtract = " + subtract);

        System.out.println("------------------------------------------------------------");

        int multiple = Calculator.multiplication(10,10);
        System.out.println();

        System.out.println("------------------------------------------------------------");

        double division = Calculator.division(15, 3);
        System.out.println("division = "+ division);

        System.out.println("------------------------------------------------------------");

        double circumference = Calculator.circumference(5);
        System.out.println("Длина окружности = " + circumference);

        System.out.println("------------------------------------------------------------");

        double circleArea = Calculator.circleArea(5);
        System.out.println("Площадь круга = " + circleArea);



    }
}
