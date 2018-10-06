package Instruments;

public enum InstrumentFamily {

    BRASS("Brass"),
    STRINGS("Strings"),
    PERCUSSION("Percussion");

    private String family;

    InstrumentFamily(String family) {
        this.family = family;
    }


    public String getFamily() {
        return family;
    }

}
