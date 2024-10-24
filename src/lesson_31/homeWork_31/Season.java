package lesson_31.homeWork_31;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.
 */
public enum Season {
    SPRING(14.5),
    SUMMER(23.8),
    AUTUMN(18.0),
    WINTER(-26.1);

    private double averageTemperature;

   //constructor
    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    //getters
    public double getAverageTemperature() {
        return averageTemperature;
    }

}
