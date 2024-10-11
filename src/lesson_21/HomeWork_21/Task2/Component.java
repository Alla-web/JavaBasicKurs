package lesson_21.HomeWork_21.Task2;

public class Component {

    private String brand;
    private String model;

    //constructors
    public Component() {

    }

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
      return String.format("Components model: %s from brand: %s", model, brand);
    }
}
