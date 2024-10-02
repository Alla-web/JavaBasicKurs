package lesson_16;

import lesson_15.Cat;

public class Lesson_16 {
    public static void main(String[] args) {

        // через импорт - имя класса и enter
        Cat catVar = new Cat(); // ссылочный тип данных
        /*
        создаём объект класса Cat - конструктор по умолчанию
            1. Физически создаётся объект в памяти - new Cat()
            2. Вызывается конструктор класса для инициализации свойств объекта (заполнение полей)
         */
        catVar.whoAmI();
        System.out.println("catVar.name -> " + catVar.name);
        catVar.name = "Jack";
        System.out.println("catVar.name -> " + catVar.name);
        catVar.color = "black";
        catVar.age = 10;
        catVar.whoAmI();

        System.out.println("-----------------------------------------------------------");

        Cat barsik = new Cat("Barsik", "grey", 10);
        barsik.whoAmI();
        System.out.println("barsik.name -> " + barsik.name);
        System.out.println("barsik.color -> " + barsik.color);
        System.out.println("barsik.age -> " + barsik.age);
        barsik.age = 12;

        System.out.println("-------------------------------------------------------------");
// я могу создавать несколько объектов с одинаковыми значениями, если мне это нужно
        Cat cat1 = new Cat("Barsik", "grey", 10);
        System.out.println("--------------cat1----------------------");
        cat1.whoAmI();

        System.out.println("--------------catClon----------------------");
        Cat catClon = cat1; // 2 ссылки (пульта) на один и тот же объект
        cat1.whoAmI();

        cat1.age = 100;
        cat1.whoAmI();
        catClon.whoAmI();
        System.out.println("--------------barsik----------------------");
        barsik.whoAmI();
        catClon.name = "Max";
        catClon.whoAmI();
        cat1.whoAmI();

        System.out.println("--------------Kratos----------------------");
        catClon = new Cat("Kratos", "black", 99);
        catClon.whoAmI();
        cat1.whoAmI();

        catClon = cat1; // обратно перезаписали (см. строку 39)
        catClon = null; // ссылка ни на что, выдаст ошибку - обратно вернуть нельзя
        // у null нельзя вызвать ничего, потому не существует объекта, который имеет эти панраметры
        //System.out.println(catClon.name);
        //catClon.whoAmI();

        // чтобы программа не поломалась нужна проверка на null
        if ( catClon != null) {
            System.out.println(catClon.name);
            catClon.whoAmI();
        }



    } // main area


} // class area
