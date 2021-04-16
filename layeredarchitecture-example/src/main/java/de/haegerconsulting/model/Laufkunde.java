package de.haegerconsulting.model;

public class Laufkunde extends Person{

    private int kundenNummer;

    public Laufkunde(int id, String vorname, String nachname, int kundenNummer) {
        super(id, vorname, nachname);
        this.kundenNummer = kundenNummer;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(int kundenNummer) {
        this.kundenNummer = kundenNummer;
    }
}
