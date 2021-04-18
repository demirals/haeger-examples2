package de.haegerconsulting.entities;

public class Rezept {

    private final Integer rezeptId;
    private final String verschreibung;


    public Rezept(Integer rezeptId, String verschreibung) {
        this.rezeptId = rezeptId;
        this.verschreibung = verschreibung;

    }

    @Override
    public String toString() {
        return "rezept{" +
                "rezeptId=" + rezeptId +
                ", verschreibung='" + verschreibung + '\'' +
                '}';
    }

    public Integer getRezeptId() {
        return rezeptId;
    }

    public String GetVerschreibung() {
        return verschreibung;
    }

}
