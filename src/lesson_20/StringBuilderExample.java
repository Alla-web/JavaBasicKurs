package lesson_20;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Строка - immutable
        // после конкатенации будут создаваться новые объекты, на которые не будет ссылки
        // поэтому будет замусореваться память
        String str = "Java" + "is " + "the " + "best";

        // для эффективной работы со троками есть класс - StringBuilder
        // StringBuilder - класс, предназначенный для эффективного создания и модификации
        // изменяемых послеовательностей символов (строк)

        // создаем объект строка

        // используем конструкторы. Конструктор перегружен
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("Hello");

        // добавляем в конец строки символ
        sb.append(" ").append("Java");
        System.out.println();
        // сначала получить построковое представление
        String string = sb.toString();
        System.out.println(string);

        // Вставить символ в указанную позицию
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6, "beautiful "); // 6 это номер символа в строке, перед которым (нумерация с 0) вставить символ
        System.out.println(sb2);

        // заменить подстроку (определяется индексами) на указанное значение
        StringBuilder sb3 = new StringBuilder("Hello World!");
        sb3.replace(6, 11, "Java"); // c 6 по 11 символ (не включительно) заменить символы на Java
        System.out.println(sb3);

        // удалить строку в диапазоне от start до end
        StringBuilder sb4 = new StringBuilder("Hello World!");
        sb4.delete(5, 11);
        System.out.println(sb4);

        // Реверс - разворачивает последовательность символов
        StringBuilder sb5 = new StringBuilder("Hello World!");
        sb5.reverse();
        System.out.println(sb5);

        // Количество символов - длнина
        System.out.println("sb5.length " + sb5.length());

        // получить символ по индексу
        char ch = sb5.charAt(3);
        System.out.println(ch);

        // получить подстроку
        sb = new StringBuilder("Hello World!");
        System.out.println(sb);
        String subString = sb.substring(1); // получить подстроку начиная с 1-го символа
        System.out.println("sb.substring(3) -> " + subString);

        subString = sb.substring(6, 9); // получить подстроку начиная с 1-го по 9 символы
        System.out.println("sb.substring(6,9): " + subString);

        // изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        //если увеличить строку - она будет заполнена char с кодом 0
        sb.setLength(10);
        System.out.println(" sb.setLength(10)" + sb);
        char ch1 = sb.charAt(3);
        System.out.println("sb.charAt(3)" + (int) ch1); // получить код символа

        sb.setLength(3);
        System.out.println("sb.setLength(3)" + sb);

        String example = String.join("Java", "is", "the", "best");
        System.out.println(example);
        String[] strings = example.split(" ");
        System.out.println(Arrays.toString(strings));

        String result = phraseString();
        System.out.println("Аббревиатура " + result);

        //Потобезопасный брат StringBuilder
        // работает медленнее, но для дву-поточных приложений безопасный
        StringBuffer stringBuffer = new StringBuffer();



    } // main

    // написать метод, который запрашивает у пользователя строку, состоящую из нескольких
    // слов и возвращающий аббривиатуру этой фразы (первые буквы каждого слова записать
    // в верхнем регистре)


    public static String phraseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(word.charAt(0));
        }

        return sb.toString().toUpperCase();
    }


} // class
