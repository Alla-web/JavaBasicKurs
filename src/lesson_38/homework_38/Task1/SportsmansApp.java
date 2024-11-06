package lesson_38.homework_38.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmansApp {
    public static void main(String[] args) {
        Sportsmans[] sportsmen = new Sportsmans[6];

        sportsmen[0]=new Sportsmans("John", 35, 1.2);
        sportsmen[1]=new Sportsmans("John", 35, 2.9);
        sportsmen[2]=new Sportsmans("Max", 19, 3.6);
        sportsmen[3]=new Sportsmans("tom", 29, 3.8);
        sportsmen[4]=new Sportsmans("Nataly", 20, -1_400_000_000.0);
        sportsmen[5]=new Sportsmans("mary", 30, -1_800_000_000.0);

        System.out.println("-------------------implemented Comparable-----------------------");
        Arrays.sort(sportsmen);
        System.out.println("Сортировка по NAME в естественном порядке:");
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("----------------class SportsmanScoreComparator--------------------");
        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmen, sportsmanScoreComparator);
        System.out.println("Сортировка по SCORE в естественном порядке:");
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("---------------------Anonymous class------------------------");
        //сортируем машины по МОДЕЛИ без создания отдельного класаса Comparator,
        // используем аннонимный класс (мы не знаем его названия) "на лету"

        //сортируем по возрасту
        Arrays.sort(sportsmen, new Comparator<Sportsmans>() {
            @Override
            public int compare(Sportsmans sp1, Sportsmans sp2) {
                return Double.compare(sp1.getScore(), sp2.getScore());
            }
        });
        System.out.println("Сортировка по AGE в естественном порядке:");
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("-------------------Lambda expressions---------------------------");
        //сортируем по возрасту и рейтингу
        Arrays.sort(sportsmen, (sp1, sp2) -> {
          int compareAge = Integer.compare(sp1.getAge(), sp2.getAge());
            //чтобы не было переполнения или ошибок из-за неверных данных (минусовых напрмер)
            if(compareAge==0) {
              //значит ages равны и сортируем по score
              return Double.compare(sp1.getScore(), sp2.getScore());
          } else {
              return compareAge;
          }
        });
        System.out.println("Сортировка по AGE, а потом по SCORE в естественном порядке:");
        System.out.println(Arrays.toString(sportsmen));
    }
}
