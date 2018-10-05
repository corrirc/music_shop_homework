package Instruments;

import Interfaces.IPlay;

public class Saxaphone extends Instrument implements IPlay {

    public Saxaphone(InstrumentFamily instrumentFamily, String name, double price){
        super(instrumentFamily, name, price);
    }

    public String play() {
        return "saxanoise";
    }


}
