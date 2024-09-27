package lesson_09;

public class HomeWork_09_Task2 {
    public static void main(String[] args) {
    /*
Написать метод, принимающий на вход целое число.
Метод должен вывести на экран 2 в степени этоЧисло
Например: Если в метод пришло число 3 - метод должен вывести число 8
(так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
     */
        thisNumber(3);

    } // main area

    public static void thisNumber(int power) {
        int number = 2;
        int i = 1; // счётчик операций
        int result = 1;
        while (i <= power) {
            result *= number;
            i++;
        }
        System.out.println("Number " + number + " to the power " + power + " = " + result);

    }


}// class area
