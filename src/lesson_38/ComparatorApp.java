package lesson_38;

import java.util.Arrays;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 2, 3, 0, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abbb", "Cccc","ABbb", "apple", "Zebra"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Car[] cars = new Car[5];

        cars[0]=new Car("Alfa", 2021, 120);
        cars[1]=new Car("BMW", 2000, 190);
        cars[2]=new Car("Citroen", 2018, 190);
        cars[3]=new Car("VW", 2024, 250);
        cars[4]=new Car("Ferrari", 2024, 300);

        System.out.println(Arrays.toString(cars));

        //--------------------Comparable--------------------------------
        //ддолжны добавить в наш класс Car импленментацию типизированного интерфейса Comparable

        Arrays.sort(cars); // выдаёт ошибку - не умеет сравнивать объекты - нужно переопределить
        // метод compareTo(Car car1) из интерфейса Comparable
        System.out.println("Массив авто после сортировки по ГОДУ");
        System.out.println(Arrays.toString(cars));

        System.out.println("----------------Comparator-----------------------------");

        System.out.println("----------сортируем авто по скорости-----");

        //создаём до класс CarSpeedComparator и имплементируем типизированный
        // класс Comparator и указываем тип данных Car
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println("Массив авто после сортировки по СКОРОСТИ");
        System.out.println(Arrays.toString(cars));

        System.out.println("----------сортируем авто по модели-----");

        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);
        System.out.println("Массив авто после сортировки по МОДЕЛИ");
        System.out.println(Arrays.toString(cars));









    }

}
