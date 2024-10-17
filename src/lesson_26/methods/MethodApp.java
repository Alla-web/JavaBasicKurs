package lesson_26.methods;

import list.MyArrayGenList;

import java.io.PrintStream;

public class MethodApp {
    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        System.out.println(Util.printArray(integers));

        String[] strings = {"Hello", "World", "Java"};
        System.out.println(Util.printArray(strings));

        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        System.out.println(Util.printArray(doubles));

        System.out.println("-------------------------Поменять значения элементов по индексу----------------------------");

        System.out.println(Util.printArray(strings));
        Util.swap(strings, 0, 2);
        System.out.println(Util.printArray(strings));

        System.out.println("-------------------------Посчитать сумму элементов массива----------------------------");
        System.out.println(Util.printArray(doubles));
        double sum = Util.sum(doubles);
        System.out.println("sum of elements = " + sum);
        System.out.println("--------------------------------------------");
        System.out.println(Util.printArray(integers));
        // int sum1 = Util.sum(integers); - ??? почему не работает

        System.out.println("--------------------MyArrayGenList------------------------");
        MyArrayGenList<Integer> myArrayGenListInt = new MyArrayGenList<>();
        myArrayGenListInt.add(1, 2, 3, 4, 5, 6, 7);
        System.out.println(Util.printArray(myArrayGenListInt));

        double listSum = Util.listSum(myArrayGenListInt);
        System.out.println("listSum = " + listSum);

        MyArrayGenList<String> myArrayGenListStr = new MyArrayGenList<>();
        myArrayGenListStr.add("Alla", "Nata", "Marta");
        System.out.println(Util.printArray(myArrayGenListStr));


    }
}
