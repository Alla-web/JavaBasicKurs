package lesson_21.HomeWork_21.Task2;

public class Computer {

    //-------------------------------------------------------------------------------------
    private Processor processor;
    private Memory memory;
    private Storage storage;
    //-------------------------------------------------------------------------------------

    private String manufacturer;
    private String operatingSystem;
    private double price;

    // constructor
    public Computer(Storage storage, String manufacturer, String operatingSystem, double price) {
        this.storage = storage;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.price = price;

        // связь в формате КОМПОЗИЦИЯ - "жёсткая" неразрывная связь
        this.processor = new Processor("ADS", "A-123", 4);
        this.memory = new Memory("ADS", "B-123", 250);
    }

    //getters
    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    //setters


    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    //methods



}
