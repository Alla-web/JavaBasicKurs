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
        setPassword(password);
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
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    //methods
    @Override
    public String toString() {
        return "Person{" +
                " email = '" + email + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }

    private boolean isEmailValid(String email) {
        /*
        test_1@gmail.com - пример нормального имейла
            схема проверки:
        1) email должен содержать символ @ и только один
        2) email должен содержать символ . и после символа @
        3) в email после последней точки есть 2 и более символа
        4) email содержит алфавит; цифры; -; _; .; @
        5) в email перед символом @ должен быть хотя бы один символ
        6) в email первый символ должен быть буквой
         */
        if (email != null || !email.isEmpty()) {
            // 1) email должен содержать символ @ и только один
            // находими индекс первого символа @ в строке
            int indexAt = email.indexOf('@');
            // находим последний индекс последнего символа @ в строке
            //int lastAt = email.lastIndexOf('@');
            if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

            // 2) email должен содержать символ . и после символа @
            int dotIndexAfterAt = email.indexOf('@', indexAt + 1);
            if (dotIndexAfterAt == -1) return false;

            // 3) в email после последней точки есть 2 и более символа
            int indexLastDot = email.lastIndexOf('.');
            if (indexLastDot == -1 || indexLastDot == email.length() - 1) return false;
            if ((email.length() - 1 - indexLastDot) >= 2) return true;

            //  4) email содержит алфавит; цифры; -; _; .; @
            // алфавит
            for (int i = 0; i < email.length(); i++) {
                char currentChar = email.charAt(i);
                if (Character.isAlphabetic(currentChar) || Character.isDigit(currentChar) || currentChar == '-' || currentChar == '_' || currentChar == '.' || currentChar == '@') {
                    return true;
                }
            }

            // 5) в email перед символом @ должен быть хотя бы один символ
            if (indexAt > 0) return true;

            // 6) в email первый символ должен быть буквой
            if (Character.isLetter(email.charAt(0))) return true;
        }
        return false;

    }

    private boolean isPasswordValid(String password) {
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
        // 1) длина >=8
        if (password.length() >= 8) return true;

        // 2) должна быть мин 1 цифра
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) return true;
        }

        // 3) должна быть мин 1 маленькая буква
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) return true;
        }

        // 4) должна быть мин 1 большая буква
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) return true;
        }

        // 5) должен быть мин 1 спецсимвол из набора: ! @ % $ * () [] . ? _
        for (int i = 0; i < password.length(); i++) {
            char currentChar2 = password.charAt(i);
            if (currentChar2 == '!' || currentChar2 == '@' || currentChar2 == '%' || currentChar2 == '$' || currentChar2 == '*' || currentChar2 == '(' || currentChar2 == ')' || currentChar2 == '[' || currentChar2 == ']' || currentChar2 == '.' || currentChar2 == '?' || currentChar2 == '_')
                return true;
        }
        return false;
    }


}
