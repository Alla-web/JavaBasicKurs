package lesson_47.homeWork_47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    /*
    У вас есть строка: "15-12-2022 20-46".
Используя возможности Java Time API, выполните следующие действия:
Распарсите данную строку в объект LocalDateTime.
После успешного парсинга выведите отдельно:
Месяц
День
Час
     */
    public static void main(String[] args) {
    /*
        / - разделители - могут быть любые
            'hello' - если хотим слово написать между датой и временем
        у - год
        М - месяц
        d - день
        Н - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг а для отображение AM/PM
        m - минута
        s - секунда
    */
        String dateStr = "22-02-22 05:16";
        System.out.println("dateStr -> " + dateStr);

        //преобразовуем тип String в тип LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");

        LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);
        System.out.println("dateTime -> "+dateTime);
        System.out.println(dateTime.getDayOfMonth() + "." +dateTime.getMonth() + "."+dateTime.getYear()+" "+dateTime.getDayOfWeek()+" "+dateTime.getHour()+":"+dateTime.getMinute());



    }
}
