package lesson_21.HomeWork_21.Task2;

public class Processor extends Component {

    private int numberOfCores;

    // constructor
    public Processor(String brand, String model, int numberOfCores) {
        super(brand, model);
        this.numberOfCores = numberOfCores;
    }

    // getters
    public int getNumberOfCores() {
        return numberOfCores;
    }

    //setters
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    //methods
    public String toString() {
        return String.format("Processor model: %s from brand: %s, number of cores: %d\n",
                getModel(), getBrand(), numberOfCores);
    }


}
