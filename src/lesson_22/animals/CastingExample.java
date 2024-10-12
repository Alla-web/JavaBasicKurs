package lesson_22.animals;

public class CastingExample {
    public static void main(String[] args) {

        // ВОСХОДЯЩЕЕ и НИСХОДЯЩЕЕ преобразование

        System.out.println("----------------------ВОСХОДЯЩЕЕ кастирование (преобразование)------------------------");
        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal
        // мы присвоили объект Cat объекту Animal
        /*
        при этом мне перестали быть доступны методы класса Cat
        Т.Е. - тип ссылки определяет:
            1) ссылка на объекты каких типов здесь могут храниться
            2) какие методы мне доступны
         */

        animal.voice();
        // доступен, т.к. он есть и в Animal, и в Cat, но реализация будет от
        // animal.eat - не доступен, т.к.

        // Такое присвоение не допустимы
        //Animal animal1 = new Test();
        // такое переприсвоение невозможно, т.к. Test не является наследником Animal

        //----------------------------------------------------------------------------------
        // неявное преобразование от меньшего типа данных в большему
        int i1 = 100;
        double d1 = i1;

        //----------------------------------------------------------------------------------
        // здесь происходит такое же неявное преобразование от класса ребёнка к классу родителю
        Dog dog = new Dog();

        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = dog;
        animals[2] = animal3;
        // полиморфизм позволил мне собрать всех наследников класса в один массив

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
        System.out.println("----------------------НИСХОДЯЩЕЕ кастирование (преобразование)------------------------");

        //----------------------------------------------------------------------------------
        double y = 10.5;
        int x = (int) y; // требуется явное преобразование от большего к меньшему типу данных

        Cat catlink;
        Animal animalLink = new Cat();
        // ругается, потому что класс  Cat шире, чем класс Animal и будут ошибки,
        // что функционал класса Cat будет работать

        // animal.eat(); - не доступен

        catlink = (Cat) animalLink;
        catlink.eat();

        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println("sout: " + animals[i]);

            System.out.println(animals[i].getClass() + " instanceof Cat: "+ (animals[i]instanceof Cat)); // проверяем, что объект может быть приведен к классу Cat
            //т.е. является ли этот класс наследником класса Cat или его ровней (братом)

            Animal current = animals[i];

            if (animals[i] instanceof Cat) { // всегда нужна эта проверка
                System.out.println(i + "-й индекс может быть безопасно приведен к Cat");
                Cat tempCat = (Cat) current;
                tempCat.eat();
            }
            System.out.println("----------------------------");
        }
        // TODO как вызвать


    }
}
