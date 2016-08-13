package polymorphism.music;

public class Music {

    public static void main(String[] args) {
        Instrument flute = new Wind();
        flute.play(Note.MIDDLE_C);
    }
}
