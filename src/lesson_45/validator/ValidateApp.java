package lesson_45.validator;

public class ValidateApp {
    public static void main(String[] args) {

        //получаем емаил от пользователя (сканером, из другого слоя приложения)
        String email = "test@email.com";

        //валидация емейла
        try {
            EmailValidator.isEmailValid(email);
            /*
            если в результате равботы метода мы дойдём до этой строчки кода,
            значит email валидный
             */
            System.out.println("Email is valid");
        } catch (EmailValidateException e) {
            //email не прошел проверку
            //запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        }

    }

}
