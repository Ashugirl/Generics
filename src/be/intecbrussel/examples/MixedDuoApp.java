package be.intecbrussel.examples;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class MixedDuoApp {
    public static void main(String[] args) {
       MixedDuo<String, Integer> mixedDuo = new MixedDuo<>("Hello", 5);

       String s = mixedDuo.getFirst();
       Integer i = mixedDuo.getSecond();

       System.out.println(s + " " + i);

        MixedDuo<String, Integer> mixedDuo1 = new MixedDuo<>("Poes", 13);
        String name = mixedDuo1.getFirst();
        Integer age = mixedDuo1.getSecond();

        System.out.println("This is " + name + " who is " + age + " years old.");

        MixedDuo<Boolean, Double> mixedDuo2 = new MixedDuo<>(true, 12.4);

        Boolean boo = mixedDuo2.getFirst();
        Double dub = mixedDuo2.getSecond();

        System.out.println(boo + " " + dub);
    }
}
