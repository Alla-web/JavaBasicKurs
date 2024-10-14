package lesson_23.absrtracts_class;

abstract class Animal {
    // если в классе, есть хоть один абстрактный метод, то мы
    // должны пометить сам класс модификатором abstract

    // Абстрактный класс может иметь поля и конструкторы
    protected String name;

    //конструктор
    public Animal(String name) {
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // мы не хотим давать базовую реализацию методам т.е.
    // этот метод должен быть в каждом наследнике, но переопределённым в
    // каждом наследнике:

    //Абстрактный метод - не имеет тела метода (реализации)
    abstract void eat();
    abstract void move();


    // нормальный метод
    public void sayHello() {
        System.out.println("Hello from animal!");
    }




}
