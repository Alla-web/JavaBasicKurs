package lesson_09;

public class HomeWork_09_Task0 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий на вход строку.
        Метод должен вывести на экран число, соответсвующее количеству символов в строке.
        Например: Если в метод пришла строка "hello" - метод должен вывести
        число 5 (так как в строке hello 5 символов)
         */
        String string = "Java";
        getString(string);

    } // main area

    public static void getString(String str) {
        System.out.println("Length of string: " + str.length());
    }


}// class area
