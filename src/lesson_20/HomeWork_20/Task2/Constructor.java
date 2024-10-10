package lesson_20.HomeWork_20.Task2;

public class Constructor extends Toy {

    private int countOfParts;

    // constructor
    public Constructor(String name, String brand, int ageOfChild, int countOfParts) {
        super(name, brand, ageOfChild);
        this.countOfParts = countOfParts;
    }

    // getters
    public int getCountOfParts() {
        return countOfParts;
    }

    //setters
    public void setCountOfParts(int countOfParts) {
        this.countOfParts = countOfParts;
    }

    // methods
    public void putTogether(){
        System.out.println("Child can put me together");
    }
}
