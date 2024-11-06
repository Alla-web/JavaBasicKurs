package consultations.consiltation_16;

public class Car implements Comparable<Car>{

    private String model;
    private int year;
    private int speed;

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model: '" + model + '\'' +
                ", year: " + year +
                ", speed: " + speed +
                '}';
    }


    //----------------------------------------Comparable---------------------------------
    // метод интерфейса Comparable,
    // который мы обязаны реализовать после имплементации интерфейса Comparable

    // Сравнение машин только по году выпуска: меньшей будет считаться машина
    // с меньшим годом выпуска
    @Override
    public int compareTo(Car car1) {
        return this.year - car1.year; //сортируем машины только по году выпуска
        /*
        a vs b
        a < b -> возвращается отрицательное значение (а - b при а большем - будет отрицательное значение)
        a > b -> возвращается положительное значение
        a == b ->  возвращается 0
         */
    }

    //----------------------------------------Comparable---------------------------------

}
