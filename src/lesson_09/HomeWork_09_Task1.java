package lesson_09;

public class HomeWork_09_Task1 {
    public static void main(String[] args) {
        /*
        1. Написать метод, принимающий массив целых чисел
        и распечатывающий массив в обратной последовательности.
        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]/
        */

        int[] array0 = {3, 45, 69, 57, 36};
        printArraysBackward(array0);

        /*
        2. Перегрузить метод, если в него приходит индекс,
        то часть массива слева до этого индекса распечатывается в обычном порядке,
        а начиная с этого индекса в обратном:
        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
         */
        System.out.println("---------Method overloading------------------");
        int[] array = {1, 2, 3, 4, 5, 6};
        printArraysBackward(array, 6);

    } // main area

    public static void printArraysBackward(int[] array1) {
        System.out.print("[ ");
        int i = array1.length - 1; // индекс ячейки
        while (i >= 0) {
            System.out.print(array1[i] + ", ");
            i--;
        }
        System.out.println("]");
    }

    public static void printArraysBackward(int[] array2, int index) {
        System.out.print("[ ");
        if (index > 0 && index < array2.length - 1) { // находится ли индекс в пределах массива?
            int i = 0; // номер ячейки массива
            while (i < index) {
                System.out.print(array2[i] + ", ");
                i++;
            }
            i = array2.length - 1;
            while (i >= index) {
                System.out.print(array2[i] + ", ");
                i--;
            }
            System.out.println("]");
        } else {
            System.out.print("Wrong index");
            System.out.println(" ]");
        }
    }

} // class area
