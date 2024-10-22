package lesson_28.homework_28;

import java.util.Objects;

public class Rectangle {

    private double length;
    private double width;

    // constructors
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // methods
    public String toString(){
    return String.format("Rectangle [length = %.2f, width = %.2f]", length, width);
    }

    @Override
    public boolean equals(Object obj) {
        // если ссылка на объекты (1-й - объект, от имени которого вызывается метод equals() и
        // 2-й - объект, аргумент, который передан в метод для сравнения с 1-м) одинаковая,
        // объекты точно равны
        if (this == obj) return true;

        // если obj не является экземпляром класса Rectangle, объекты не равны
        if (!(obj instanceof Rectangle)) return false;

        // Приведение объекта к типу Rectangle
        Rectangle rectangle = (Rectangle) obj;

        // Безопасное сравнение полей firstName, lastName и dateOfBirsday
        // Используем Objects.equals() для защиты от NullPointerException
        return Objects.equals(length, rectangle.length) &&
                Objects.equals(width, rectangle.width);
    }
}
