package lesson_18;

public class CarApp {
    public static void main(String[] args) {
        // печатаем значение static переменной до создния объектов
        System.out.println("static var - totalCarProduced -> " + Car.totalCarProduced);

        Car car = new Car("BMW", 200);
        car.info();

        Car car2 = new Car("VW", 90);
        car2.info();

        System.out.println("-----------Печатаем 1-е авто, после создания второго------------");

        // печатаем снова первое авто, но после создания второго авто
        // и видим их общее количество уже 2 авто
        car.info();

        System.out.println("-----------Печатаем значение переменной static------------");
        // печатаем значение переменной, обращаясь к ней
        System.out.println("static var - totalCarProduced -> " + Car.totalCarProduced);
        // ми можем обратиться к static, используя имя конкретного объекта

        // НО, это плохая практика, нужно обращаться к static от имени класса, которому она принадлежит
        System.out.println("static var - totalCarProduced -> " + car.totalCarProduced);


        System.out.println("-----------Методы static------------");
        // обращаемся к методу через класс, если он помечен как static
        Car.tesStatic();
        // если метод не помечен модификатором static, мы можем обратиться только через переменную
        //car2.tesStatic();

        System.out.println("-----------Использование статических методов \"Утилс\"------------");
        //Использование статических методов "Утилс"
        int sum = MathUtils.sumOfInts(25, 10);
        // для обращения к статическим методам нам не нужно создавать обэкты (экземпляры) класса

        System.out.println("----------------------------------------------------");






    }// main area



}// class area
