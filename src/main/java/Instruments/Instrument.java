package Instruments;

import Interfaces.IPlay;

public abstract class Instrument implements IPlay {

        private InstrumentFamily instrumentFamily;
        private String name;
        private double price;
        private double markup;


    public Instrument(InstrumentFamily instrumentFamily, String name, double price, double markup) {
        this.instrumentFamily = instrumentFamily;
        this.name = name;
        this.price = price;
        this.markup = markup;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getInstrumentFamily() {
        return instrumentFamily.getFamily();
    }

    public double getMarkup(){
        return markup;
    }
}
