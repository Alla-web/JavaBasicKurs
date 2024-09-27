package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        // пока пользователь не введёт своё имя (+ enter) программа дальше не пойдёт
        // этот метод считывает всю строку
        System.out.println("name" + name);

        // прочитать следующее число
        System.out.println("Введите ваш возраст, лет: ");
        int age = scanner.nextInt(); // считать одно число типа int
        // считывает токен
        System.out.println("age " + age);
        scanner.nextLine(); // скушали остаток строки от возраста, если туда ввели данные с бробелом

        System.out.println("Введите ваш рост, см: ");
        double height = scanner.nextDouble ();

        System.out.println("height " + height);


    }
}
