package lesson_22.HomeWork_22.Task0_flowers;

public class CastingFlowers {
    public static void main(String[] args) {
        System.out.println("--------------------------No Casting-------------------------");
        Rose rose = new Rose();
        System.out.println(rose.toString());
        rose.blow(); // унаследованный метод от родителя Flower
        rose.prick(); // свой метод класса Rose

        System.out.println("--------------------------Upcasting-------------------------");
        // пробуем присвоить класс NotFlower к классу Flower:
        //  Flower flower1 = new NotFlower(); - ошибка, т.к. класс NotFlower не является
        // наследником класса Flower

//----------------------------------------------------------------------------------------

        // известный уже нам пример неявного преобразования
        // от меньшего int к большему double:
        int int1 = 100;
        double double1 = int1;

//----------------------------------------------------------------------------------------
        // аналогичное неявное преобразование классов, связанных наследственными связями,
        // от меньшего типа (наследник) данных в большему (родитель)
        Flower flower1 = new Rose();
        System.out.println(flower1.toString());

        // метод доступен, т.к. он есть в родителе Flower, но работает он как переназначен в Rose
        flower1.blow();
        //flower1.prick(); - не доступен, т.к. принадлежит классу Rose

        // создаём новых животных путём восходящего преобразования классов
        Flower flower2 = new Peony();
        Flower flower3 = new Snowdrop();

        // Собираю свои объекты в массив:
        Flower[] flowers = new Flower[3];
        flowers[0] = flower1;
        flowers[1] = flower2;
        flowers[2] = flower3;
        // полиморфизм позволил собрать всех наследников класса в один массив
        System.out.println("---------------------------------------------------------");
        // проверяем в каких объектах будут срабатывать какие методы:
        for (int i = 0; i < flowers.length; i++) {
            System.out.println(flowers[i].getClass());
            flowers[i].blow();
        }
        System.out.println("--------------------------Downcasting-------------------------");
//----------------------------------------------------------------------------------------
        double y = 10.5;
        int x = (int) y; // без явного преобразования -> (int)  ругается, т.к. double > int
//----------------------------------------------------------------------------------------
        Flower flower4 = new Rose();
        // flower4.prick(); - не доступен, т.к. это специф. метод класса Rose

        // получаем доступ к специфическим методам Rose:
        // делаем явное преобразование (кастинг) чтобы переменной flower
        // стали доступными специфические методы Rose:
        Rose rose1 = (Rose) flower4;
        // без явного преобразования -> (Rose)  ругается, т.к. Flower родитель > Rose наследника
        rose1.prick();

//----------------------------------------------------------------------------------------
        Rose teaRose;
        Flower brightFlower = new Rose();
        // brightFlower.prick(); - не доступен специф.метод класса Rose

        teaRose = (Rose) brightFlower;
        teaRose.prick();

        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < flowers.length; i++) {
            System.out.println("sout: " + flowers[i]);

            // проверяем, может ли объект быть приведен к классу Rose
            //т.е. является ли этот класс наследником класса Rose или его ровней (братом)
            System.out.println(flowers[i].getClass() + " instanceof Rose: " + (flowers[i] instanceof Rose));

            Flower current = flowers[i];
            if (flowers[i] instanceof Rose){
                System.out.println(i + "-й индекс может быть безопасно приведен к Rose");
                Rose tempRose = (Rose) current;
                tempRose.prick();
            }
            System.out.println("---------------------------------------------------------");
        }




        /*
    Animal animal = new Dog(); // Восходящее преобразование (upcasting)
    Dog dog = (Dog) animal; // Нисходящее преобразование (downcasting)
    dog.makeSound(); // Выведет: "Dog barks"
    */

    }
}
