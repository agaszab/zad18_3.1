package pl.javastart.zad18;

public enum Kategorie {

    SPOZYWCZE ("Art. spożywcze"),
    DOMOWE ("Art. gosp. domowego"),
    INNE ("Inne");

    private String name;

    Kategorie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
