package lesson_19.HomeWork_19;
/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
•	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
 */
public class Task4 {

    public static void main(String[] args) {

        String myMessage = "Good Morning!";
        printMessage(myMessage);

        printMessage("Hello!");

        System.out.println("myMessage after call printMessage -> " + myMessage);

    } // main area

    public static void printMessage(String message) {
        System.out.println(message);
        message = "Hello World!"; // ошибка
        System.out.println(message);
    }

    public static void printMessage2(final String message) {
        System.out.println(message);
        // ошибка - нельзя изменить значение инициализированной константной переменной
        //message = "Hello World!";
        System.out.println(message);
    }

} // class area
