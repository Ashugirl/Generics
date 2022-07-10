package be.intecbrussel.examples;

public class ComparableDuoApp {
    public static void main(String[] args) {
        ComparableDuo<Double> cd1 = new ComparableDuo<>(4.6, 5.7);
        ComparableDuo<Integer> cd2 = new ComparableDuo<>(789, 235);

        System.out.println(cd1.getHighest());
        System.out.println(cd1.getLowest());

        System.out.println(cd2.getHighest());
        System.out.println(cd2.getLowest());
    }
}
