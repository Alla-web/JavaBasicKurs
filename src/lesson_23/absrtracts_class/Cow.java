package lesson_23.absrtracts_class;

abstract class Cow extends Animal {
    // если я в наследнике не написал реализацию абстрактных методов родитея,
    // я должен пометить такой класс как abstract

    // constructor
    public Cow(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cow " + name + " eats");
    }

    /*
    абстрактный метод move мы не переопределили,
    значит сам класс дочерний класс обязаны пометить как abstract
     */
}
