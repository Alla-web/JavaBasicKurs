package lesson_38;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        /*
        car1<car2 -> отрицательное значение
        car1=car2 -> 0
        car1>car2 -> положительное значение
         */
        //от меньшего к большему
        return car1.getSpeed()-car2.getSpeed();

        // от большего к меньшему сортируем
        /*
        car1 = 100
        car2 = 200
        car1 - car2 = положительное значение возвращается, а значит car1 >
        car2 - car1 = отрицательное значение возвращается
         */

        //return car2.getSpeed()-car1.getSpeed();
    }
}
