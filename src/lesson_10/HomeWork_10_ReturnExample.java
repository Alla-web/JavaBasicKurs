package lesson_10;

public class HomeWork_10_ReturnExample {
    public static void main(String[] args) {
        int sum;
        //sum = sum(5, 8);
        //System.out.println("sum -> " + sum);

        sum(2.0, 2.0);



    }// main area

    public static int sum(int a, int b) { //
        if (a > b) {
            return a + b; // при этом условии есть return
        } else {
            return a - b; // и при этом условии return тоже должен быть
        }
    }

    public static void sum(double a, double b) {
        // Придумаем, что в ТЗ стоит, что метод должен работать, только если а <= b
        // Первым делом - проверяем корректность входящих значений
        if (a > b) {
            System.out.println("a > b -> Wrong numbers");
            return; // работа метода прекратся, например мне эти числа не подходят
        }
        double result = a + b;
        System.out.println("Метод sum double продолжает работу:" + (result));
    }

} // class area