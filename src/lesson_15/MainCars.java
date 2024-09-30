package lesson_15;

public class MainCars {
    /*
Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
     */
    public static void main(String[] args) {
        // 1. создаём объект класса Cars_HomeWork15 и конструктор
        Car car = new Car();

        // 2. Вызываем методы, описывающие поведение наших объектов
        car.stay();
        car.drive();
        car.repair();

        System.out.println("-----------------------------------------------------");

        // 3. Присваиваем переменные и выводим значения по умолчанию
        String carModel = car.model;
        System.out.println("carModel: " + carModel);

        int yearCreat = car.year;
        System.out.println("yearCreat: " + yearCreat);

        double carPrise = car.prise;
        System.out.println("carPrise: " + carPrise);

        System.out.println("-----------------------------------------------------");

        // 4. Вводим новые объекты
        Car car1 = new Car("Chewrole", "Orlando", "blu");
        System.out.println("brand: " + car1.brand);
        System.out.println("model: " + car1.model);
        System.out.println("color: " + car1.color);

        System.out.println("-----------------------------------------------------");

        Car car2 = new Car("VW", "Golf 5Plus", "black", 2006, 140, 8, 3500.5);
        car2.whoIAm();
    }

}// class area
