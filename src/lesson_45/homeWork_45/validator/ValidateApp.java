package lesson_45.homeWork_45.validator;

public class ValidateApp {
    public static void main(String[] args) {

        //получаем емаил от пользователя (сканером, из другого слоя приложения)
        String email = "test@email.com";
        String password = "qwerty1Q$";

        //валидация емейла
        try {
            EmailValidator.isEmailValid(email);
            /*
            если в результате равботы метода мы дойдём до этой строчки кода,
            значит email валидный
             */
            System.out.println("Email is valid");
        } catch (EmailValidateException exception) {
            //email не прошел проверку
            //запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = exception.getMessage();
            System.out.println(message);
        }

        //валидация пароля
        try {
            PasswordValidator.isPasswordValid(password);
            /*
            если в результате равботы метода мы дойдём до этой строчки кода,
            значит email валидный
             */
            System.out.println("Password is valid");
        } catch (PasswordValidateException exception) {
            //пораль не прошёл проверку
            //запросить у пользователя новый апроль
            System.out.println("Password is not valid");
            //String massage = exception.getMessage();
            System.out.println(exception.getMessage());
        }
    }


}
