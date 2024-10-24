package lesson_31.homeWork_31;

public class SeasonsApp {
    public static void main(String[] args) {

        for (Season season : Season.values()){
            System.out.println(season + ": average temperature = " + season.getAverageTemperature());
        }
    }
}
