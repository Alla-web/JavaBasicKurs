package lesson_45.homeWork_45.validator;

public class UserValidator2 {

    //добавляем в сигнатуру метода throws EmailValidateException
    //throw - ключевое слово для явного выброса исключения (создания исключения)

    public static void isEmailValid(String email) throws EmailValidateException {
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
            throw new EmailValidateException("null or empty email");
        }

        // 1) email должен содержать символ @ и только один
        // находими индекс первого символа @ в строке
        int indexAt = email.indexOf('@');
        // находим последний индекс последнего символа @ в строке
        //int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2) email должен содержать символ . и после символа @
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // 3) в email после последней точки есть 2 и более символа
        int indexLastDot = email.lastIndexOf('.');
        if (indexLastDot == -1 || indexLastDot == email.length() - 1) throw new EmailValidateException("error");
        if ((email.length() - 1 - indexLastDot) < 2) throw new EmailValidateException("last . error");

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
                throw new EmailValidateException("illegal symbol");
            }
        }

        // 5) в email перед символом @ должен быть хотя бы один символ
        // если индекс @ стоит первым (индекс 0) - значит перед ним нет никого
        if (indexAt == 0) throw new EmailValidateException("before first @ error");

        // 6) в email первый символ должен быть буквой
        char firstChar = email.charAt(0);
        if (!Character.isLetter(firstChar)) throw new EmailValidateException("first symbol should by alphabetic");

        //если все проверки пройдены - возвращаем true (email подходит)
        //return true; - теперь нам не нужен
        //и тип возвращаемого значения boolean меняем на void
    }


    public static void isPasswordValid(String password) throws PasswordValidateException {

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
            //System.out.println("Password should be at least 8 characters");
            throw new PasswordValidateException("Password should be at least 8 characters");
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
        //увидим, почему имейл не прошёл проверку
        System.out.printf("(Digit) %s | (LowerCase) %s | (UpperCase) %s | (SpSymbol) %s\n", isDigit, isLowerCase, isUpperCase, isSpecialSymbol);

        String errorMessage = "Errors! Password must contain at least one ";
        int initLength = errorMessage.length();

        // errorMessage += "Dtr"; // -> errorMessage = errorMessage + "Dtr;"
        //  int x = 10;
        // x -= 5; // x = x - 5;

        //Проверки негативных сценариев
        //содержит ли цифры?
        if (!isDigit) { //если isDigit всё ещё false
            errorMessage += "digit; ";
        }

        //содержит ли буквы верхнего регистра?
        if (!isUpperCase) { //если isUpperCase всё ещё false
            errorMessage += "uppercase letter; ";
        }

        //содержит ли буквы нижнего регистра?
        if (!isLowerCase) { //если isLowerCase всё ещё false
            errorMessage += "lowercase letter; ";
        }

        //содержит ли спецсимволы?
        if (!isSpecialSymbol) { //если isSpecialSymbol всё ещё false
            errorMessage += "special symbol:  ! @ % $ * () [] . ? _; ";
        }

        //прояверяем, нужно ли мне бросить сообщение
        //Несколько вариантов проверить - прошёл ли пароль валидацию
        //if (errorMessage.length() > initLength) throw new PasswordValidateException(errorMessage);

        //проверяем, что если хотя бы в одной из переменных содержится false, то пароль не прошёл валидацию и бросаем валидацию
        if (!(isDigit && isUpperCase && isLowerCase && isSpecialSymbol))
            throw new PasswordValidateException(errorMessage);

        // Если хотя бы в одной переменной останется значение false, то весь пароль НЕ будет признан валидным = (признан не валидным)
        //return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;
    }


}
