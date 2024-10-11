package lesson_21.HomeWork_21.Task2;

public class ComputerShop {
    public static void main(String[] args) {
        // 1-й шаг для создания кoмпьютера - создать жёсткий диск
        // т.к. он приходит в конструктор компьютера из вне

        System.out.println("-------------------------Создали жёский диск----------------------------");
        Storage storage = new Storage("LKHY", "LENOVO", 250);
        System.out.println(storage); //??? почему этот метод использует само
        System.out.println(storage.toString());




    }

}
