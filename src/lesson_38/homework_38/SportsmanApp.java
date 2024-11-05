package lesson_38.homework_38;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[6];

        sportsmen[0]=new Sportsman("John", 35, 1);
        sportsmen[1]=new Sportsman("John", 35, 2);
        sportsmen[2]=new Sportsman("Max", 19, 3);
        sportsmen[3]=new Sportsman("tom", 29, 3);
        sportsmen[4]=new Sportsman("Nataly", 20, 1);
        sportsmen[5]=new Sportsman("mary", 30, 1);

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
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sp1, Sportsman sp2) {
                return sp1.getScore()-sp2.getScore();
            }
        });
        System.out.println("Сортировка по AGE в естественном порядке:");
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("-------------------Lambda expressions---------------------------");
        //сортируем по возрасту и рейтингу
        Arrays.sort(sportsmen, (sp1, sp2) -> {
          int compareAge = sp1.getAge()-sp2.getAge();
          if(compareAge==0) {
              //значит ages равны и сортируем по score
              return sp1.getScore() - sp2.getScore();
          } else {
              return compareAge;
          }
        });
        System.out.println("Сортировка по AGE, а потом по SCORE в естественном порядке:");
        System.out.println(Arrays.toString(sportsmen));
    }
}
