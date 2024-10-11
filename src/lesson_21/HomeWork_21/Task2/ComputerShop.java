package lesson_21.HomeWork_21.Task2;

public class ComputerShop {
    public static void main(String[] args) {
        // 1-й шаг для создания кoмпьютера - создать жёсткий диск
        // т.к. он приходит в конструктор компьютера из вне

        System.out.println("-------------------------Создали жёский диск----------------------------");
        Storage storage1 = new Storage("LENOVO", "L-123", 250);
        System.out.println(storage1); //??? почему этот метод использует самописный toString()
        System.out.println(storage1.toString());
        System.out.println("-------------------------Создали компьютер----------------------------");
        Computer computer1 = new Computer(storage1, "LENOVO", "Windows", 599.99);
        System.out.println(computer1.toString());
        System.out.println("---------------Создали 2-й компьютер с таким же жёстким диском---------------------------------------");
        Computer computer2 = new Computer(storage1, "LENOVO", "Windows", 450.5);
        System.out.println(computer2.toString());





    }

}
