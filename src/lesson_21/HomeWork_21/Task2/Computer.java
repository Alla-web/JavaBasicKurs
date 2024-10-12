package lesson_21.HomeWork_21.Task2;
/*

 */
public class Computer {

    //-------------------------------------------------------------------------------------
    private Processor processor; // связь в формате КОМПОЗИЦИЯ - "жёсткая" неразрывная связь
    private Memory memory; // связь в формате КОМПОЗИЦИЯ - "жёсткая" неразрывная связь
    private Storage storage; // связь в форме АГРЕГАЦИИ - "мягкая" связь
    //-------------------------------------------------------------------------------------
    private static int counter;
    private final int id;

    private String manufacturer;
    private String operatingSystem;
    private double price;

    // constructor
    public Computer(Storage storage, String manufacturer, String operatingSystem, double price) {
        this.id = ++counter; // создаём уникальный id компьютера

        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.price = price;

        // связь в форме АГРЕГАЦИИ - "мягкая" связь
        this.storage = storage;

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
    public String toString() {
        // ??? / return System.format("Components model: %s from brand: %s\n", model, brand, );
        return "Conmuter { "+ "id" + id + " | manufacturer: " + manufacturer +
                " | operatingSystem: " + operatingSystem +
                " | price " + price + " | processor: " + processor.toString() +
                " | memory: " + memory.toString() + " | storage: " + storage.toString();
    }

    public void showProcessorModel(){
        System.out.println(processor.getModel());
    }


}
