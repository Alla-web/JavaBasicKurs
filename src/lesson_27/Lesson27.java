package lesson_27;

import list.MyArrayGenList;

import java.util.Arrays;

public class Lesson27 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------");
        MyArrayGenList<Integer> integers = new MyArrayGenList<>();
        integers.addAll(1,2,3,4,5,6,7,8,9);
        System.out.println(integers);

        System.out.println("-----------------------------------------------------------------");
        integers.add(100);
        System.out.println(integers);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("size = " + integers.size());

        System.out.println("-----------------------------------------------------------------");
        System.out.println("isEmpty -> "  + integers.isEmpty());

        System.out.println("-----------------------------------------------------------------");
        int index = integers.indexOf(100);
        System.out.println(index);

        System.out.println("-----------------------------------------------------------------");
        integers.set(index, -200); // не работает
        System.out.println(integers);

        System.out.println("-----------------------------------------------------------------");
        System.out.println(integers.contains(1));
        System.out.println(integers.contains(500));

        System.out.println("-----------------------------------------------------------------");
        Integer value = integers.get(50); // Integer - потому, что сейчас работаем с типом Integer
        System.out.println("value = " + value);
        value = integers.get(5);
        System.out.println("value = " + value);
        System.out.println("---------------------------------remove (перегружен) по индексу--------------------------------");
        System.out.println(integers);
        integers.remove(3); // удаление по индексу - ввели просто итн
        System.out.println(integers);
        System.out.println("--------------------------");
        // перегруженный Integer метод - нужно добывать примитив от введённого запакованного Integer
        integers.remove(Integer.valueOf(9)); // TODO не работает
        System.out.println(integers);
        System.out.println("-----------------------------------------------------------------");
        Integer[] array = integers.toArray();
        System.out.println(Arrays.toString(array));


        System.out.println("------------------------");

        MyArrayGenList<String> strings = new MyArrayGenList<>();

        strings.add("Hello");
        String[] strArray = strings.toArray();
        System.out.println(Arrays.toString(strArray));


















    }
}
