package lesson_22.staticPoly;

public class Calculator {
    /*
    Статический полиморфизм

     */

    public static int add(int a, int b){
        return a + b;
    }


    public static double add(double a, double b){
        return a + b;
    }


    public static void main(String[] args) {
        int sum = Calculator.add(15,20);
        // в момент вызова методу будет определяться,
        // какой именно вариант перегруженного метода будет выполнене -  int или double





    }


}
