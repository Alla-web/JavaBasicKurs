package lesson_38;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        //сравнивать стринговые значение мы не можем сравнивать
        // вычитанием, т.к. это не int

        //String, Integer - имеют встроенную логику стравнения -
        // реализуют логику Comparable
        String model1 = car1.getModel(); //модель car1
        String model2 = car2.getModel();  //модель car2

        return model1.compareTo(model2);

        //String реализует по умолчанию лексикографическое сравнение строк
    }
}
