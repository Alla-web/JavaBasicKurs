package lesson_43;

public class Cat {

    private String name;
    private int weight;
    private String color;

    public Cat(String name, int wight, String color) {
        this.name = name;
        this.weight = wight;
        this.color = color;
    }

    public String getName() {
        System.out.println("call getName: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int wight) {
        this.weight = wight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nCat{" +
                "name: '" + name + '\'' +
                ", wight: " + weight +
                ", color: '" + color + '\'' +
                '}';
    }
}
