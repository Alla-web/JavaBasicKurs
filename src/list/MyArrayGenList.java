package list;

public class MyArrayGenList<T> {
    private T[] array;
    private int cursor; // по умолчанию инициализировано значение ноль

    // Создание массива
    // Обычный конструктор
    public MyArrayGenList() {
        this.array = (T[]) new Object[10];
        // new T() = new T(); - так нельзя, правильно - см. строка выше
    }

    // Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими же значениями
    public MyArrayGenList(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            // создаём массив такой же длина как входящий
            this.array = (T[]) new Object[array.length * 2];
            // перезаписываем данные из входящего массива в наш новый
            add(array);
        }
    }

    // геттер для массива
    public T[] getArray() {
        return array;
    }


    // 1. Добавление элемента

    // 1.1. Добавление одного элемента за одно добавление
    public void add(T value) {
        // во изб. ошибки проверяем, есть ли свободное местов массиве?
        // если есть - добавляем значение, если нет - расширяем массив
        // cursor по умолчанию равен 0,
        if (cursor == array.length - 1) {
            // расширить массив перед добавлением нового элемента:
            expandArray();
        }
        // в ячейку, на которую указывает курсор записываем
        // принимаемое значение переменной value
        array[cursor] = value;
        cursor++;
        /*
        нельзя создать так - потому, что ошибка возникнет во время работы программы
        T link = new T();
        поэтому нужно делать приведение типов в конструкторах, чтобы ошибка была выловлена
        на этапе создания объекта, а не в процессе работы программы

         */
    }


    // 1.2. Добавление одновременно нескольких элементов в массив
    public void add(T... numbers) {
        // с numbers мы можем обращаться как с набором интов
        System.out.println("Приняли элементов: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        // 1. Создали новый массив с нулевыми значениями по умолчанию
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2. Перезаполняем новый массив значениями из старого
        for (int i = 0; i < cursor; i++) {
            array[i] = newArray[i];
        }

        // 3. Перебрасываем ссылку на новый массив
        array = newArray;
        System.out.println("Расширение массива завершено!");
    }

    public int size() {
        return cursor;
    }

    public int totalSize() {
        return array.length;
    }

    // Вовзращает строковое представление масcива -
    // преобразовать массив в строку
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

    // Возвращение значения элемента массива по его индексу
    public T getElementByIndex(int index) {
        if (index >= 0 && index < cursor) {
            System.out.println("Значение ячейки " + index + " -> " + array[index]);
            return array[index];
        } else {
            System.out.println("Неверный индекс!");
            return null;
        }
    }

    // удаление элемента массива по его индексу
    public T remove(int index) {
        /*
        Проверка индекса на валидность
        Удалить значение по индексу, если индекс норм
        Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        Вернуть старое значение
         */
        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = 0; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            System.out.println("Искомый индекс -> " + index);
            return value;
        } else {
            // Индекс не валидный
            return null;
        }
    }

    // удаление элемента массива по его значению
    public boolean removeBiValue(T value) {
        /*
        1. Есть ли элемент с таким значением в массиве - вызвать метод поиска по значению
        2. Если эл-та нет - вернуть false
        3. Если эл-т есть - удалить и вернуть true - вызвать метод удаления по индексу
         */
        // есть методы уже, которые можно исп-ть в этом методе
        int index = indexOf(value); // находит индекс по принимаемому значению
        if (index == -1) {
            System.out.println("Нет такого значения в массиве! ");
            return false;
        }
        remove(index); // удаляет элемент с номером ячейки, в которой лежит искомое значение
        return true;
    }

    // поиск по значению - первое вхождение -> возьмет первое найденное значение
    public int indexOf(T value) {
        System.out.println("Ищем значение -> " + value);
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                System.out.println("Индекс ячейки c искомым значением -> " + i);
                return i;
            }
        }
        return -1;
    }

    // метод поиска по значению и, как правило, есть сразу последнего значение
    public int lastIndexOf(T value) {
        System.out.println("Ищем значение -> " + value);
        for (int i = cursor; i > 0; i--) {
            if (array[i].equals(value)) {
                System.out.println("Индекс ячейки c искомым значением -> " + i);
                return i;
            }
        }
        return -1;
    }


}// class area

/*
В резиновом массиве должны быть реализованы методы:
    1. Добавление элемента
    2. Вывести все значения в массиве в консоль
    4. Возвращение значения по индексу
    3. Текущее количество элементов в массиве
Удаление элемента по индексу. (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)
Поиск элемента по значению
    4. Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
    5. Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    Удаление элемента по значению
 */
