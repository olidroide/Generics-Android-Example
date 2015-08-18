package es.olidroide.genericsexamples.model;


public class Bass extends StringInstrument<Bass> {
  public static final int STRINGS = 4;

  public Bass() {
    super(STRINGS);
  }
}
