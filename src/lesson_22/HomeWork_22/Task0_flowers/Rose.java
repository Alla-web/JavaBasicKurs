package lesson_22.HomeWork_22.Task0_flowers;

public class Rose extends Flower {

    // собственный метод
    public void prick() {
        System.out.println("I am pricking");
    }
//--------------------------------------------------------------------------------------
    // переназначеный родительский метод blow
    @Override
    public void blow() {
        System.out.println("I bloom in summer and autumn");
    }

    // перезрузили родительский метод
    public void blow(String str) {
        System.out.println("I bloom in " + str);
    }



}
