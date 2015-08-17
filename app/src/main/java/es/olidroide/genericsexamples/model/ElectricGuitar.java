package es.olidroide.genericsexamples.model;

public class ElectricGuitar extends Guitar {

    @Override
    public String getName() {
        return "Electric " + super.getName();
    }
}
