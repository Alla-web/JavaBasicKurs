package lesson_45.homeWork_45.validator;

public class EmailValidateException extends Exception {

    /*
    если я хочу создать исключение/ошибку
    достаточно унаследоваться от одного из 2-х классов:
        1) проверяемое исключение - Exception
        2) непроверяемое - RunTimeException

    Переопределяем неск-ко методов:
       - конструктор, выдающий строку
        - getMesseg() - возвращает строку с коротким сообщение
     */

    //конструктор
    public EmailValidateException(String message) {
        super(message);
    }

    //переопрелённый метод getMessage()
    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
