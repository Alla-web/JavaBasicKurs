package lesson_16;

public class RubberArray_HW16 {
    int[] array;
    int cursor;

    // Создание массива - обычный конструктор
    public RubberArray_HW16() {
        array = new int[10];
    }

    // Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    public RubberArray_HW16(int[] array) {
        // создаём массив такой же длина как входящий
        this.array = new int[array.length];
        // устанавливаем курсор в конец массива
        cursor = array.length;
        for (int i = 0; i < cursor; i++) {
            this.array[i] = array[i];
        }
    }

    // 1. Добавление элемента
    public void add(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (cursor >= array.length) {
                expandArray();
            }
            array[cursor++] = numbers[i];
        }
    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        // 1. Создали новый максси с нулевыми значениями по умолчанию
        int[] newArray = new int[array.length + 10];

        // 2. Перезаполняем новый массив значениями из старого
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3. Перебрасываем ссылку на новый массив
        array = newArray;
        System.out.println("Расширение завершено!");
    }

    public int size() {
        return cursor;
    }


    public String toString() {
        if (cursor == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    // Возвращение значения по индексу
    public int getElementByIndex(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("Неверный индекс!");
            return 0;
        }
    }


}// class area

/*
В резиновом массиве должны быть реализованы методы:
    1. Добавление элемента
    2. Вывести все значения в массиве в консоль
    4. Возвращение значения по индексу
    3. Текущее количество элементов в массиве
Удаление элемента по индексу
Поиск элемента по значению
    4. Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
    5. Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    Удаление элемента по значению
 */
