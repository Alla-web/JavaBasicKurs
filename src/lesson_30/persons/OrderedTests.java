package lesson_30.persons;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//указываем упорядочивание тестовых методов в классе
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// эта аннотация говорит о том, что порядок запуска методов класса
// будет определяться аннотацией @Order
public class OrderedTests {
    /*
    !!!ВАЖНО. Если не требуется расстановки поочерёдности проведения тестов,
    лучше этого не делать, т.к. это будет замедлять работу программы

     */

    @Test
    @Order(10)
    void firstTest() {
        System.out.println("First test");
    }

    @Test
    @Order(20)
    void secondTest() {
        System.out.println("Second test");
    }

    @Test
    @Order(30)
    void thirdTest() {
        System.out.println("Third test");
    }

    @Test
    @Order(15)
    void betweenTest() {
        System.out.println("Between test");

    }

    @Test
    void randomTest() {
        System.out.println("Random test");
    }

    @Test
    void randomTest2() {
        System.out.println("Random test2");
    }
}
