package lesson_29.persons;

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

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) { // проверяет валидность имейла
            this.email = email;
        }
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

        // ВАЖНО!!! Здесь мы проверяем негативные сценарии - если ... значит false
        // нельзя сразу возвращать true, потому что в этом случае все остальные
        // условия после true не будут проверяться

        if (email == null || email.isEmpty()) {
            return false;
        }

        // 1) email должен содержать символ @ и только один
        // находими индекс первого символа @ в строке
        int indexAt = email.indexOf('@');
        // находим последний индекс последнего символа @ в строке
        //int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2) email должен содержать символ . и после символа @
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3) в email после последней точки есть 2 и более символа
        int indexLastDot = email.lastIndexOf('.');
        if (indexLastDot == -1 || indexLastDot == email.length() - 1) return false;
        if ((email.length() - 1 - indexLastDot) < 2) return false;

        //  4) email содержит алфавит; цифры; -; _; .; @
        // берём каждый символ и проверяем, что он не явл-ся запещённым
        //если нахожу не подходящий - возвращаю false
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@')) {
                /*
            Равнозначные выражения.
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != '-' && ch != '_' && ch != '.' && ch != '@') return false;
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@')) return false;
             */
                return false;
            }
        }

        // 5) в email перед символом @ должен быть хотя бы один символ
        // если индекс @ стоит первым (индекс 0) - значит перед ним нет никого
        if (indexAt == 0) return false;

        // 6) в email первый символ должен быть буквой
        char firstChar = email.charAt(0);
        if (!Character.isLetter(firstChar)) return false;

        //если все проверки пройдены - возвращаем true (email подходит)
        return true;
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

        // ВАЖНО!!! Должны все условия выполняться одновременно
        // значит

        // 1) длина >=8
        boolean passwordLength = false;
        if (password == null || password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return passwordLength = false;
        }


        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        String symbols = "!@%$*()[].?_";

        // 2) должна быть мин 1 цифра
        // Перебираю символы
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
            // if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;
        }
        System.out.printf("(Digit) %s | (LowerCase) %s | (UpperCase) %s | (SpSymbol) %s\n", isDigit, isLowerCase, isUpperCase, isSpecialSymbol);
        // Если хотя бы в одной переменной останется значение false, то весь пароль НЕ будет признан валидным = (признан не валидным)
        return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;

    }


}
