package lesson_07;

import java.util.Random;

public class HomeWork_07_Task2 {
    public static void main(String[] args) {
    /*
    Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел
и вывести результат на экран.
Output: Максимальное число: 33
     */
        Random random = new Random();
        int randNumber1 = random.nextInt(101);
        int randNumber2 = random.nextInt(101);
        int randNumber3 = random.nextInt(101);
        int randNumber4 = random.nextInt(101);
        System.out.println(randNumber1 + " | " + randNumber2 + " | " + randNumber3 + " | " + randNumber4);
        int max = randNumber1;

        if (randNumber2 > max) max = randNumber2;
        if (randNumber3 > max) max = randNumber3;
        if (randNumber4 > max) max = randNumber4;
        System.out.println("Max -> " + max);

        int max1 = Math.max(Math.max(randNumber1, randNumber2), Math.max(randNumber3, randNumber4));
        System.out.println("Max1 -> " + max1);

    }


}
