package list;
/*
Дженерик имплементирует интерфейс и параметризируется тем же типом, что и Дженерик
 */

import java.lang.reflect.Array;

public class MyArrayGenList<T> implements MyList<T> {

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
            addAll(array);
        }
    }

    /*
    нельзя давать доступ "наружу" к нашему массиву!
    // геттер для массива
    public T[] getArray() {
        return array;
    }
     */
//----------------------------------------------------------------------------------
    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            array[index] = value;
        }
        // если нет - ничего не делаем
    }

//----------------------------------------------------------------------------------

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

    //--------------------------------------------------------------------------------------------------
    @Override
    /* мы переименовали наш метод и оставили аннотацию, чтобы показать,
    что это имплементированный метод от интерфейса
    public void addAll(T... values) {
    }
     */
//-----------------------------------------------------------------------------------------------
    // 1.2. Добавление одновременно нескольких элементов в массив
    public void addAll(T... numbers) {
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
            newArray[i] = array[i];
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

    //-------------------------------------------------------------------------------
    @Override
/*
имплементировали метод от интерфейса путём переименования нашего собственного метода
 */
    // Возвращение значения элемента массива по его индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
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
            T value = array[index]; // значение, которое я должен вернуть
            // Перебираем элементы начиная с индекса
            // и перезаписываем значениями из соседней правой ячейки
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            System.out.println("Удаляемый индекс -> " + index);
            return value;
        } else {
            // Индекс не валидный
            return null;
        }
    }

    //------------------------------------------------------------------------------------
    // проверка не пустой ли у нас массив
    @Override
    public boolean isEmpty() {
        return cursor == 0;
        /*
        если курсор равен 0, значет мы не добавили в массив элементов
         */
    }


    //------------------------------------------------------------------------------------------------
    @Override
    /*
    имплементировали унаследованный от интерфейса метод путём
    переименования нашего уже существующего метода
        public boolean remove(T value) {
        return false;
        }
     */
    //------------------------------------------------------------------------------------------------
    // удаление элемента массива по его значению
    public boolean remove(T value) {
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

    //-----------------------------------------------------------------------------------------
   /*
   реализуем имплементированный от интерфейса метод
   при помощи нашего метода indexOf
    */
    @Override
    public boolean contains(T value) {
        /*
        int index = indexOf(value):
        if (index>0) {
            return true;
        } else {
            return false;
        }
        */
        // более краткий код
        return indexOf(value) >= 0;
        /*
        если индекс содержится - будет правда
        если нет - вернётся отрицательное значение индекса,
            а значит, элемент не содержится
         */
    }


    //-----------------------------------------------------------------------------------------

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

    //-----------------------------------------------------------------------------------
   // метод должен вернуть наш магический массив в виде обычного массива
    @Override
    public T[] toArray() {
        /*
        1. Создать новый массив размерностью cursor
        2. Пройтись по нашему Внутреннему массиву и скопировать элементы
        3. Вернуть ссылку
         */
        // Рефлексия - способность программы исследовать
        // свои объекты на стадии выполнения программы
        // из-за стирания типов (T[] result = (T[]) new Object) - программа не знает,
        // что такое тип Т, но я могу выяснить на стадии выполнения программы тип объекта
        // из какого-нибудь объекта моего массива и потом могу создать массив этого типа
        // это выглядиттак:
/*
до добавления строки, массив заполнен null-ами и наш новый
оздаваемый массив будет тоже null-вый и будет ошибка
 поэтому перед созданием объекта нужно добавить проверку:
 */
        if (cursor==0) return null;

        Class<T> clazz = (Class<T>) array[0].getClass();
        //System.out.println("clazz -> " + clazz);

        // создаю массив того же типа, как 0-й элемент моего массива
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        //перезаписываем массив
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
        /* Этот код вызывает ошибку
        T[] result = (T[]) new Object[cursor];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
         */
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
