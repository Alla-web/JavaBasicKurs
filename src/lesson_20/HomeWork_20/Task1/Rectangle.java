package lesson_20.HomeWork_20.Task1;

public class Rectangle extends Shape {

    private double height;
    private double width;

    //constructor

    public Rectangle() {
    }

    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    public Rectangle(String name, String color, double height, double width) {
        super(name, color);
        this.height = height;
        this.width = width;
    }

    //геттеры
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // можно добавить отдельно сэттэры,
    // (помимо - public void setDimensions(double height, double width))
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // methods
    public void setDimensions(double height, double width) {
        this.height = height;
        this.width = width;
        System.out.println("height = " + height);
        System.out.println("width = " + width);
    }

    public double calculateArea() {
        double rectangleArea = height * width;
        System.out.println("dimensions of " + getName() + " -> " + rectangleArea);
        return rectangleArea;
    }


} // class area
