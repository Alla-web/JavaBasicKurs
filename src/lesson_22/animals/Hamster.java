package lesson_22.animals;

public class Hamster extends Animal{

    // переопределим родительский метод
    // на чистом поле начинаем писать название метода и появляется список выбора...
    @Override
    public void voice() {
        System.out.println("Hamster say Hrum-hrum");
    }
}
