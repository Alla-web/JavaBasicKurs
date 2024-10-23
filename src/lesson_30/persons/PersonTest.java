package lesson_30.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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
    2) устанавливаю Невалидный Email для person
    3) ожидаю результат: Email установлен не будет,
        3.1)значение поля пароль у персон не будет равно невалидному имейлу
        3.2) значение имейл у персон останется прежним
    */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testinvalidEmailSet(String invalidEmail) {
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


}
