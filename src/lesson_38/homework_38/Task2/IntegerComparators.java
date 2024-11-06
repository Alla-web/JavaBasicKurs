package lesson_38.homework_38.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class IntegerComparators {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                boolean isFirstEven = int1 % 2 == 0;
                boolean isSecondEven = int2 % 2 == 0;
                //числа разные - одно чётное, второе не чётное
                // числа одинаковые - сортировать в естесственном порядке(определять кто боольше)
                if (isFirstEven && !isSecondEven) {
                    return -1;
                } else if (!isFirstEven && isSecondEven) {
                    return 1;
                } else {
                   return Integer.compare(int1, int2);
                }
            }
        };

        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));


    }

}
