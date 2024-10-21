package lesson_27;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);

        System.out.println("-----------------------Character-------------------------");
        /*
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

        System.out.println("person.getEmail().isEmpty() -> " + person.getEmail().isEmpty());

        System.out.println("-----------------------isEmailValid-------------------------");
        Person person1 =



    }

}
