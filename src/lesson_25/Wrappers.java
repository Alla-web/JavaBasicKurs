package lesson_25;

public class Wrappers {
    /*
    Классы-обёртки используются в Java для представления примитивных данных в виде
    ссылочного типовб т.е. объектов для последующей работы с ними:
    - тип данных byte будет обёрнут в Byte
    - short -> Short
    - int -> Integer (исключение)
    - long -> Long
    - float -> Float
    - double -> Double
    - char -> Character (исключение)
    - boolean -> Boolean
     */

    public static void main(String[] args) {
        // автоматическое приведение типов
        // автоупаковка / автораспаковка:
        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // автораспаковка типа Integer в тип int
        System.out.println("-------------------------Cравнение объектов---------------------");
        Integer a = 127;
        Integer b = 127;
        // т.к. это ссылочный тип данных при == сравниваются ссылки
        System.out.println("a == b -> " + (a == b)); // true
        Integer c = 127;
        Integer d = 128;
        System.out.println("c == d -> " + (c == d)); // false

        // правильно сравнивать ссылки методом
        System.out.println("c.equals(d) -> " + c.equals(d));

        /*
            кэширование объектов - при создании 2-х строк с одинаковым значением
        во вторую ссылку присваивается тот же адрес ссылки.
            А вот через создание объекта через конструктор - не происходит этого
        кеширования.
            Но это кеширование происходит в диапазоне значений от -128 до 127 (диапазон byte)
        Для всего, что свыше будет создаваться новая ссылка.
            Поэтому для сравнения значений ссылочных данных нужно использовать метод equals(), а не
        через оператор ==
         */

        System.out.println("-----------------------------------------------------------");
        // константы
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        Integer minValue = Integer.MIN_VALUE;
        System.out.println("minValue = " + minValue);

        System.out.println("-----------------------------------------------------------");
        // у всех обёрточных типов есть схожие методы
        // valueOf() - преобразует автоматически объект/строку в объект типа обёртки,
        // когда нам не удобно использовать автоупаковку/распаковку

        System.out.println("----------------------------1. valueOf()--------------------------");
        //из строки примитива даёт его обёртку - объект
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("e == f -> " + (e == f));
        System.out.println("e.equals(f)" + e.equals(f));

        Integer intStr = Integer.valueOf("123"); // автораспаковка и обёртка в тип Integer
        System.out.println("intStr -> " + (intStr + 100));

        Double doubleWrap = Double.valueOf(154.4);
        System.out.println("doubleWrap -> " + doubleWrap);

        System.out.println("--------------------------2. parseXXX()----------------------------");
        // из обёртки (объекта Integer) даёт спримитив - int
        System.out.println(Integer.parseInt("456") + 100);

        double d1 = Double.parseDouble("345.67") + 100;
        System.out.println(d1);

        System.out.println("--------------------------3. toString----------------------------");
        // возвращает строковое представление числа
        System.out.println(doubleWrap);


    }


}
