package lesson_26.GenericTarget;

public class SuperBoxDouble {

    private double value;

    public SuperBoxDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperBoxDouble {" +
                "value " + value +
                "}";
    }
}

