package Instruments;

import Interfaces.IPlay;

public abstract class Instrument implements IPlay {

        private InstrumentFamily instrumentFamily;
        private String name;
        private double price;


    public Instrument(InstrumentFamily instrumentFamily, String name, double price) {
        this.instrumentFamily = instrumentFamily;
        this.name = name;
        this.price = price;

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
}
