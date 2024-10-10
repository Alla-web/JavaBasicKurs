package lesson_21;

public class BusDriver {

    private static int idCounter;
    private final int id;

    private String name;
    private String licenseNumber;

    //constructor
    public BusDriver(String name, String licenseNumber) {
        // сначала присвоится тек.значения каунтера, а потом увеличится на 1
        this.id = idCounter++; // у каждого нового объекта будет совй уникальный идентификатор
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    //methods
    // метод вывода инфо в строку при помощи класса StringBuilder
    public String toString(){
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();
    }







}
