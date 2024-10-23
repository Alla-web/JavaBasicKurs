package lesson_28.homework_28;

import list.MyArrayGenList;
import list.MyList;

public class RectangleUtils {

    public static void removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        for (int i = 0; i < rectangles.size(); i++) {
            if (rectangles.get(i).equals(rectangleToRemove)) {
                rectangles.remove(i);
                i--; // корректируем индекс после удаления для учёта рядом стоящих дубликатов
            }
        }
    }

    // перебор при помощи for-each


    public static void removeDuplicates2(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        while (rectangles.contains(rectangleToRemove)) {
            rectangles.remove(rectangleToRemove);
        }
    }

    //оставить один треугольник, повторяющиеся убрать из списка
    public static void removeOnlyDuplicates(MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {
        MyList<Rectangle> result = new MyArrayGenList<>();
        /*
        1) проверить, есть ли такой прямоугольник в новом списке
        2) если нет - добавить в список
        3) перебросить ссылкию. Ссылка rectangles должна ссылаться на новый список
         */


    }



    }
