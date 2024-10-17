package lesson_26.GenericTarget;

public class SuperBoxGen<T> {
    // стирание объектов (на этапе компиляции компилятор проверяет - можно ли
    // привести опр. объект к опр типу)

    private T value;

    // конструктор
    public SuperBoxGen(T value) {
        this.value = value;
    }

   // геттер
    public T getValue() {
        return value;
    }

    //сеттер
    public void setValue(T value) {
        this.value = value;
    }

    //методы
    public String toString() {
        return "SuperBoxGen {" +
                "value: " + value +
                "}";
    }
}
