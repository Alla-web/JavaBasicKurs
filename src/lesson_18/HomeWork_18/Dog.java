package lesson_18.HomeWork_18;

public class Dog {
    /*
Task 2 * (Опционально)
Написать класс Собака (Dog).
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака,
не может быть больше, чем двукратная высота первоначального прыжка.
Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки
(будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
     */

    private String name;
    private int initialJumpHeight;
    private int currentJumpHeight;
    private int maxJumpHeight;

    // constructors

    public Dog() {
    }

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.initialJumpHeight = initialJumpHeight;
        this.currentJumpHeight = initialJumpHeight;
        this.maxJumpHeight = initialJumpHeight*2;
    }

    // Methods
    /*
    public jump() {
        System.out.println("I am jumping");
    }



    public static int training() {
        System.out.println("I am training");
        if () {
            jumpHeight += 10;
        }
    }



    public static int jumpBarrier(int barrierHeight) {

    }

     */




} // class area
