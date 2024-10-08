package lesson_18.HomeWork_18;

public class CalculatorApp {
    public static void main(String[] args) {

        System.out.println("-------Вызываем метод через создание нового объекта------");

        Calculator calculator = new Calculator();
        int sum = calculator.addition(10,20);
        System.out.println("sum = " + sum);

        System.out.println("-------Вызываем метод без создания объекта------");


        int sum1 = Calculator.addition(5,7);
        System.out.println("sum = " + sum1);


    } // main area

} // class area
