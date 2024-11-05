package lesson_38;

import java.util.Arrays;
import java.util.Comparator;

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

        System.out.println("----------сортируем авто по СКОРОСТИ-----");

        //создаём до класс CarSpeedComparator и имплементируем типизированный
        // класс Comparator и указываем тип данных Car
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println("Массив авто после сортировки по СКОРОСТИ");
        System.out.println(Arrays.toString(cars));

        System.out.println("----------сортируем авто по МОДЕЛИ-----");

        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);
        System.out.println("Массив авто после сортировки по МОДЕЛИ");
        System.out.println(Arrays.toString(cars));

        System.out.println("----------------Anonymous class--------------------------");
        System.out.println("----------сортируем авто по МОДЕЛИ-----");
        //сортируем машины по МОДЕЛИ без создания отдельного класаса Comparator,
        // используем аннонимный класс (мы не знаем его названия) "на лету"
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
               return car1.getModel().compareTo(car2.getModel());
            }
        });
        System.out.println("Массив авто после сортировки по МОДЕЛИ");
        System.out.println(Arrays.toString(cars));
        /*
        Плюсы:
            если вам нужно использовать сортировкувсего один раз и с естесственным
            порядком сортировки, можем
            не писать отдельный класс и это упрощает написание кода
        Минусы:
            когда нам нужно неколько раз использовать сортировку и с разной логикой
            (не только с естесственным порядком, а нужно дописывать другие вариации сортировки) и
            если в имплементируемом классе большое количество методов - это
            будет затруднять читаемость кода
         */

        System.out.println("-------------Сортировка по году и по модели--------------");
        //хотим сравнить машины по году в порядке возрастания, и
        // одновременно по моделив порядке убывания
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = car1.getYear()-car2.getYear();
                if (yearCompare == 0){
                    //значит годы равны и сортируем по убыванию модели
                    return car2.getModel().compareTo(car1.getModel());
                } else {
                    return yearCompare;
                }
            }
        });

        System.out.println("Массив авто после сортировки по ГОДУ, а потом по убыванию МОДЕЛИ");
        System.out.println(Arrays.toString(cars));

        System.out.println("-----------Функциональный интерфейс-------------------");
        /*
        Функциональный интерфейс - это тип интерфейса, который имеет ровно 1 АБСТРАКТНЫЙ метод
        как Comparator

        Лямбда выражения - сопособ краткой записи анономных функций.Используется исключительно
        дляреализации функциональных интерфейсов
        Синтаксис:
            (параметр) -> {тело выражения}
         */
        System.out.println("-------------------Lambda expressions---------------------------");
        System.out.println("-------------------CarSpeedComparator ---------------------------");
        //т.к. Comparator имеет только 1 (какой-то?) метод, Java знает, что за синтаксис у этого метода
        // и позволяет указать только параметры и выражение даже без указания типа:

        //когда реализация состоит из одного выражения, фигурные скобки не трубуютчя
        //ключевое слово return не используется. Результат выражения автоматически возвращается
        Arrays.sort(cars, (car1, car2) -> car1.getSpeed()-car2.getSpeed());

        //когда у нас более, чем 1 выраюение, появляется блок - нужен return
        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed()-car2.getSpeed();
        });

        System.out.println("Массив авто после сортировки по СКОРОСТИ");
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = car1.getYear()-car2.getYear();
            if (yearCompare == 0){
                //значит годы равны и сортируем по убыванию модели
                return car2.getModel().compareTo(car1.getModel());
            } else {
                return yearCompare;
            }
        });
        System.out.println("Массив авто после сортировки по по ГОДУ и МОДЕЛИ ");
        System.out.println(Arrays.toString(cars));

        System.out.println("--------Comparator по ГОДУ и МОДЕЛИ на Лямбда выражениях-----------");
        /*
        компаратор на лямбда выражении по возрастанию года выпуска и по возрастанию скорости
         */
        //этот компаратор мы можем не переиспользовать! т.к. он анонимный
        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = car1.getYear()-car2.getYear();
            /*
            альтернативная форма записи:
             yearCompare = Integer.compare(car1.getSpeed(), car2.getSpeed());
             тоже вернёт интовый результат
            */

            /*
            если хотим использовать compareTo - но лучше так не делать
            Integer.valueOf(car1.getSpeed().compareTo(Integer.valueOf(car2.getSpeed())));
             */

            if (yearCompare == 0){
                //значит годы равны и сортируем по возрастанию скорости
                return car1.getSpeed()-(car2.getSpeed());
            } else {
                return yearCompare;
            }
        });

        System.out.println("Массив авто после сортировки по по ГОДУ и СКОРОСТИ ");
        System.out.println(Arrays.toString(cars));

        //TODO посмотреть код Сергея
        //этот компаратор мы можем переиспользовать!
        Comparator<Car> comparator = (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            if(yearCompare == 0) {
                return Integer.compare(car1.getYear(), car2.getYear());
            }
            return yearCompare;
        };
        System.out.println("Массив авто после сортировки по по ГОДУ и СКОРОСТИ ");
        System.out.println(Arrays.toString(cars));

        System.out.println("--------Comparator по убыванию ГОДА на Лямбда выражениях-----------");
        /*
        написать компаратор с использованием лямбда выроажений
        для сортировки года в убывающем порядке
         */

        Arrays.sort(cars, (car1, car2) -> car1.getYear()-car2.getYear());
        System.out.println("Массив авто после сортировки по возрастанию ГОДА");
        System.out.println(Arrays.toString(cars));
        /*
        TODO объяснения Сергея

         */

        System.out.println("-----------Comparator - статические методы(простые)----------");
        System.out.println("---------------------по ГОДУ выпуска--------------------");
        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------------по ГОДУ выпуска в обратном порядке--------------------");
        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed()); // ??? разница

        //Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()); // ??? разница
        System.out.println(Arrays.toString(cars));

        System.out.println("---------------------по ГОДУ выпуска и МОДЕЛИ--------------------");
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel));
        //как здесь (при 2-х критериях) сделать обратный порядок?
        System.out.println(Arrays.toString(cars));

    }

}
