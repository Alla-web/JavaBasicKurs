package lesson_26;

import list.MyArrayGenList;

public class ArraysTesting {
    public static void main(String[] args) {

        System.out.println("-------------------------Integer------------------------------");
        MyArrayGenList<Integer> numbers = new MyArrayGenList<>();
        numbers.addAll(1,2,3,4,5,6);
        System.out.println(numbers);

        System.out.println(numbers.remove(5));
        System.out.println(numbers);

        System.out.println("-------------------------String------------------------------");
        MyArrayGenList<String> strings = new MyArrayGenList<>();
        strings.add("Java");
        strings.addAll("Cat", "Dog", "Hamster");
        System.out.println(strings);

        System.out.println(strings.remove("Cat"));
        System.out.println(strings.remove("Dog"));
        System.out.println(strings);

    }
}
