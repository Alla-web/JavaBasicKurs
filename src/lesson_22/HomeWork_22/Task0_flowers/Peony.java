package lesson_22.HomeWork_22.Task0_flowers;

public class Peony extends Flower {

    // собственный метод
    public void smell() {
        System.out.println("I smell great");
    }
//--------------------------------------------------------------------------------------

    // переназначаем родительский метод путем его дополнения
    @Override
    public String toString() {
        return super.toString() + " | addition to the parent method";
    }
}
