package be.intecbrussel.examples;

public class GeneralPairApp {
    public static void main(String[] args) {
        Shoe leftShoe = new Shoe();
        Shoe rightShoe = new Shoe();
        GeneralPair<Shoe> pair = new GeneralPair<>(leftShoe, rightShoe);

    }
}
