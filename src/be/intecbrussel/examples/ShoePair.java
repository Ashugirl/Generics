package be.intecbrussel.examples;

public class ShoePair implements Pair<Shoe>{
    private Shoe leftShoe;
    private Shoe rightShoe;

    public ShoePair(Shoe left, Shoe right) {
        leftShoe = left;
        rightShoe = right;
    }

    @Override
    public Shoe getLeft() {
        return leftShoe;
    }

    @Override
    public Shoe getRight() {
        return rightShoe ;
    }

    @Override
    public void setLeft(Shoe left) {
        leftShoe = left;
    }

    @Override
    public void setRight(Shoe right) {
        rightShoe = right;
    }
}
