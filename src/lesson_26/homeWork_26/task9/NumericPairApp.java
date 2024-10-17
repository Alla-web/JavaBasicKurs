package lesson_26.homeWork_26.task9;

public class NumericPairApp {
    public static void main(String[] args) {
        System.out.println("-------------------------Integer-----------------------------");
        NumericPair<Integer> numericPairInt = new NumericPair<>(10, 20);
        System.out.println("sum (Integer) = " + numericPairInt.sum());

        System.out.println("-------------------------Double-----------------------------");
        NumericPair<Double> numericPairDbl = new NumericPair<>(5.5, 4.5);
        System.out.println("sum (Double) = " + numericPairDbl.sum());

    }
}
