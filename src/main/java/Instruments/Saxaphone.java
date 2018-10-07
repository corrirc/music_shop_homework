package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Saxaphone extends Instrument implements IPlay, ISell {

    public Saxaphone(InstrumentFamily instrumentFamily, String name, double price, double markup){
        super(instrumentFamily, name, price, markup);
    }

    public String play() {
        return "saxanoise";
    }


    public double calculateMarkup() {
        return 0;
    }
}
