package lesson_38.homework_38.Task3;

import lesson_38.homework_38.Task2.IntegerComparators;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Comparator<Integer> comparator = (int1, int2) -> {
            boolean isFirstEven = int1 % 2 == 0;
            boolean isSecondEven = int2 % 2 == 0;

            if (isFirstEven && isSecondEven) { //если оба четные - в порядке возрастания
                return Integer.compare(int1, int2);
            } else if (isFirstEven) { //первое чётное (должно быть меньше), второе не четное
                return -1;
            } else if (isSecondEven){ //только второе чётное, первое должно быть больше
                return 1;
            } else { // оба нечётные - сортировать в порядке убывания
                return Integer.compare(int2, int1);
            }
        };

        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));
    }
}

