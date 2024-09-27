package lesson_07;

public class StringEquals {
    public static void main(String[] args) {
        int x = 10; // хранятся данный в памяти Stack

        // ссылочный тип данных. В переменной str1 хранится ссылка на область памяти,
        // в которой находится объект типа String
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java"); // старый метод написания данных типа Строка
        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        // сравниваются ссылки на участки памяти Heap, кот. хранящиеся в этих пеменных
        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2 " + b1); // true
        System.out.println("str1 == str3 " + (str1 == str3)); // Java не равно JaVa -> false
        System.out.println("str1 == str4 " + (str1 == str4)); // Java равно Java, но -> false
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // String Pool

        // ВАЖНО!!!
        // Для сравнения строк по их значению мы ДОЛЖНЫ использовать метод equals()
        boolean b2 = str1.equals(str2); // сравнение по значению строк - метод equals, а не по участкам памяти
        System.out.println("str1 == str2 " + b2);
        System.out.println("str1 == str3 " + str1.equals(str3));
        System.out.println("str1 == str4 " + str1.equals(str4));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("equalsIgnoreCase " + str3+ " -> " + str1.equalsIgnoreCase(str3)); // сравнивает по значению игнорируя регистр
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");










    }
}
