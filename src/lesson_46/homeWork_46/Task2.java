package lesson_46.homeWork_46;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {
    /*
    Написать метод, принимающий список из нескольких дат типа LocalDate
    и возвращающий количество дней между самой ранней и поздней датами в этом списке
     */
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, Month.FEBRUARY, 22);
        LocalDate date2 = LocalDate.of(2023, Month.MARCH, 23);
        LocalDate date3 = LocalDate.now();
        List<LocalDate> dateList = List.of(date1, date2, date3);

        isDifferent(dateList);

    }

    public static long isDifferent(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) return 0;

        LocalDate earliestDate = dates.get(0);
        for (LocalDate date : dates) {
            if (date.isBefore(earliestDate)){
                earliestDate=date;
            }
        }
        System.out.println("earliestDate: " + earliestDate);
        LocalDate latestDate = dates.get(0);
        for (LocalDate date : dates) {
            if (date.isAfter(latestDate)){
                latestDate=date;
            }
        }
        System.out.println("latestDate -> " + latestDate);

        long different = earliestDate.until(latestDate, ChronoUnit.DAYS);
        System.out.println("different -> "+different);
        return different;

    }

}
