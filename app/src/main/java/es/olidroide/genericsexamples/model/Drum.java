package es.olidroide.genericsexamples.model;

public class Drum extends Instrument<Drum> {

    public Drum() {
        setInstrument(this);
    }

    @Override
    public String getName() {
        return "Drum";
    }
}
