package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    public Guitar(InstrumentFamily instrumentFamily, String name, double price, double markup){
        super(instrumentFamily, name, price, markup);
    }

    public String play() {
        return "guitarnoise";
    }

}
