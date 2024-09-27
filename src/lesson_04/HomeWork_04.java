package lesson_04;

public class HomeWork_04 {
    public static void main(String[] args) {
        /*
        Task 1. Неявное преобразование int в double
    Напишите программу, которая:
    Объявляет переменную типа int и присваивает ей значение 10.
    Присваивает значение этой переменной в переменную типа double
    с именем myDouble.
    Выводит значение myDouble на экран.
    Ожидаемый результат: Значение myDouble: 10.0
         */
        int myInt = 10;
        System.out.println("My int: " + myInt);
        double myDoudle = myInt;
        System.out.println("My double :" + myDoudle);
        System.out.println("==========================================");

        /*
        Task 2. Явное преобразование double в int
    Напишите программу, которая:
    Объявляет переменную double с именем myDouble
    и присваивает ей значение 5.99.
    Преобразует myDouble в int с помощью явного преобразования
    и сохраняет результат в переменную int с именем myInt.
    Выводит значение myInt на экран.
    Ожидаемый результат: Значение myInt: 5
         */

        double myDouble1 = 5.99;
        int myInt1 = (int) myDouble1;
        System.out.println("myDouble: " + myDouble1);
        System.out.println("myInt: " + myInt1);
        System.out.println("==========================================");

        /*
        Task 3. Потеря данных при преобразовании
    Напишите программу, которая:
    Объявляет переменную long с именем bigNumber и присваивает
    ей значение 15 000 000 000 (15 миллиардов).
    Преобразует bigNumber в int с помощью явного преобразования
    и сохраняет результат в переменную int с именем smallNumber.
    Выводит значение smallNumber на экран.
    Обратите внимание на полученный результат и подумайте,
    почему он отличается от ожидаемого.
         */
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;
        System.out.println("bigNumber: " + bigNumber);
        System.out.println("smallNumber: " + smallNumber);
        System.out.println("==========================================");

        /*
        Task 4. (Опционально)
    Напишите программу на Java, которая преобразует ваше имя, записанное
    маленькими буквами, в верхний регистр.
    Для каждой буквы имени создайте отдельную переменную типа char,
    инициализированную соответствующей буквой в нижнем регистре.
    Затем преобразуйте каждую букву в верхний регистр, используя только
    арифметические операции (без использования библиотечных функций),
    и выведите результат.
         */

        char ch1 = 'a';
        char ch2 = 'l';
        char ch3 = 'l';
        char ch4 = 'a';
        String result = "" + ch1 + ch2 + ch3 + ch4;
        System.out.println("My name: " + result);
        System.out.println("My name1: " + "" + ch1 + ch2 + ch3 + ch4);
        System.out.println("------------------------------------------");

        // Преобразовываем маленькие символы в большие
        ch1 -= 32; // вместо char ch1 = (char) ('a' - 32);
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        System.out.println("My name01: " + "" + ch1 + ch2 + ch3 + ch4);
        System.out.println("My name010: " + ch1 + ch2 + ch3 + ch4); // если добавить в вывод "My name01: " - выведет буквами, а без этой части нужно конкатенировать
        System.out.println("==========================================");
        // TODO

        // лёгкий путь написания имени с большой буквы
        char ch11 = 65;
        char ch12 = 108;
        char ch13 = 108;
        char ch14 = 97;
        String result2 = "" + ch11 + ch12 + ch13 + ch14;
        System.out.println("My name (with capital letter): " + result2);

        char ch111 = (char) 65;
        char ch122 = (char) 108;
        char ch133 = (char) 108;
        char ch144 = (char) 97;
        String result3 = "" + ch111 + ch122 + ch133 + ch144;
        System.out.println("My name (with capital letter)1: " + result3);
        System.out.println("My name (with capital letter)1: " + result3);
        System.out.println("==========================================");

        // Экранирование спецсимволов
        // System.out.println("Hello " + \"main\");

        //Переполнение типа данных byte (мах = 127)
        byte b1 = 127;
        b1 += 5;
        System.out.println(b1);
        b1--;
        System.out.println(b1);


    }
}
