package lesson_16;

public class TestArray {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();
        System.out.println(magicArray.toString());

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(200);
        System.out.println("Сейчас в массиве элементов: " + magicArray.size());
        magicArray.add(500, 600, 700, 800, 900, 1000, 1100);
        System.out.println("Сейчас в массиве элементов: " + magicArray.size());

        System.out.println(magicArray.toString());

    }
}
