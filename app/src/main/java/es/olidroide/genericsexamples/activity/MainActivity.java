package es.olidroide.genericsexamples.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import es.olidroide.genericsexamples.R;
import es.olidroide.genericsexamples.model.Bass;
import es.olidroide.genericsexamples.model.Drum;
import es.olidroide.genericsexamples.model.ElectricGuitar;
import es.olidroide.genericsexamples.model.Guitar;
import es.olidroide.genericsexamples.model.Instrument;
import es.olidroide.genericsexamples.model.StringInstrument;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        firstPrinciple();

        useGenericsWithInstruments();

        compareGenerics();
    }

    private void firstPrinciple() {
        StringInstrument<Guitar> guitarGeneric = new Guitar();
        Log.i(getClass().getName(), "I am a "+guitarGeneric.getName()+" Using generics type");

        //This not allowed because guitar is a subtype Guitar
        //guitarGeneric = new Bass();

        //We can't cast
        //Bass bass = (Bass) new StringInstrument<Bass>(Bass.STRINGS);
    }

    private void useGenericsWithInstruments() {
        Guitar guitar = new Guitar();
        ElectricGuitar electricGuitar = new ElectricGuitar();
        Instrument drum = new Drum();

        StringInstrument stringInstrument = guitar;

        Log.i(getClass().getName(), "String instrument name: " + stringInstrument.getName() +
                " and I have " + stringInstrument.getNumberOfStrings() + " Strings");

        stringInstrument = electricGuitar;

        Log.i(getClass().getName(), "String instrument change to name: " + stringInstrument.getName() +
                " and I have " + stringInstrument.getNumberOfStrings() + " Strings");

        Instrument instrument = drum;

        Log.i(getClass().getName(), "instrument: " + instrument.getName());

        instrument = guitar;

        Log.i(getClass().getName(), "instrument change to: " + instrument.getName());

        instrument = electricGuitar;

        Log.i(getClass().getName(), "instrument change again to: " + instrument.getName());
    }

    private void compareGenerics() {
        StringInstrument stringInstrumentOne = new Guitar();
        StringInstrument stringInstrumentTwo = new ElectricGuitar();

        boolean isSameInstruments = stringInstrumentOne.equals(stringInstrumentTwo);

        Log.i(getClass().getName(), "Instrument One is the same than two? " + isSameInstruments);

        stringInstrumentTwo = stringInstrumentOne;

        isSameInstruments = stringInstrumentOne.equals(stringInstrumentTwo);

        Log.i(getClass().getName(), "and Now? " + isSameInstruments);
    }
}
