package lesson_10;

import java.util.Arrays;

public class HomeWork_10_Task2 {
    public static void main(String[] args) {
        /*
        Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой
и самой длинной строки изначального массива.
         */
        String[] strings = {"One", "Java", "Python", "GO", "JS", "Hello"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("----------------------TestArray = null----------------------");
        strings = null;
        String[] res = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(res));

        System.out.println("--------------TestArray = null / length = 0 -----------------");
        // проверяем, а что же нам вернулось из метода?
        if (res.length == 0) {
            System.out.println("Метод не нашёл строки");
        }

        System.out.println("-----------------------null in array -------------------------");
        strings = new String[]{"One", "Java", null, "JS", "Hello"};
        res = getArrayWithSmallestString(strings);
        System.out.println();
        System.out.println(Arrays.toString(res));

        System.out.println("========== null in array is First ==================");
        strings = new String[]{ null, "Java", "Python", null, "JS", "hello"};
//



    } // main area

    public static String[] getArrayWithSmallestString(String[] strings) {
        // проверка, а что же пришло в метод, не null ли случайно:
        if (strings == null || strings.length == 0) {
            return new String[0]; // вернётся вот массив -> [] - пустой, с нулём элементов
        }
        // подбираем в 0-ю строку массива не null-у значение строки

        String notNutValue = findFirstNullValue(strings);
        System.out.println("notNutValue: " + notNutValue);
        // проверяем не null ли у нас 0-й исмвол длины массива:
        if (notNutValue == null) {
            return new String[0]; // []
        }

        String smallest = notNutValue;
        String biggest = notNutValue;



        if (strings == null) {
            return new String[0]; // output -> []
        }

        for (int i = 1; i < strings.length; i++) {
            System.out.print(strings[i] + "; ");
            // {null, "Java", "Python", null, "JS", "hello"};
            // i = 1
            if (strings[i] != null && strings[i].length() < smallest.length()) {
                // при знаке < будет выведена первая самая короткая трока в массиве
                // при знаке <= выведется последняя самая короткая трока в массиве
                // это проверка на содержание в массиве стр строки null
                smallest = strings[i];
            }
            if (strings[i] != null && strings[i].length() > biggest.length()) {
                // это проверка на содержание в массиве стр строки null
                biggest = strings[i];
            }
        }
        return new String[]{smallest, biggest};
        // объявили return и сразу записали в него переменные
        // при этом создастся новый массив строк и в него запишется 2 переменные -
        // самая короткая и самая длинная строка в массиве



    }

    public static String findFirstNullValue(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }
        //Если мы перебрали все элементы массива
        // и не нашли не null значение, возвращаем из метода null
        return null;
    }

}// class area




