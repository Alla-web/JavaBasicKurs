package lesson_06;

public class HomeWork_06_Task4 {
    public static void main(String[] args) {
/*
Дан следующий код. Вашей задачей является предсказать,
какой вывод будет напечатан в консоли после выполнения программы.
 */
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10; // 8+3=11 11>10 -> true
        System.out.println("8+3 > 10 -> " + result);

        result = (a - b) == 5; // 8-3=5 5=5 -> true
        System.out.println("8-3 = 5 -> " + result);

        result = (a * b) != 24; // 8*3=24 -> false
        System.out.println("8*3 = 24 -> " + result);

        result = (a / b) >= 2; // 8/3=2.67 2.67 > 2 -> true
        System.out.println("8/3 >= 2 -> " + result);

        result = !(a % b == 2);
        // целый остаток от 8/3 -> 2; 2=2 -> true,
        // противоположное от true -> false
        System.out.println("true наоборот -> " + result);
    }

}
