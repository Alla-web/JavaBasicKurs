package lesson_38.homework_38.Task1;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsmans> {
    @Override
    public int compare(Sportsmans sp1, Sportsmans sp2) {
        return Double.compare(sp1.getScore(), sp2.getScore());
    }
}
