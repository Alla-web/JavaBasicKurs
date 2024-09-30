package lesson_13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SelfLearning {
    public static void main(String[] args) {
        int[] testArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(testArray));


    }

}

