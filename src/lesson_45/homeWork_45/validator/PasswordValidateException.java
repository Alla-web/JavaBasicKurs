package lesson_45.homeWork_45.validator;

public class PasswordValidateException extends Exception{

   //конструктор
    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }
}
