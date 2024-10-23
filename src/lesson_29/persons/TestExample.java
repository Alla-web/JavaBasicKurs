package lesson_29.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

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

    @BeforeAll

    // запускается после КАЖДОГО теста
    @AfterEach

    // запускается ПОСЛЕ первого теста
    @AfterAll

    //тест отключён, пока не работает (н-р на время устранения ошибок)
    @Disabled

    // позволяет создать вложенный новый класс -
    // для логической группировки новых тестовых методов
    @Nested

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


}