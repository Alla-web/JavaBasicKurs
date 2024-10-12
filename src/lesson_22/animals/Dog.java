package lesson_22.animals;

public class Dog extends Animal {

    // нет переопределения - есть только ссылка на родительский метод
    @Override
    public void voice() {
        // super - обращение к родителю
        super.voice();
    }

    // переопределили родительский метод - расширив его
    @Override
    public String toString() {
        // super - обращение к родителю
        return super.toString() + " | Dog. дополнение к реализации родительского метода";
    }
}
