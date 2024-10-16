package lesson_25;

public class GenericBox <T> { // <T> - означает, что наш класс обобщённый
    // и может работать теми данными, которые решит программист
    // традиционно используется одна закгоавкая буква:

    // T - type, E - element, K - key, V - value (чтобы изменить символ Т на н-р Е
    // делаем через Rename (Shift + F6))

    private T value;
    // потом при создании объекта класса мы заменим букву Т
    // и она везде заменится на тип данных по всему коду

   // constructor
    public GenericBox(T value) {
        this.value = value;
    }

    // getter
    public T getValue() {
        return value;
    }

    //setter
    public void setValue(T value) {
        this.value = value;
    }

    // methods
    public String toString (){
        return "GenericBox{" +
                "value: " + value +
                "}";
    }

}
