package es.olidroide.genericsexamples.model;

public class ElectricGuitar extends Guitar {
    private int voltage;

    @Override
    public String getName() {
        return "Electric " + super.getName();
    }
}
