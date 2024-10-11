package lesson_21.HomeWork_21.Task2;

public class Storage extends Component {

    private int storageCapacity;

    // constructor
    public Storage(String brand, String model, int storageCapacity) {
        super(brand, model);
        this.storageCapacity = storageCapacity;
    }

    //getter
    public int getStorageCapacity() {
        return storageCapacity;
    }

    //setter
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    //methods
    public String toString() {
        StringBuilder sb = new StringBuilder("Storage - ");
        sb.append("model: ").append(getModel());
        sb.append("; brand: ").append(getBrand());
        sb.append("; capacity of storage: ").append(storageCapacity);
        return sb.toString();
    }


}
