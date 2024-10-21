package lesson_27.checkPerson;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("email", "password");
        System.out.println(person);
        /*
        1) email должен содержать символ @ и только один
        2) email должен содержать символ . и после символа @
        3) в email после последней точки есть 2 и более символа
        4) email содержит алфавит; цифры; -; _; .; @
        5) в email перед символом @ должен быть хотя бы один символ
        6) в email первый символ должен быть буквой
         */
        person.setEmail("test@gmail.com");
        System.out.println(person.getEmail());

        person.setEmail("a1@email.de");
        System.out.println(person.getEmail());

        System.out.println("--------------------------Email-----------------------------------");
        // отправляем невалидные имейлы и проверяем установит ли наша программа эти имэйлы
        person.setEmail("a1@ema@il.de");
        System.out.println(person.getEmail());

        person.setEmail("a1@il.d.e");
        System.out.println(person.getEmail());

        person.setEmail("a1@il.d.e");
        System.out.println(person.getEmail());

        System.out.println("--------------------------Password-----------------------------------");
        /*
        1) длина >=8
        2) должна быть мин 1 цифра
        3) должна быть мин 1 маленькая буква
        4) должна быть мин 1 большая буква
        5) должен быть мин 1 спецсимвол из набора: ! @ % $ * () [] . ? _
         */
        person.setPassword("cQ1%dfa"); // длина меньше 8
        System.out.println();
        person.setPassword("cQ1%dfa_"); // валидный пароль
        System.out.println(person.getPassword());
        System.out.println("\n ================== ");
        person.setPassword("cQ1%dfar"); // валидный
        System.out.println(person.getPassword());

        person.setPassword("cQ1%dfa?"); // валидный
        System.out.println(person.getPassword());

        person.setPassword("cQ12dfa?"); // валидный
        System.out.println(person.getPassword());

        person.setPassword("cQ12dfa@паыпрыкры"); // валидный
        System.out.println(person.getPassword());

        /*
        System.out.println("-----------------------Character-------------------------");
        System.out.println("isLetter('f') -> " + Character.isLetter('f'));
        System.out.println("isDigit('5') -> " + Character.isDigit('5'));
        System.out.println("isLetterOrDigit('-') -> " + Character.isLetterOrDigit('-'));
        System.out.println("isWhitespace(' ') -> " + Character.isWhitespace(' '));
        System.out.println("isUpperCase('F') -> " + Character.isUpperCase('F'));
        System.out.println("isLowerCase('A') -> " + Character.isLowerCase('A'));
        System.out.println("toUpperCase('a') -> " + Character.toUpperCase('a'));
        System.out.println("toLowerCase('F') - > " + Character.toLowerCase('F'));
        Character.isAlphabetic('c');
        //возвращает true, если символ буква

         */


    }

}
