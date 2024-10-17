package lesson_26.GenericTarget;

public class SuperBoxInt {
    private int value;

    public SuperBoxInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "SuperBoxInt {" +
                "value " + value +
                "}";
    }
}
