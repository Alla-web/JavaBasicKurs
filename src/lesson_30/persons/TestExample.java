package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {
    //ТЕСТЫ ДОЛЖНЫ ПИСАТЬСЯ НЕЗАВИСИМО ДРУГ ОТ ДРУГА

    // мы будем писать здесь кучу методов
    //-----Метод, который будет выполнен перед каждым тестовым методом------------

    // запускается перед каждым тестом
    @BeforeEach
    void setUp() {
        System.out.println("Method before each");
    }

    // запускается перед первым тестом
    @Test
    public void emptyTest() {

        // пустой метод будет выдавать Тест пройден, т.к. нет условия,
        // при котором тест не пройден
        System.out.println("Test empty");
    }
/*
    /@BeforeAll - метод выполняется только один раз перед выполнение первого теста
    @AfterEach - выполняется после КАЖДОГО тестовым методом
    @AfterAll - метод выполняется только один раз после выполнение всех тестовых методов
    @Disabled - указывает, что тест отключен и выполняться не будет
    @Nested - позволяет создать вложенный тестовый класс. Может быть использована для логической группировки тестовых методов

 */

    //------------------------Тестовые методы-------------------------------------

    // аннотация указывает, что метод является тнстовым
    @Test
    public void testAddition() {

        System.out.println("testAddition");

        int result = 2 + 2;
        // ожидаемое значение = 4
        // реальное значение сохранено в переменной result
        // теперь нужно их сравнить

        // Методы проверки утверждений
        //1) assertEquals(expected, actual) - проверяет равны ли 2 значения
        Assertions.assertEquals(4, result);

        //assertNotEquals() - проверяет на неравенство ожидаемого и фактического результатов
        // такой тест будет пройден, если такие результаты не совпадают
        Assertions.assertNotEquals(5, result);

        // проверяет, что условие верно и возвращает true
        Assertions.assertTrue(result >= 4);

        // проверяет, что условие ложно (условие возвращает false)
        assertFalse(result > 4);

        //провнряет, что объект равен null
        assertNull(null);

        //провнряет, что объект НЕ равен null
        assertNotNull("String");

    }

    //------------------------Параметризированные методы-------------------------------------
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"}) // источник значений
    public void testFruits(String fruit) {
        //цикл будет перебирать все итерации и выдавать результат
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > -5);
    }

    // CSV- Comma-Separated-Value
    // файл - в котором каждая строка представлена в виде перечисления значений
    // строки таблицы данных
    //источник данных в формате CSV

    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
        // на каждой итерации приходит один параметр "apple, 1"
    void testCsvSource(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    //2-й способ
    // источник данных файл в формате csv
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    // источником данных может служить метод и в 2-х вариантах
    // параметризированные методы умеют работать тольк со СТРИМАМИ
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSource(String fruit) {
        System.out.println(fruit);
        assertNotNull(fruit);
    }

    //метод, который является источником тестового метода выше
    // Stream - способ поочерёдной передачи данных
    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "cherry");
    }

    // тоже самое но с int-овым типом данных
    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSource(int value) {
        System.out.println("current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -1, 4, 5);
    }

    @ParameterizedTest
    @MethodSource("DataArguments")
    void testMethodSource(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value; // квадрат числа
        assertEquals(expected, result);
        assertEquals(isEquals, result == expected);
    }


    static Stream<Arguments> DataArguments() {
        return Stream.of(
                //на каждом цикле проверки будет проверена одна следующая строка
                Arguments.of(2, 4, true), // 2 в квадрате будет 4 и это правда
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    //------------------------------------------------------------------------------------/*

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonData(Person person, String newEmail) {
        System.out.println(person);
        System.out.println(newEmail);
    }


    static Stream<Arguments> testPersonsData() {
        Person person = new Person("test@mail.com", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new123@gmail.com"),
                Arguments.of(new Person("invalid.mail.com", "password"), "mail.test.com") // невалидный

        );
    }


}