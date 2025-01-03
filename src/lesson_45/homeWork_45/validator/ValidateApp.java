package lesson_45.homeWork_45.validator;

public class ValidateApp {
    public static void main(String[] args) {

        //получаем емаил от пользователя (сканером, из другого слоя приложения)
        String email = "test@email.com";
        String password = "12345678";
        // qwerty1Q$

        //обычно прверка происходит отдельно для емейла и паролы
        //но мы сделаем всё в одном

        try {
            UserValidator.isEmailValid(email);
            /*
            если в результате равботы метода мы дойдём до этой строчки кода,
            значит email валидный
             */
            System.out.println("Email is valid");

            //если EMAIL прошёл -> проверяем пароль

            //Базовая валидация
            //UserValidator.isPasswordValid(password);

            //Валидация с более точными сообщениями об ошибках
            UserValidator2.isPasswordValid(password);
            /*
            если в результате равботы метода мы дойдём до этой строчки кода,
            значит email валидный
             */
            System.out.println("Password is valid");

            // Можем создать пользователя, с проверенным email и паролем
            // User user = new User(email, password)
            //service.createUser(email, password);
        } catch (EmailValidateException exception) {
            //email не прошел проверку
            //запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = exception.getMessage();
            System.out.println(message);
        } catch (PasswordValidateException exception){
            //пораль не прошёл проверку
            //запросить у пользователя новый апроль
            System.out.println("Password is not valid");
            System.out.println(exception.getMessage());
        }


//        //валидация пароля
//        try {
//            UserValidator.isPasswordValid(password);
//            /*
//            если в результате равботы метода мы дойдём до этой строчки кода,
//            значит email валидный
//             */
//            System.out.println("Password is valid");
//        } catch (PasswordValidateException exception) {
//            //пораль не прошёл проверку
//            //запросить у пользователя новый апроль
//            System.out.println("Password is not valid");
//            //String massage = exception.getMessage();
//            System.out.println(exception.getMessage());
//        }


    }


}
