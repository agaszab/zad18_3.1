package pl.javastart.zad18;

public enum Kategorie {

    SPOZYWCZE ("SPOZYWCZE"),
    DOMOWE ("DOMOWE"),
    INNE ("INNE");

    private String name;

    Kategorie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
