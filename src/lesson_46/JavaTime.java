package lesson_46;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaTime {
    public static void main(String[] args) {
    /*
    util.Date, + util.Calender + text.SimpleDateFormat - неудобные устаревшие
    Joda-Time - выкупли

    java.time Java Time Api - золотой стандарт сейчас
     */
        System.out.println("-----------------------LocalDate----------------------");
        //LocalDate - представляет дату (год, месяц, день) без времени и часового пояса
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println("-----------------------plusDays()----------------------");
        //прибавить 1 день к моей дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow -> " + tomorrow);

        //объект LocalDate неизменяемы. Метод plusDays() не изменяет объект,
        // на котором он вызван
        System.out.println("date -> " + date);

        //как и строка
        String text = "String init";
        String anotherString = text.toLowerCase();
        System.out.println(anotherString);
        // text остался неизменным
        System.out.println("text -> " + text);

        System.out.println("-----------------------plusWeeks()----------------------");
        System.out.println("date.plusWeeks() ->" + date.plusWeeks(4));

        System.out.println("-----------------------minusDay()----------------------");
        System.out.println("yesterday -> " + date.minusDays(1));

        System.out.println("-----------------------установить дату----------------------");
        LocalDate date1 = LocalDate.of(2002, 2, 15);
        System.out.println("date1 -> " + date1);

        System.out.println("-----------------------Enum с месяцами----------------------");
        //можно использовать Enum с месяцами
        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println(date2);

        System.out.println("-----------------------getters----------------------");
        System.out.println("year: " + date2.getYear());
        System.out.println("month: " + date2.getMonth()); // в формате Enum
        System.out.println("month: " + date2.getMonthValue()); // в формате цифра
        System.out.println("число: " + date2.getDayOfMonth()); // число даты
        System.out.println("day of week: " + date2.getDayOfWeek()); //номер недели
        System.out.println("day of year: " + date2.getDayOfYear()); //номер года

        DayOfWeek dayOfWeek = date2.getDayOfWeek();
        System.out.println("номер дня недели: " + dayOfWeek.getValue()); // номер дня в неделе

        System.out.println("дней в году: " + date2.lengthOfYear()); //кол-во дней в году
        System.out.println("дней в месяце: " + date2.lengthOfMonth()); //кол-во дней в месяце

        System.out.println("-----------------------Формат строки ISO-8601----------------------");
        String dateString = "2000-10-25"; //Формат даты строки ISO-8601 (год, месяц, число, разделитель тире)
        LocalDate date3 = LocalDate.parse(dateString);
        System.out.println(date3.getDayOfMonth() + ": " + date3.getYear() + ": " + date3.getDayOfWeek());

        System.out.println("=============================LocalTime=====================================");
        //LocalTime - представляет время (часы, минуты, секунды, наносекунды)

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime.now() -> " + time);

        //передаём время, а секунды будут установлены в нули
        LocalTime time1 = LocalTime.of(22, 33);
        System.out.println("LocalTime.of(22,33) -> " + time1);

        time1 = LocalTime.of(22, 33, 55);
        System.out.println("LocalTime.of(22,33,55) -> " + time1);

        System.out.println("--------------------------------plus...--------------------------------------");
        System.out.println("new time(+1 hour) -> " + time1.plusHours(1)); // плюс 1 час
        System.out.println("new time(+65 minutes) -> " + time1.plusMinutes(65)); // плюс 65 минут
        System.out.println("new time(+30 soconds) -> " + time1.plusSeconds(30)); // плюс 30 секунд

        System.out.println("--------------------------------getters--------------------------------------");
        System.out.println("time1.getHour() -> " + time.getHour());
        System.out.println("time1.getMinute() -> " + time.getMinute());
        System.out.println("time1.getSecond() -> " + time.getSecond());
        System.out.println("time1.getNano() -> " + time.getNano());

        System.out.println("--------------------------------String timeStr--------------------------------------");
        String timeStr = "12:13:46";
        //Формат времени строки ISO-9601 ("2001-01-14T08:15:45+01.00")
        LocalTime parseTime = LocalTime.parse(timeStr);
        System.out.println(parseTime + ": " + parseTime.getMinute());

        System.out.println("--------------------------------LocalDateTime--------------------------------------");
        //объединение классов LocalDate и Time
        //LocalDateTime - дата и время без учёта часового пояса
        LocalDateTime localDateTime = LocalDateTime.now();//текущее время и дата
        System.out.println("localDateTime -> " + localDateTime);

        LocalDate localDate = LocalDate.of(2011, Month.FEBRUARY, 15);
        LocalTime localTime = LocalTime.of(15, 31, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime -> " + dateTime);

        dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());

        //в LocalDateTime есть все методы от LocalDate и LocalTime
        System.out.println(dateTime.plusHours(1));
        System.out.println(dateTime.minusHours(1));

        System.out.println("--------------------------ZonedDateTime-------------------------------------");
        //ZonedDateTime - представляет дату и время в часоввым поясом
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("------------------methods: isAfter, isBefore, until, equals---------------------------");
        LocalDate date4 = LocalDate.of(2000, 10, 5);
        LocalDate date5 = LocalDate.of(2000, 9, 25);

        //isAfter, isBefore, until, equals - есть у всех объектов, представляющих дату или время

        //isAfter - проверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date4.isAfter(date5);
        System.out.println("date4.isAfter(date5) -> " + isAfter);

        //isBefore - проверяет, что текущий объект до (раньше) указанного объекта
        boolean isBefore = date4.isBefore(date5);
        System.out.println("date4.isBefore(date5) -> " + isBefore);

        //equals - проверяет объекты даты или времени на равенство
        System.out.println("date4.equals(date5) ->" + date4.equals(date5));

        //until - измеряет время, между текущим и указанным оюъектавми дати или времени
        //и мы можем выбрать в каких единицах измерять разницу
        //возвращает он long

        long daysBetween = date4.until(date5, ChronoUnit.DAYS);
        //сколько дней между date4 и date5
        System.out.println("date4.until(date5, ChronoUnit.DAYS) -> " + daysBetween);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plusDays(15);
        System.out.println("dateTime2.until(dateTime1, ChronoUnit.SECONDS) -> " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        System.out.println("-------------------------универсальные методы МИНУС/ПЛЮС-------------------------------");
        //применяются ко всем объектам даты и времени
        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.MINUTES);
        LocalDateTime dateTime4 = dateTime1.plus(5, ChronoUnit.YEARS);

        //метод between есть у каждого ChronoUnit
        //если мне нужно узнать количесвто дней между датами:
        long daysBetween2 = ChronoUnit.DAYS.between(dateTime3, dateTime4);
        System.out.println("ChronoUnit.DAYS.between(dateTime3, dateTime4); -> " + daysBetween2);
        System.out.println("ChronoUnit.HOURS.between(dateTime3, dateTime4)" + ChronoUnit.HOURS.between(dateTime3, dateTime4));

        System.out.println("----------------------Duration, Instant, Period------------------------------");
        /*
        Duration - представляет продолжительность в секундах и наносекундах между инстантами
        Instant - сколько прошло (времени) наносекунд с 1 января 1970 UTC

        Period - представляет период времени в годах, месяцах и днях между двумя объектами даты
         */

        System.out.println("--------------------------------DateTimeFormatter--------------------------------------");
        //DateTimeFormatter - отвечает за форматирование даты и времени

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //хочу получить строку в нужном мне виде
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy | HH:mm:ss ");
        String formattedDate = now.format(formatter);
        System.out.println("now.format(formatter) -> " + formattedDate);


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


    }


}
