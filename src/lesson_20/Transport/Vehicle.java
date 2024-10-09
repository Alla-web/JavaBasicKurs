package lesson_20.Transport;

public class Vehicle {

    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    // возвращаем построковое представление
    public String toString() {
        return model + " year of manufacture is " + year;
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop(){
        System.out.println(model + " останавливается");
    }


}// class
