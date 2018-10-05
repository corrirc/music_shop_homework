package Instruments;

import Interfaces.IPlay;

public class Saxaphone extends Instrument implements IPlay {

    public Saxaphone(InstrumentFamily instrumentFamily, String name, double price, double markup){
        super(instrumentFamily, name, price, markup);
    }

    public String play() {
        return "saxanoise";
    }


}
