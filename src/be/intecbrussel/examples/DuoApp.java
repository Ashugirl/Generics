package be.intecbrussel.examples;

import javax.imageio.ImageIO;

public class DuoApp {

    public static void main(String[] args) {
        Duo<String> stringDuo = new Duo<>("Hello", "World");
        Duo<Integer> integerDuo = new Duo<>(7,5);

        String s1 = stringDuo.getFirst();
        String s2 = stringDuo.getSecond();

        Integer i1 = integerDuo.getFirst();
        Integer i2 = integerDuo.getSecond();

        System.out.println(s1 + " " + s2);
        System.out.println(i1 + i2);



    }


}
