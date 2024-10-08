package lesson_19;

import lesson_18.Car;

public class MainApp {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(50);

        FinalDemo finalDemo2 = new FinalDemo();

        System.out.println("---------------------------------------------------------");
        final Car car = new Car("VW", 200);
        // car = new Car("BMW", 150); - не можем изменить ссылку final объекта
        // car = null; - не можем изменить ссылку final объекта

        // но состояние объекта мы можем менять:
        car.setPowerPS(800);
        System.out.println(car.toSring());

        System.out.println("---------------------------------------------------------");
        System.out.println("PI" + FinalDemo.PI);
        // FinalDemo.PI = 10; - ошибка, нельзя изменить значение final переменной

        System.out.println("---------------------------------------------------------");
        System.out.println("Country -> " + FinalDemo.COUNTRY);
        System.out.println(FinalDemo.COUNTRY.toUpperCase());






    }
}
