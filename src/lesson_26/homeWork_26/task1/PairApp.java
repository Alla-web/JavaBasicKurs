package lesson_26.homeWork_26.task1;

public class PairApp {
    public static void main(String[] args) {
        System.out.println("---------------------------Pair<Integer>-----------------------------");
        System.out.println("----------------------Cоздали переменные--------------------------------");
        Pair<Integer> integerPair = new Pair<>(1, 2);
        System.out.println("First = " + integerPair.getFirst() +
                "; " + "Second = " + integerPair.getSecond() + ".");

        System.out.println("----------------------Переназначили переменные--------------------------------");
        integerPair.setFirst(3);
        integerPair.setSecond(4);
        System.out.println("First = " + integerPair.getFirst() +
                "; " + "Second = " + integerPair.getSecond() + ".");

        System.out.println("----------------------Обменяли значения переменных--------------------------------");
        integerPair.swap();
        System.out.println("First = " + integerPair.getFirst() +
                "; " + "Second = " + integerPair.getSecond() + ".");

        System.out.println("---------------------------Pair<String>-----------------------------");
        Pair<String> stringPair = new Pair<>("Hello", "World");
        System.out.println("First = " + stringPair.getFirst());
        System.out.println("Second = " + stringPair.getSecond());
        stringPair.swap();
        System.out.println("First = " + stringPair.getFirst());
        System.out.println("Second = " + stringPair.getSecond());

        System.out.println("---------------------------Pair<Character>-----------------------------");
        Pair<Character> characterPair = new Pair<>('A', 'L');
        System.out.println("First = " + characterPair.getFirst());
        System.out.println("Second = " + characterPair.getSecond());
        characterPair.swap();
        System.out.println("First = " + characterPair.getFirst());
        System.out.println("Second = " + characterPair.getSecond());


    }


}
