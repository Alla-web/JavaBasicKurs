package lesson_09;

public class MethodExample2 {
    public static void main(String[] args) {
        System.out.println("================Аргумент int============================");
        int temp = 5;
        System.out.println("temp before: " + temp);
        changeMy(temp);
        System.out.println("temp from method: " + temp);
         /* ВАЖНО!
        если мы передаём данные в метод с агрументом int (а строка иммутабельная),
        то изменения данных хранятся внутри метода и не влияют на передаваемый
        аргумент - никак его не меняют!
        */

        System.out.println("================Аргумент String============================");
        String string = "Java";
        System.out.println("string before: " + string);
        changeMy(string);
        System.out.println("string from method: " + string);
        /* ВАЖНО!
        если мы передаём данные в метод с агрументом String (а строка иммутабельная),
        то внутри метода происходит перезапись на новую ссылку в ячейке памяти,
        */

        System.out.println("================Аргумент int[]============================");
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        System.out.print("array before: ");
        System.out.print("[ ");
        while (i < arr.length) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : " ]\n"));
            i++;
        }
        changeMy(arr);

        int[] arr2 = arr;
        changeMy(arr2);
        arr2[4]=4000;
        changeMy(arr2);
        changeMy(arr); // данные обновились и перезаписались в исходный массив

        /* ВАЖНО!
        если мы передаём данные в метод с агрументом массив, то перезаписываются все действия,
        произведенные с этим массивом внутри метода, применятся в основном вызове метода
         */



    } // main area

    public static void changeMy(int x) {
        x = 100;
    } // изменяем int-ю переменную

    public static void changeMy(String str) {
        str = str + "!!!";
        System.out.println("string inside of method: " + str);
    }  // изменяем String-ю переменную

    public static void changeMy(int[] array) { // изменяем int[] массив
        array[0] = 1000;
        int i = 0;
        System.out.print("array inside of method: ");
        System.out.print("[ ");
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : " ]\n"));
            i++;
        }
    }

} // class area
