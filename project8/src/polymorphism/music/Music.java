package polymorphism.music;

import java.util.ArrayList;

public class Music {

    public static void main(String[] args) {
        Instrument flute = new Wind();
        flute.play(Note.MIDDLE_C);

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        for (Integer i : a) {
            System.out.println(i);
        }
    }
}
