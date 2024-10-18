package lesson_26.homeWork_26.task2;

import list.MyArrayGenList;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList и MyArrayList, и выводит элементы обоих списков.
Требования:
Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
 */
public class Task2 {
    public static void main(String[] args) {

        MyArrayGenList<String> names = new MyArrayGenList<>();
        names.add("Alla");
        names.add("Nata");

        MyArrayGenList<Integer> numbers = new MyArrayGenList<>();
        numbers.add(85);
        numbers.add(105);

        printTwoLists(names, numbers);

        MyArrayGenList<Character> characters = new MyArrayGenList<>();
        characters.add('A');
        characters.add('B');

        printTwoLists(numbers, characters);


    }
    public static <T, U> void printTwoLists(MyArrayGenList<T> list1, MyArrayGenList<U> list2){

        // вывожу елементы 1-го списка
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // вывожу елементы 2-го списка
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }


}
