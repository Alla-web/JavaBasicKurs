package lesson_24.flyable;

import java.util.SortedMap;

public class Flyers {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(50);
        Flyable duck = new Duck();

       // собираем наших летунов в массив
        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane; // неявное восходящее преобразование
        flyables[1] = duck; // неявное восходящее преобразование

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            if (flyable instanceof Airplane) {
                Airplane airplaneLink = (Airplane) flyable;
                System.out.println("вместимость: " + airplaneLink.capacity);
            }
            flyable.fly();

            if(flyable instanceof Swimmable){
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
            }
        }

        System.out.println("------------------------------------------------");
        //flyable.fly();
    }
}
