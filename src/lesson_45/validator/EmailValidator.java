package lesson_45.validator;

public class EmailValidator {

    //throw - ключевое слово для явного выброса исключения (создания исключения)

    public static void isEmailValid(String email) throws EmailValidateException{
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

}
