package lesson_08;

import java.util.SortedMap;

public class MethodExample {
    public static void main(String[] args) {

      int temp = 5;
        System.out.println(temp);

        String string = "Java";
        changeMe(string);
        System.out.println("3: + " + string);

        // int[] arr =


    } // Main Area

    public static void changeMe(String str){
        str = str + "!!!";
    }

    public static void changeMe(int x){
        x = 100;
    }






} // End class
