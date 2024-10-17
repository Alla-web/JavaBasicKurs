package lesson_26;

import lesson_24.interfaces.Book;

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

        Boolean booleanWrapper = true; // автоупаковка примитива boolean в ссылочный тип Boolean
        booleanWrapper = null;
        // примитивный boolean - хранит 2 значения (true/false),
        // а ссылочный Boolean - хранит 3 значения (true/false/null)

        System.out.println("-------------------------Cравнение объектов (equals())---------------------");
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

        System.out.println("------------------------------константы-----------------------------");
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        Integer minValue = Integer.MIN_VALUE;
        System.out.println("minValue = " + minValue);

        System.out.println("--------------------------------методы---------------------------");
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
        // из обёртки (объекта Integer) даёт спримитив - int (Double -> double; Long -> long)
        System.out.println(Integer.parseInt("456") + 100);

        double d1 = Double.parseDouble("345.67") + 100;
        System.out.println(d1);

        System.out.println("--------------------------3. toString----------------------------");
        // возвращает строковое представление числа
        System.out.println(doubleWrap);

        System.out.println("--------------------------4. equals() сравнение объектов----------------------------");
        // сравнение объектов на равенство значений
        Long l1 = 200L; // 1-й вариант написания
        Long l2 = Long.valueOf(200); // 2-й вариант написания

        // мы хотим сравнить объект типа Long с примитивным int-м
        // метод equals() принимает объект типа Object
        // для примитива int его обёртка (ссылочный тип Integer) -> int автоупаковывается в Integer
        // логика сравнения метода equals(): 1) проверка равны ли ссылки - равны -> true,
        // 2) если ссылки не равны -> проверяются типы данных объектов -> равны типы данных ->
        // 3) 3 этам - сравниваем значения

        System.out.println("l1.equals(200) -> " + l1.equals(200)); // false
        // автопривели к типу long путём добавления L к числу -> true
        System.out.println("l1.equals(200) -> " + l1.equals(200L));

        Integer i1 = 150;
        System.out.println("i1.equals(150) -> " + i1.equals(150));

        System.out.println("--------------------------4. compareTo() сравнение объектов----------------------------");
        //сравнивает текущий объект с другим объектом того же типа
        //но equals сравнивает на равенство, а compareTo может определить
        // кто из сравниваемых объектов больше и выдаёт:
        //  1 - текущий объект больше, чем тот объект, с которым мы сравниваем
        // -1 - текущий объект меньше, чем тот объект, с которым мы сравниваем
        //  0 - текущий объект равен, тому объекту, с которым мы сравниваем

        Integer iMax = 250;
        Integer iMin = 125;
        Integer iSuper = 500;

        System.out.println(iMax + " compareTo(" + iMin + ") -> " + iMax.compareTo(iMin));
        System.out.println(iMax + " compareTo(" + iSuper + ") -> " + iMax.compareTo(iSuper));
        System.out.println(iMax + " compareTo(" + iMax + ") -> " + iMax.compareTo(iMax));

        System.out.println("--------------------------4. xxValue() сравнение объектов----------------------------");
        // возвращает значение объекта в виде примтивного типа - аналог автоупаковки (Integer i = 100)
        // doubleValue

        // явная принудительная упаковка притива double 126.125 в Double 126.125
        Double d2 = Double.valueOf(126.125);
        // явная принудительная распаковка из Double 126.125 в double 126.125
        double dPrimitive = d2.doubleValue();
        System.out.println("dPrimitive -> " + dPrimitive);
        System.out.println("-----------------------------------------------------------------------");

        /*
        Все числовые обёртки наследуются от абстрактного класса Number
        Byte
        Short
        Integer (исключение)
        Long
        loat
        Double

        byte.Value
        short.Value
        integer.Value
        long.Value
        float.Value
        double.Value
      */
        Integer integer = 31844;
        Double doubleVal = 235.76;
        System.out.println("31844 -> integer.doubleValue() -> " + integer.doubleValue());

        short shortPrimirive = integer.shortValue();
        int intPrimitive = doubleVal.intValue();
        System.out.println("intPrimitive -> " + intPrimitive);


    }


}
