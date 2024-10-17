package lesson_26.homeWork_26.task2;

/*
Создайте обобщенный класс NumericPair, который хранит две
числовые переменные и имеет метод для вычисления их суммы.
Требования:
•	Класс должен иметь конструктор для инициализации двух чисел.
•	Метод double sum() возвращает сумму этих чисел.
 */
public class NumericPair<T extends Number> {
    private T first;
    private T second;

    //constructor
    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    //method
    public double sum() {
        //над объектами нельзя произволить мат. вычисления,
        //поэтому добываем их примитивы, а потом вычисляем
        double sum = first.doubleValue() + second.doubleValue();
        return sum;
    }


}
