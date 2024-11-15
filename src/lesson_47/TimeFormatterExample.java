package lesson_47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatterExample {
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

        Количесвто повторений символа определяет формат:
        -------------------------------
        уу - получу год в двузначном фомате - 24 для 2024 года
        уууу - 2024 для 2024 года
        -------------------------------
        М - месяц "2" или "12"
        ММ - месяц "02" или "12"
        -------------------------------
        d - день в фомате 3 или 29
        dd - день в формате 03 или 29
        -------------------------------
        m - токже
        mm
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //меняем формат даты
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy | HH:mm:ss");
        String strDate = now.format(formatter);
        System.out.println("strDate ->" + strDate);

        //У нас есть String с датой и временем в каком-то формате
        //И нам нужно из этой строки получить объект даты-уремени

        String dateStrParse = "24-10-05 16:58"; // 24 - year, 05 - number
        System.out.println(dateStrParse);
        //мы не можем из строки вытащить год,
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateStrParse, formatter1);
        System.out.println("parseDate -> " + parseDate);
        System.out.println(parseDate.getDayOfWeek() +" | " + parseDate.getHour()+" | " + parseDate.getMinute());


    }
}
