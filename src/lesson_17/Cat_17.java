package lesson_17;

public class Cat_17 {
    // без указания модификатора - по умолчанию - доступен в рамках пакета и в производных классах
    // String name;

    // в 99,9% случаев мы должны будем закрывать поля нашего класса - private
    private String name;
    private int age; // protected - поле доступно в рамках одного пакета
    private int weight;

    // конструктор принимающий
    public Cat_17(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры - можем давать и не давать, давать на некоторые поля
    // На практике нужно закрывать методы и через геттеры и сеттеры давать доступ

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    // сэттеры
    // контролируем то, что прислал пользователь
    public void setAge(int age) { //?????????
        if (age < 0 || age > 20) {
            return; // прекращение работы метода, если age нас не устраивает
        }
        this.age = age;
    }
    // не контролируем, что прислал пользователь
    // если мы хотим пользователю дать взможность установить своё значение без геттера и сэттера
    public void setWeight(int weight){
        this.weight = weight;
    }

    // конструктор простой
    private Cat_17() {
    }

    private void testMethod() { // доступен только в пределах класса
        System.out.println("Test");
    }


    // метод мяу!
    public void sayMeow() {
        System.out.println("Meow! " + name);
    }

    public String toString() {
        return "Cat " + name + ", age: " + age + ", weight: " + weight;
    }


}

