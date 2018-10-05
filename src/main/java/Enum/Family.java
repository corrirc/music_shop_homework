package Enum;

public enum Family {

    BRASS("Brass"),
    STRINGS("Strings"),
    PERCUSSION("percussion");

    private String family;

    Family(String family) {
        this.family = family;
    }


    public String getFamily() {
        return family;
    }

}
