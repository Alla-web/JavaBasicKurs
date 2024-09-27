package lesson_12;

public class ArraysUtils {
    // метод линейного поиска элементов в массиве
    // путём перебора всех элементов массива и сравнивания с искомым значением
    // если значение найдено - возвращается индекс элемента массива
    // если не найдено, возвращается -1

    // Однозначно сказать, что число отсутствует в массиве
    // потребуется перебрать абсолютно все элементы массива -> 0(n)

    // полезная функция, которуя я хочу потом переиспользовать
    // метод для примера вызова метода из другого файла
    public static int linerSearch(int[] array, int searchValue) {
       int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == searchValue) {
                System.out.println("Линейный поиск нашёл за " + counter + " шагов");
                return i;
            }
        }
        return -1;
    }

    public static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // метод, который ищет минимальное значение и части массива
// от стартового индекса до конца массива
    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // сортировка выбором
    /*
    Описание алгоритма сортировки:
    1) выбираем минимальный элемент массива
    2) минимальное значение меняется местами с первым элементом
    Вторая иерация - выбирается мин элемент из оставшейся части
     */
    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);
            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }


    // Бинарный поиск значения в массиве

    // {0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99}
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex = array.length - 1;
        int counter = 0;

        // проверка, что частть массива можно разделить поплам
        while (startIndex <= endIndex) { //1. 0 <= 12
            counter++; // считаем число итераций

            // вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex) / 2; // сдвиг
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }
            //Если значения не равны - определить какую половину массива мы отбросили
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex -1;
            } else {
                startIndex = middleIndex +1;
            }
        }
        // Если цикл while закончен - т.е. не осталось частей массива, которые
        // можно поделить пополам, значит искомое значение в массиве отсутствует
        System.out.println("Значение не найдено! Шагов сделано: " + counter);
        return -1;

    }



}














