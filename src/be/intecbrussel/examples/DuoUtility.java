package be.intecbrussel.examples;

public interface DuoUtility {
    public static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().toUpperCase() + ", " + d.getSecond().toUpperCase());

    }
    public static void printDuo(Duo<?> d){
        System.out.println(d.getFirst() + ", " + d.getSecond());
    }
    public static void printSum(Duo<? extends Number> d){
        System.out.println(d.getFirst().doubleValue() + d.getSecond().doubleValue());
    }
    public static <T> void swapFirst(Duo<T> d1, Duo<T> d2){
        T temp = d1.getFirst();
        d1.setFirst(d2.getFirst());
        d2.setFirst(temp);
    }
}
