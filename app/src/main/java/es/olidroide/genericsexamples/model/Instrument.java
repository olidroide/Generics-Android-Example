package es.olidroide.genericsexamples.model;

public abstract class Instrument<T> {
    private String note;
    private T instrument;

    protected void setInstrument(T instrument) {
        this.instrument = instrument;
    }

    public T getInstrument() {
        return instrument;
    }

    public abstract String getName();

    public void play() {
        //Play a note
    }

    public static String getTone(? ){

    }
}
