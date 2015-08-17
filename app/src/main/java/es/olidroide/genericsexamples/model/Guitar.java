package es.olidroide.genericsexamples.model;

public class Guitar extends StringInstrument<Guitar> {

    public static final int STRINGS = 6;

    public Guitar() {
        super(STRINGS);
    }

    @Override
    public String getName() {
        return "Guitar";
    }

   public void playChord(String chord){

   }
}
