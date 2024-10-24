package lesson_31.enums;

public class Auto {

    private String model;

    //ограничиваем варианты цветов, указанных в enum Color
    private Color color;

    //конструктор
    public Auto(String model, Color color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
