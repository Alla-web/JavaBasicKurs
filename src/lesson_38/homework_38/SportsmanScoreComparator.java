package lesson_38.homework_38;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman sp1, Sportsman sp2) {
        return sp1.getScore()-sp2.getScore();
    }
}
