package de.haegerconsulting.concepts.objects;

/**
 *
 * Eine Klasse definiert für ein Objekt eine Struktur(Attribute), Verhalten(Operationen) und
 * Beziehungen. Sie besitzt einen Mechanismus, um neue Objekte zu erzeugen (Konstruktor(en)).
 * Jedes erzeugte Objekt gehört zu genau einer Klasse
 *
 * In diesem Beispiel gehört "vehicleName" zu den Attributen der Klasse,
 * der getter und der setter gehören zum Verhalten (Operationen) der Klasse.
 * Beziehungen sind in diesem Beispiel nicht beschrieben.
 *
 */
public class Vehicle {

    /**
     * vehicleName ist ein Attribut der Klasse Verhicle und bestimmt den Namen des
     * konkreten Verhicle-Objekts
     */
    private String vehicleName;

    /**
     * Konstruktor ohne Parameter. Ist normalerweise implizit durch Klasse Object ererbt (siehe Beispiele Inheritence)
     */
    public Vehicle(){

    }

    /**
     *
     * Konstruktor mit Parameter vehicleName. Damit wird bei Erzeugung eines Objekts auch sofort
     * das Attribut vehicleName initialisiert bzw. mit einem Wert versehen.
     *
     * @param verhicleName
     */
    public Vehicle(String verhicleName){
        //"this." deutet auf konkret das Attribut des erzeugten Objekts
        this.vehicleName = verhicleName;
    }


    //Getter/setter

    /**
     *
     * Sog. "getter"-Funktionen liefern den aktuellen Zustand eines Attributs zurück
     *
     * @return vehicleName
     */
    public String getVehicleName() {
        return vehicleName;
    }


    /**
     *
     *
     * Sog. "setter"-Methoden ermöglichen das Ändern des Zustands eines Attributs
     *
     * @param vehicleName
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }


}
