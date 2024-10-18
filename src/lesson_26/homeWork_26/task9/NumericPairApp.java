package lesson_26.homeWork_26.task9;

public class NumericPairApp {
    public static void main(String[] args) {
        System.out.println("-------------------------Integer, Double-----------------------------");
        NumericPair<Integer, Double> numericPairInt = new NumericPair<>(10, 20.0);
        System.out.println("sum (Integer, Double) = " + numericPairInt.sum());

        System.out.println("-------------------------Double, Integer-----------------------------");
        NumericPair<Double, Integer> numericPairDbl = new NumericPair<>(5.5, 4);
        System.out.println("sum (Double, Integer) = " + numericPairDbl.sum());

    }
}
