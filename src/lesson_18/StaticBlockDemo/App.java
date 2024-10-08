package lesson_18.StaticBlockDemo;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("counter -> " + InitExample.counter);
        System.out.println(Arrays.toString(InitExample.colors));

        InitExample initObject = new InitExample(); // исп-м конструктор по умолчания
        System.out.println(initObject.toString());

        System.out.println("---------------------Create object---------------------");
        InitExample ininObject = new InitExample();
        System.out.println(initObject.toString());
        System.out.println(Arrays.toString(InitExample.colors));

        System.out.println("---------------------Create object 2---------------------");
        InitExample ininObject2 = new InitExample();

        System.out.println("---------------------Переназначение методом---------------------");
        InitExample.changeColors("yellow", "purple");
        System.out.println(Arrays.toString(InitExample.colors));







    } // main area

} // class area
