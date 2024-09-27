package lesson_06;

import java.util.Random;

public class HomeWork_06_Task2 {
    public static void main(String[] args) {
        /*
Создайте две переменные типа int.
В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
         */
        Random random = new Random();

        int rand1 = random.nextInt(51);
        int rand2 = random.nextInt(101);
        System.out.println("rand1: " + rand1);
        System.out.println("rand2: " + rand2);

// (опционально) Во вторую переменную случайное значение от -20 до 30.
        rand2 = random.nextInt(51) - 20;
        // будет отнимать от любого сгенерированного сичта число 20
        // int rand = random.nextInt(); -> будет генерировать числа в диапазоне int (-2_147_483_648 до 2_147_483_647)
        // в диапазоне 1-100:
        // int rand - random.nextInt(100) + 1:
        System.out.println(rand1 + " " + rand2 + rand2);


// Проверьте и выведите результат на экран:

// равны ли переменные:
        boolean equal = rand1 == rand2;
        System.out.println("rand1 == rand2 -> " + equal);

// не равны ли они:
        boolean unequal = rand1 != rand2;
        System.out.println("rand1 != rand2 -> " + unequal);

// больше ли a, чем b,
        boolean more = rand1 > rand2;
        System.out.println("rand1 > rand2 -> " + more);

// меньше ли b, чем a.
        boolean less = rand2 < rand1;
        System.out.println("rand2 < rand1 -> " + less);
    }
}