package lesson_27;

/*
авторизавция на сайте через имейл и пароль
 */
public class Person {

    private String email;
    private String password;

    //constructor
    public Person(String email, String password) {
        setEmail(email); // поменяли на вызов сэттера
        this.password = password;
    }

    //getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) { // проверяет валидность имейла
            this.email = email;
        }
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //methods
    @Override
    public String toString() {
        return "Person{" +
                " email = '" + email + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }

    //
    private boolean isEmailValid(String email) {
        /*
        test_1@gmail.com - пример нормального имейла
            схема проверки:
        1) должен содержать символ @ и только один
        2) должен содержать символ . и после символа @
        3) после последней точки есть 2 и более символа
        4) содержит алфавит; цифры; -; _; .; @
        5) перед символом @ должен быть хотя бы один символ
        6) первый символ должен быть буквой
         */

        // 1) должен содержать символ @ и только один
        int indexAt = email.indexOf('@');
        //int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2) должен содержать символ . и после символа @
        int dotIndexAfterAt = email.indexOf('@', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;





        Character.isAlphabetic('c');
        //возвращает true, если символ буква
Character.isDigit(1);
        //возвращает true, если символ цифра
        Character.isLetter('D');
        Character.isLetterOrDigit('-');





        return true;
    }

/*
1) длина >=8
2) должна быть мин 1 цифра
3) должна быть мин 1 маленькая буква
4) должна быть мин 1 большая буква
5) должен быть мин 1 спецсимвол из набора: ! @ % $ * () [] . ? _

создать 5 boolean-переменных и каждая отвечает за свой пункт,
пароль будет подходить, только если все 5 true
return b1 && b2 && b3 && b4 && b5;

 */
}
