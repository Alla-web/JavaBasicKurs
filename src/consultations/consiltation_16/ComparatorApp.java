package consultations.consiltation_16;

import lesson_38.Car;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        Car[] cars = new Car[7];
        cars[0] = new Car("Alfa", 2020, 180);
        cars[1] = new Car("BMW", 2020, 100);
        cars[2] = new Car("Citroen", 2024, 130);
        cars[3] = new Car("VW", 2018, 110);
        cars[4] = new Car("Ferrari", 2012, 150);
        cars[5] = new Car("Ferrari", 2020, 150);
        cars[6] = new Car("BMW", 2020, 140);

        Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.getYear(), car2.getYear()));
        System.out.println(Arrays.toString(cars));

        System.out.println("----------------cтатический метод comparing для создания Компаратора----------------");
        Comparator<Car> comparatorYear = Comparator.comparing(Car::getYear);//передаем, какие методы мы должны странвить
        Arrays.sort(cars, comparatorYear);
        System.out.println(Arrays.toString(cars));

        System.out.println("---------мы можем задать порядок сортировки-----------------");
        System.out.println();
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        /*
        Comparator.naturalOrder() - сортирует в естесственном порядке
        Comparator.reverseOrder() - сортирует в обратном порядке
        Comparator.nullsFirst(Comparator.naturalOrder()) - обрабатывает null как наименьший элемент
         */
        System.out.println(Arrays.toString(cars));

        System.out.println("--------------------------Comparator.nullsFirst----------------------------------");
/*
        cars[4] = null;//установили один из элементов массива как null
        Arrays.sort(cars, Comparator.nullsFirst(Comparator.comparing(Car::getModel)));
        System.out.println(Arrays.toString(cars));

        System.out.println("--------------------------Comparator.nullsLast----------------------------------");
        Arrays.sort(cars, Comparator.nullsLast(Comparator.comparing(Car::getModel)));
        System.out.println(Arrays.toString(cars));
*/
        System.out.println("------------------------Default methods----------------------------------");

        Arrays.sort(cars, Comparator.comparing(Car::getModel).reversed());
        System.out.println(Arrays.toString(cars));
        System.out.println("--------------------------------");

        System.out.println("--------------Модель / Год / Скорость в естественном порядке------------");
        //сортируем сначала по модели, потом по году выпуска, потом по скорости в естесственном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear).thenComparing(Car ::getSpeed));
        System.out.println(Arrays.toString(cars));

        System.out.println("--------------Год / Скорость и всё в обратном порядке------------------");
        //сортируем сначала по модели в естеств. порядке, если модели совпали, то сортируем по году выпуска в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getSpeed).reversed());
        System.out.println(Arrays.toString(cars));
        System.out.println("--------------------------------");

        /*
        отсортировать по году выпуска в естественном порядке, и по убыванию скорости
        thenComparing() - вторая очередь сортировки
         */
        System.out.println("--------------Год (в естесственном) / Скорость (в обратном)------------------");
        //смотрим разницу какой и где использовать reverse
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getSpeed, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));

        System.out.println("--------------Год (в естесственном) / Скорость (в обратном)------------------");
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getSpeed).reversed());
        System.out.println(Arrays.toString(cars));



    }


}
