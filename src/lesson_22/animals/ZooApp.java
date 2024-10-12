package lesson_22.animals;

public class ZooApp {
    /*
    Если нет явного наследования, все классы будут по умолчанию наследоваться от класса Object.
    Это сделано в Java для того, чтобы у классов был доступ к уже созданному функционалу
    - нужно почитать про 11 методов этого класса
     */
    public static void main(String[] args) {
        // Object - класс от которого наследуется все классы в Java
        // гарантирует наличие всех методов класса Object у объекта любого типа

        System.out.println("------------------------Cat----------------------------");
        Cat cat = new Cat();
        cat.voice(); // переопределенили метод
        System.out.println(cat.toString()); // переопределенили метод
        cat.eat();

        System.out.println("------------------------Dog----------------------------");
        Dog dog = new Dog();
        dog.voice(); // нет переопределения метода
        System.out.println(dog.toString());

        System.out.println("------------------------Hamster----------------------------");
        Hamster hamster = new Hamster();
        hamster.voice(); // есть переопределение метода
        System.out.println(hamster.toString());

        System.out.println("------------------------Test----------------------------");
        Test test = new Test();
        System.out.println(test.toString());

        System.out.println(hamster);






    }
}
