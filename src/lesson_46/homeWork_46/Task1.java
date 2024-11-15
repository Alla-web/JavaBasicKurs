package lesson_46.homeWork_46;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Task1 {
    /*
    Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
     */
    public static void main(String[] args) {

        //получить и распечать текущую дату
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate -> " + currentDate);

        //получить и распечать текущий год, месяц и день
        System.out.println(currentDate.getYear() + ", " + currentDate.getMonth() + ", " + currentDate.getDayOfWeek());

        //Создать дату, например Ваш день рождения и вывести на экран
        LocalDate myBirthDay = LocalDate.of(1983, Month.DECEMBER, 29);
        System.out.println("myBirthDay -> " + myBirthDay);

        //Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2022, Month.FEBRUARY, 22);
        LocalDate date2 = LocalDate.now();
        System.out.println("date1.equals(date2) -> " + date1.equals(date2));

        //Получить и вывести на экран:
        //текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime -> " + currentTime);
        //текущее время + 3 часа
        System.out.println("currentTime.plusHours(3) -> " + currentTime.plusHours(3));

        //Создать дату:
        //которая на неделю позже сегодняшней
        LocalDate dateAfterWeek = LocalDate.now().plusWeeks(1);
        System.out.println("dateAfterWeek -> " + dateAfterWeek);
        //которая была на год раньше сегодняшней используя метод minus
        LocalDate dateBeforeTear = LocalDate.now().minusYears(1);
        System.out.println("dateBeforeTear -> " + dateBeforeTear);
        //которая на год позже сегодняшней
        System.out.println("dateAfterYear -> " + LocalDate.now().plusYears(1));
        //tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("tomorrow.isBefore(yesterday) -> " + tomorrow.isBefore(yesterday));
        System.out.println("tomorrow.isAfter(yesterday) -> " + tomorrow.isAfter(yesterday));


    }


}
