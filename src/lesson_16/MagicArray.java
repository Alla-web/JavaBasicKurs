package lesson_16;

public class MagicArray {
    int[] array;
    int cursor; // по умолчанию инициализировано значение ноль

    // Конструктор по умолчанию
    public MagicArray() {
        array = new int[10]; // будет добавлено 10 ячеек к имеющемуся массиву
    }

    // Добавление в массив одного элемента
    void add(int value) {
        // добавить проверку - есть ли вообще вводное место во внутреннем массиве,
        // если места нет - нужно его добавить
        if (cursor == array.length - 1) {
            // расширить массив перед добавлением нового элемента:
            expandArray();
        }
        array[cursor] = value; // ячейка где стоит курсор будет заполняться пришедшим значением int
        cursor++; // курсор передвигаем на одну ячей1ку вправо
    }

    void add(int... numbers) {
        // с numbers я могу обращяться точно также, как и со ссылкой на массив
        //System.out.println("Приняли несколько int-ов. А именно: " + numbers.length);
        //System.out.println("Есть индекс у каждого инта, как в массиве. Под индексом 0: " + numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }
// Динамическое расширение массива

    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. Создать новый массив боОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения старого массива(до курсора)
        3. Перебросить ссылку на новый массив
         */
        // 1. Создали новый максси с нулевыми значениями по умолчанию
        int[] newArray = new int[array.length * 2];

        // 2. Перезаполняем новый массив значениями из старого
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        // 3. Перебрасываем ссылку на новый массив
        array = newArray;
        // расширение массива завершено
        System.out.println("Расширение завершено!");
    }

    // метод возвращает построковое представление массива
    // [1, 2, 3, ,,,]
    public String toString() {
        if (cursor == 0) {

            return "[]";
        }

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? "," : "]"); //
        }
        return result;

    }

    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >=0 && index< cursor) {
            return array[index];
        }
        // написать код, если индекс не корректный
        return Integer.MIN_VALUE;
        //TODO поправить обработку некорректного индекса

    }

    int remove(int index) {
        /*
        Проверка индекса на валидность
        Удалить значение по индексу, если индекс норм
        Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        Вернуть старое значение
         */
        return -1;
    }

}// class area

/*
    1. я хочу, чтобы я мог добавлять в массив элемент (не думая об индексах, размере массива)
    2. Динамическое изменение размера массива
    3. Возвращать построковое представление массива (какие элементы там есть)
    4. Добавляем в массив сразу несколько значений через запятую
    5. Получить текущее количество в масиве
    6. Возвращает значение по индексу /?
    7. Удаляет элемент по индексу (есть индекс - удалить этот элемент из массива)
     */
