package lesson_08;

public class HomeWork_08_Task1 {
    public static void main(String[] args) {
        /*
        Найдите произведение всех чисел от 1 до 15 включительно.
        Результат выведите на экран
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int i = 0;
        while (i < arr.length) { //
            System.out.print(arr[i++] + " | ");
        }

        int index = 1; // переменная для индексации массива
        long product = 1; // начинаем перемножать с
        // используем long  чтобы наше число в сё поместилсь и не было переполнения
        while (index < arr.length) {
            product *= arr[index];
            index++;
        }
        System.out.println();
        System.out.println("Произведение всех элементов массива -> " + product);
    }
}
