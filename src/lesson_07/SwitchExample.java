package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 7;
        if (x == 5) {
            System.out.println("if: x = 5");
        } else if (x == 7) {
            System.out.println("if: x = 7");
        } else {
            System.out.println("other");
        }
        System.out.println("============================================");

        switch (x) { // проверяет только на равенство со определённым списком значений!!!
            case 5:
                System.out.println("switch: x = 5");
                break; // отменяем работу кода, если условие не выполняется
            case 7:
                System.out.println("switch: x = 7");
                break; // отменяем работу кода, если условие не выполняется
            default:
                System.out.println("Wrong number");
        }
    }
}
