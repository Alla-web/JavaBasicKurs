package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_06_Task3 {
    public static void main(String[] args) {
       /*
    Task 3
Попросите пользователя ввести целое число с клавиатуры.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your even digit");
        int digit = scanner.nextInt();
        scanner.nextLine(); // всегда добавлять чтобы убирало некорректно введенные данные пользователя
        System.out.println("Your digit " + digit + " :)");
        System.out.println("===============================================");

// Ваша программа должна вывести строку в формате:
// введённое число четное: true;
        boolean even6 = digit % 2 == 0;
        System.out.println(digit + " even" + " -> " + even6);

// кратно 3: true;
        boolean multiple6 = digit % 3 == 0;
        System.out.println("Entered digit кратно 3-м -> " + multiple6);

// четное и кратное 3: true
        boolean eqAndMult6 = (digit % 2 == 0) && (digit % 3 == 0);
        System.out.println("Entered digit even и кратное 3-м -> " + eqAndMult6);
        System.out.println("===============================================");

        //Число: 6 четное: true; кратно 3: true; четное и кратное 3: true

        System.out.println("Число " + digit + " четное " + " -> " + even6 + "; " + " кратно 3-м " + " -> " + multiple6 + "; " + " четное и кратное 3" + " -> " + eqAndMult6);

        // написание в строку

    }

}
