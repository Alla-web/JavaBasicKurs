package lesson_06;

public class HomeWork_06_Task1 {
    public static void main(String[] args) {
        /*
        Task 1.
        Дан текст Programming is fun.
Напишите программу, которая проверяет,
содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
         */
        String text = "Programming is fun";
        boolean contains = text.contains("fun");
      //  containsFun =
        System.out.println("contains: " + contains);

        String text2 = text.replace("fun", "sadness");
        System.out.println("text2: " + text2);




    }
}
