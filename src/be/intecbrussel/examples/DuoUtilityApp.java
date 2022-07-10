package be.intecbrussel.examples;

public class DuoUtilityApp {
    public static void main(String[] args) {
        Duo<String> sd = new Duo("first", "second");
        Duo<Double> dd = new Duo<>(23.5, 643.5);
        Duo<Integer> di = new Duo<>(567, 3234);

        Duo<String> d1 = new Duo<>("Hello", "World");
        Duo<String> d2 = new Duo<>("Goodbye", "Mars");

//        DuoUtility.printUpper(sd);
//        DuoUtility.printDuo(di);
//        DuoUtility.printSum(dd);

        DuoUtility.swapFirst(d1, d2);
        DuoUtility.printDuo(d1);
        DuoUtility.printDuo(d2);

    }

}
