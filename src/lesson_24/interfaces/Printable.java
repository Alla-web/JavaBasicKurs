package lesson_24.interfaces;

// интерфейсы - косвенно (по умолчаннию) абстрактны. Т.е. на не нужно в классе писать
// abstract, а оно присутствует по умолчанию
public interface Printable {

    public abstract
   // методы интерфейса косвенно (по умолчанию) public abstract
    // нам не нужно каждый раз прописывать     public abstract
    void print();

    //интерфейс - это совокупность абстрактных методов, задающих какое-то поведение

    // в интерфейсах начиная с JDK-8 доступны методы по умолчанию, имеющие реализацию
    // отличаются они ключевым словом default
    default void test() {
        System.out.println("Test");
    }
    // в имплементируемом классе мы не обязаны такой метод реализовать функционал

    // в интерфейсах начиная с JDK-8 доступны статические методы
    static void testStatic(String str){
        System.out.println("Static method printable: " + str);
    }

    // в интерфейсах начиная с JDK-9 появились приватные методы (статические и не статические)
    // переопределить из в классе невозможно

    // Интерфейс может расширять интерфейс - заиметь себе наследников

}




