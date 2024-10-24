package lesson_30.persons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.logging.SocketHandler;
import java.util.stream.Stream;

public class PersonTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
        // метод будет запускаться перед каждым тестом
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    /*
    1) берём валидный Email
    2) устанавливаю валидный Email для person
    3) ожидаю, что у person теперь валидный Email, который мы установили на 2-м шаге
    4) проверяем равентсво person.getEmail с валидным Email, который мы установили
     */

    //ВАЛИДНЫЙ сценарий
    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        person.setEmail(validEmail);
        System.out.println("current email -> " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    НЕВАЛИДНЫЙ сценарий
    1) берём НЕвалидный Email
    2) устанавливаю НЕвалидный Email для person
    3) ожидаю результат: Email установлен не будет,
        3.1) значение поля Email у персон не будет равно НЕвалидному Email
        3.2) значение Email у персон останется прежним
    */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        //генерируем логику проверки
        Assertions.assertNotEquals(invalidEmail, person.getEmail()); //
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    //метод, который будет генерировать инвалидные имейлы
    static Stream<String> invalidEmailData() {
        /*
         условия невалидного имейла:
        1) email должен содержать символ @ и только один
        2) email должен содержать символ . и после символа @
        3) в email после последней точки есть 2 и более символа
        4) email содержит алфавит; цифры; -; _; .; @
        5) в email перед символом @ должен быть хотя бы один символ
        6) в email первый символ должен быть буквой
         */
        return Stream.of(
                //генерируем набор параметров проверки
                "test.mail.net",
                "test@@mail.net",
                "test@email@net",
                "test@mailnet",
                "test@mail.n",
                "test@@mail.net.",
                "test@ma il.net.",
                "test!@mail.net.",
                "t#est@mail.net.",
                "test?@mail.net.",
                "@mail.net.",
                "4est@@mail.net.",
                "_est@@mail.net.",
                ".est@@mail.net.",
                ".est+1@mail.net."
        );
    }

    //--------------------------------------Check password-----------------------------------------
    /*
    1) берём валидный password
    2) устанавливаю валидный password для person
    3) ожидаю, что у person теперь валидный password, который мы установили на 2-м шаге
    4) проверяем равентсво person.getPassword с валидным password, который мы установили
    */

    //ВАЛИДНЫЙ сценарий
    @ParameterizedTest
    @ValueSource(strings = {"qwerty2Q$", "Qwerty2q!"})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        System.out.println("current password -> " + validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());
    }

    //------Сравнение на null
    @Disabled
    @Test
    void assertNull() {
        String string = null;
        Assertions.assertEquals(null, string);
        // такое сравнение должно выдать ошибку, но при jupiter5
        // этот тест ошибочно проходит
    }

    /*
    НЕВАЛИДНЫЙ сценарий
    1) берём НЕвалидный password (получаем из отдельного метода)
    2) устанавливаю НЕвалидный password для person
    3) ожидаю результат: password установлен не будет,
        3.1) значение поля password у персон не будет равно НЕвалидному password
        3.2) значение имейл у персон останется прежним
    */

    @ParameterizedTest
    @MethodSource("InvalidPasswordData")
    void testinvalidPasswordSet(String invalidPassword) {
        //генерируем логику проверки
        person.setPassword(invalidPassword);
        Assertions.assertNotEquals(invalidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> InvalidPasswordData() {
        /*
        условия валидного пароля:
        1) длина >=8
        2) должна быть мин 1 цифра
        3) должна быть мин 1 маленькая буква
        4) должна быть мин 1 большая буква
        5) должен быть мин 1 спецсимвол из набора: ! @ % $ * () [] . ? _
         */
        return Stream.of(
                //генерируем набор параметров проверки
                "qwerty1",
                "qwertyQ$",
                "QWERTY1Q$",
                "qwerty1q$",
                "qwerty1Q"
        );
    }


}
