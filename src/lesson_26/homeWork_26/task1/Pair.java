package lesson_26.homeWork_26.task1;
/*
Создайте обобщенный класс Pair, который хранит две переменные одного типа.
Требования:
Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */
public class Pair<T> {

    private T first;
    private T second;

    //constructor
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    //getters
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    //setters
    public void setFirst(T value) {
        this.first = value;
    }

    public void setSecond(T value) {
        this.second = value;
    }

    //methods
    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first = " + first +
                ", second = " + second +
                '}';
    }
}
