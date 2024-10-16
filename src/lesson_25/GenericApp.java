package lesson_25;

public class GenericApp {
    public static void main(String[] args) {

        // при создании объекта мы заменили в <> Т на String
        // и объект автоматически понял, что наш объект нужно создавать в типе String

        // сам код мы прописываем один раз и этот класс может работать с различными типами данных
        GenericBox<String> stringBox = new GenericBox<>("Hello");
       /*
       GenericBox<String> stringBox2 = new GenericBox<>(25);
       ошибка компиляции - value указали в int, а тип данных указали String
       а это большое преимущество в безопасности (код не сработает на этапе запуска программы)
       и в гибкости кода - пишем одни методы и они работают с объектами различных типов
        */

        System.out.println(stringBox);
        stringBox.setValue("Hello World");
        System.out.println(stringBox);

        System.out.println("------------------------Generic не работают с примитивными типами данных--------------------------------");
        /*
         GenericBox<int> box = new  GenericBox() - ошибка:
        т.к. Generic работают только с объектами - ссылочными данными,
        а не с примитивами
         */
        System.out.println("-----------------------Как решить эту проблему: --------------------------------");






    }
}
