package Instruments;

public enum InstrumentFamily {

    BRASS("Brass"),
    STRINGS("Strings"),
    PERCUSSION("percussion");

    private String family;

    InstrumentFamily(String family) {
        this.family = family;
    }


    public String getFamily() {
        return family;
    }

}
