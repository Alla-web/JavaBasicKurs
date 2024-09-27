package lesson_09;

public class MethodExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();
        sayHello();

        // String string = "Java";

        saySomething("Метод, используй этот текст в своих расчётах -> Java!");
        // эту переменную типа String использует метод в своих манипуляциях

        char ch = 'A';
        char anotherChar = 'B';
        printDecimalCodeCar(ch); // метод, используй мою переменную ch в своих расчётах
        printDecimalCodeCar(anotherChar); // а еперь этот символ возьми и поработай
        printDecimalCodeCar('j'); // а теперь с этим значением поработай

        System.out.println("----------------------------Массивы----------------------");

        int[] array = {1, 32, 43, 144, 5, 6, 10};
        printArray(array); // говорим методу - используй массив array в своих расчётах
        array[0] = 1000;
        array[6] = 2000;
        printArray(array);

        int[] array2 = {12, 36, 45, 98, 78, 56};
        printArray(array2);

        System.out.println("------------------------------------------------------------");
        // Состав названия метода:
        /*
        public static void printNumbers(int x, int y) {}
        public static - модификатор метода
        void - тип возвращаемого значения (тип void не возвращает ничего)
        printNumbers(int x, int y) - СИГНАТУРА метода - совокупность имени и набора параметров
        АРГУМЕНТ метода - значение, которое передается в метод
         */

        // ПЕРЕГРУЗКА методов
        /*
        в пределах одного класса могут существовать 2 метода с одинаковым именем,
        но разным набором параметров (принимаемых типов данных) -
        это называется ПЕРЕГРУЗКА МЕТОДА - это не допустимо!
        Допустимо - несколько методов с одинаковым именем,
        но разным набором параметров (принимаемых типов данных - int, char, String)

        СИГНАТУРА МЕТОДА - совокупность названия метода и набора параметров -
        например - printNumbers(int x, int y) и порядок параметров имеет значение -
        например - printNumbers(int x, String str) и printNumbers(String str, int x)

         */

        // задача - написать метод, который выводит числа от 0 до N
        printNumbers(10);

        // задача - написать числа от Х до У
        printNumbers(1, 10);

        System.out.println("-----------------------------------------------------");
        // выбираем метод из перегрузки методов (4 метода с именем printNumbers)
        printNumbers(1, "Java");
        printNumbers("Python", 2);
        System.out.println("-----------------------------------------------------");


    } // Main area

    //-----------------------------------------------------------------------------
    //ПООЧЕРЁДНОСТЬ принимаемых типов данных - это тоже признак уникальности метода
    public static void printNumbers(String str, int x) {
        System.out.println("Method option 2 -> " + str + " " + x);
    }

    public static void printNumbers(int x, String str) {
        System.out.println("Method option 1 -> " + str + " " + x);
    }

    //-----------------------------------------------------------------------------
    // ПЕРЕГРУЗКА методов
    // называется тоже printNumbers, но принимает две переменные типа int -
    // нет ПЕРЕГРУЗКИ методов
    public static void printNumbers(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.print(i++ + ", ");
        }
        System.out.println(); // добавили строку для перехода на новую строку
    }

    // называется printNumbers, но принимает только одну переменную типа int
    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i++ + ", ");
        }
        System.out.println(); // добавили строку для перехода на новую строку
    }
    //-----------------------------------------------------------------------------

    public static void printArray(int[] array1) {
        System.out.print("[");
        int i = 0;
        while (i < array1.length) {
            System.out.print(array1[i] + (((i < array1.length - 1)) ? ", " : "]\n"));
            i++;
        }
    }

    // метод принимает данные типа char в переменную ch1 и работает с ними
    public static void printDecimalCodeCar(char ch1) {
        System.out.println("Десятеричный код символа -> " + (int) ch1);
    }

    // метод принимает данные типа String в переменную text и работает с ними
    public static void saySomething(String text) {
        System.out.println(text);
    }

    // в скобочках пусто - метод ничего не принимает, просто делает свою работу внутри метода
    public static void sayHello() {
        // Тело метода
        System.out.println("Hello!");
    }


} // End class
