package lesson_21.HomeWork_21.Task2;

public class Memory extends Component {

    private int memoryCapacity;

    // constructor
    public Memory(String brand, String model, int memoryCapacity) {
        super(brand, model);
        this.memoryCapacity = memoryCapacity;
    }

    //methods
    public String toString(){
        StringBuilder sb = new StringBuilder("Memory - ");
        sb.append("model: ").append(getModel());
        sb.append("brand: ").append(getBrand());
        sb.append("capacity of memory: ").append(memoryCapacity);
        sb.append(".");
        return sb.toString();
    }






}
