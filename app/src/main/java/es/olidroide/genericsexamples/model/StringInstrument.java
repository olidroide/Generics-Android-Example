package es.olidroide.genericsexamples.model;


public class StringInstrument<T extends StringInstrument> extends Instrument<StringInstrument> {
    public final int strings;

    public StringInstrument(int strings){
        this.strings = strings;
        setInstrument(this);
    }

    public int getNumberOfStrings(){
        return strings;
    }

    @Override
    public String getName() {
        return getInstrument().getName();
    }
}
