package de.haegerconsulting.model;

public class Mitarbeiter extends Person{

    private String mitarbeiterNummer;
    private String abteilung;

    public Mitarbeiter(int id, String vorname, String nachname, String mitarbeiterNummer, String abteilung) {
        super(id, vorname, nachname);
        this.mitarbeiterNummer = mitarbeiterNummer;
        this.abteilung = abteilung;
    }

    public String getMitarbeiterNummer() {
        return mitarbeiterNummer;
    }

    public void setMitarbeiterNummer(String mitarbeiterNummer) {
        this.mitarbeiterNummer = mitarbeiterNummer;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
}
