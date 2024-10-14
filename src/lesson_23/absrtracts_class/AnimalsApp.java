package lesson_23.absrtracts_class;

public class AnimalsApp {
    public static void main(String[] args) {

        System.out.println("---------------------Cat----------------------------");
        Cat cat = new Cat("Tom");
        cat.eat();
        cat.sayHello();

        // Нельзя создать (инстанцировать) объект абстрактного класса -
        // Animal animal = new Animal(); - выдаёт ошибку
        // собирать объекты дочерних классов в ссылку родительского абстрактного класса

        // но мы можем использовать полиморфизм:
        Animal animal = new Cat("Max");
        // Собирать объекты дочерних классов в ссылку родительского абстрактного класса
        System.out.println("Name - " + animal.getName());

        // В абстрактном классе могут присутствовать "обычные методы" с реализацией
        animal.sayHello(); // родительский метод

        System.out.println("---------------------Dog----------------------------");
        Dog dog = new Dog("Pluto");
        dog.eat();
        dog.sayHello();

        System.out.println("---------------------Cow----------------------------");
        // Cow cow = new Cow(); - не можем создавать объекты абстракного класса

        SuperCow superCow = new SuperCow("Mu");

        animalTest(superCow);


    }

    public static void animalTest(Animal animal) {
        animal.sayHello();
        animal.eat();
    }


}
