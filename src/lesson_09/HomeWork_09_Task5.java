package lesson_09;

public class HomeWork_09_Task5 {
    public static void main(String[] args) {
        /*
        Написать метод, который принимает массив строк.
        Вывести на экран все символы самой длинной строки из массива.
         */

        String[] str = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        printArrayStrings(str);

        /*
        // Повторение - найти max-ное число в int-овом массиве
        int[] digits = {1, 2, 3, 4, 5, 6};
        maxDigit(digits);
        */

    }// main area

    static public void printArrayStrings(String[] str1) { // max-ная строка в String-овом массиве
        int i = 1; // число циклов
        String maxString = str1[0]; // предполагаем, что max-ная строка с индексом 0
        while (i < str1.length) {
            if (str1[i].length() > maxString.length()) {
                maxString = str1[i];
            }
            i++;
        }
        System.out.println("Max string: " + maxString);

        int j = 0;
        while (j < maxString.length()) {
            System.out.println(maxString.charAt(j));
            j++;
        }
    }

    /*
    public static void maxDigit(int[] digits1) { // max-ное число в int-овом массиве

        int ii = 1; // число циклов
        int max = digits1[0];  // предполагаем, что max-наое число с индексом 0
        while (ii < digits1.length) {
            if (max < digits1[ii]) {
                max = digits1[ii];
                ii++;
            }
        }
        System.out.println("max digit = " + max);
    }

     */


}// class area
