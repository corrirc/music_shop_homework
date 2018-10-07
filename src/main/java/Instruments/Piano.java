package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    public Piano(InstrumentFamily instrumentFamily, String name, double price, double markup) {
        super(instrumentFamily, name, price, markup);
    }

    public String play() {
        return "pianonoise";
    }


    public double calculateMarkup() {
        return 0;
    }
}
