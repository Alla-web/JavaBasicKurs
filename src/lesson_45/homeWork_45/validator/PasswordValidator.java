package lesson_45.homeWork_45.validator;

public class PasswordValidator {

    //добавляем в сигнатуру метода проверки throws EmailValidateException
    //throw - ключевое слово для явного выброса исключения (создания исключения)

    public static void isPasswordValid(String password) throws PasswordValidateException{

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

        //Проверки негативных сценариев
        //содержит ли цифры?
        if(!isDigit){
            throw new PasswordValidateException("Password must contain at least one digit");
        }

        //содержит ли буквы верхнего регистра?
        if(!isUpperCase){
           throw new PasswordValidateException("Password must contain at least one uppercase letter");
        }

        //содержит ли буквы нижнего регистра?
        if(!isLowerCase){
            throw new PasswordValidateException("Password must contain at least one lowercase letter");
        }

        //содержит ли спецсимволы?
        if(!isSpecialSymbol){
            throw new PasswordValidateException("Password must contain at least one special symbol:  ! @ % $ * () [] . ? _");
        }

        //System.out.printf("(Digit) %s | (LowerCase) %s | (UpperCase) %s | (SpSymbol) %s\n", isDigit, isLowerCase, isUpperCase, isSpecialSymbol);
        // Если хотя бы в одной переменной останется значение false, то весь пароль НЕ будет признан валидным = (признан не валидным)
        //return isDigit && isUpperCase && isLowerCase && isSpecialSymbol;
    }

}
