package lesson_26.homeWork_26.task1;

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


}
