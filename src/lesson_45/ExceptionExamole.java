package lesson_45;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExamole {
    public static void main(String[] args) {
/*
ОШИБКИ КОМПИЛЯЦИИ - возникают на этапе компиляции программы
    видны сразу на этапе написания кода
 */
        //int a = "Java";
        //String str = "Java"

/*
ОШИБКИ ВРЕМЕНИ ВЫПОЛНЕНИЯ (runtime) - во время выполнения программы
    после её компиляции
    Exception (исключение) - события/ошибки, которые могут возникнуть во время выполнения программы
    и нарушают её нормальное выполнение
*/
        // System.out.println(1 / 0); //java.lang.ArithmeticException - ошибка вычисления

        /*
        int[] ints = {1, 2, 3};
        java.lang.ArrayIndexOutOfBoundsException - нет 11 эл-та в массиве
        ints[10] =100;
        */

        int[] numbers = {1, 2, 3,};

        int result;

        try {
            numbers[1] = 1000;
            String s = "null";
            result = 1 / 1;
            s.length();
            System.out.println(1 / 0);
            System.out.println("Код в блоке try");

        } catch (NullPointerException npe) {
            System.out.println("NPE catched");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException catched: " + exception.getMessage());
            System.out.println(exception.getClass());
        } catch (Exception exception) {
            System.out.println("Какая-то ошибка " + exception.getMessage());
            System.out.println(exception.getClass());
            System.out.println(exception.toString());
        } finally {
            //этот код выполнится в любом случае, независимо от try и catch
            System.out.println("Finally code");
            result = 0;
        }

        System.out.println("Code after mistake");

        System.out.println(getUrlString());

        System.out.println("---------------------throws---------------------------------");

        //и теперь мы должны здесь обработать исключение/ошибку
        String url1 = null;
        try {
            url1 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(url1);

    }
    /*
        МЕХАНИЗМ ОБРАБОТКИ проверяемых ИСКЛЮЧЕНИЙ/ОШИБОК:
        try {
            код, который может вызвать исключения/ошибку
        } cath(ExceptionType ex) {
            код обработки исключения/ошибки
        } finaly { - не обязательный блок, можно и без него
            код, который будет выполнен в любом случае,
            или после try, или после cath
        }

          Джава требует, чтобы во всех случаях возникноваения проверяемых
          ошибок они были обработаны при помощи try cath
         */

    private static String getUrlString() {
        URL myUrl = null;
        String defaultUrl = "https://google.com";
        try {
            //выдаёт ошибку ссылки и мы её обрабатываем через try cath
            myUrl = new URL("htps://google.com");
            //если у нас ошибка возникла в строке(н-р 49), дальнейший код не выполняется
            System.out.println("Next line code");
        } catch (MalformedURLException exception) {
            System.out.println("Неверный формат URL: " + exception.getMessage());
            System.out.println(exception.toString());
            System.out.println("-------------------------");
            //exception.printStackTrace();
            /*
            getMasseg() - вовзращает строку с коротким описанием исключения
            toString() - строковое представление исключения
            printStackTrace() - выводит трассировку исключения - то, что мы видим в панели
            */
        } finally {
            if (myUrl == null) {
                try {
                    myUrl = new URL(defaultUrl);
                } catch (MalformedURLException e) {
                    System.out.println(e.getMessage());
                    ;
                }
            }
        }

        return myUrl.toString();

        //вывод без части finally
        //return myUrl == null ? "null" : myUrl.toString();
    }

    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = null;
        String defaultString = "https://google.com";

        myUrl = new URL(defaultString);
        myUrl = new URL("https://google.com");

        //компилятор подсказывает, что есть вероятность возникновения ошибки и его нужно обработать
        //но мы можем это проигнорировать и передать на решение тому, кто принимает значение из этого метода
        //для этого используем ключевое слово throws (указываем что наш метод может выбросить ошибку)
        //в сигнатуру метода
        return myUrl.toString();
    }

}
