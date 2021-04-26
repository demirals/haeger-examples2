package de.haegerconsulting.concepts.objects;

public class App {

    public static void main(String[] args) {
        /**
         *
         * Objects
         *
         */

        //1. Erzeugen eines Objekts mit Default-Konstruktor
        Vehicle vehicleInstanceByDefaultConstructor = new Vehicle();
        //Hinweis: Attribut vehicleName wird nicht gesetzt, folgende Ausgabe (mit Aufruf
        // des Getters "getVehicleName" führt daher zu "null":
        System.out.println(vehicleInstanceByDefaultConstructor.getVehicleName());
        //Das Attribut vehicleName kann nachträglich jedoch geändert werden:
        vehicleInstanceByDefaultConstructor.setVehicleName("Tolles Vehikel");
        System.out.println(vehicleInstanceByDefaultConstructor.getVehicleName());

        //2. Erzeugen eines Objects mit Argument-behaftetem Konstruktor
        Vehicle vehicleInstanceByArgumentsConstructor = new Vehicle("Richtig tolles Vehikel");
        System.out.println(vehicleInstanceByArgumentsConstructor.getVehicleName());
        //Das Attribut vehicleName kann nachträglich jedoch geändert werden:
        vehicleInstanceByArgumentsConstructor.setVehicleName("Das allertollste Vehikel");
        System.out.println(vehicleInstanceByArgumentsConstructor.getVehicleName());

        Vehicle vehicle = new Vehicle("new vehicle");
        //3. Erzeugen einer Instanz von VehicleService
        VehicleService vehicleService = new VehicleService();
        //Aufrufen der methode doSomethingWithVehicle
        vehicleService.doSomethingWithVehicle(vehicle);
        //Aufruf der static-method doSomethingStaticWithVehicle nicht möglich über Instanz:
        // vehicleService.doSomethingStaticWithVehicle(vehicle);
        //Fehler:
        // Static member 'de.haegerconsulting.concepts.objects.VehicleService.doSomethingStaticWithVehicle(de.haegerconsulting.concepts.objects.Vehicle)'
        // accessed via instance reference
        //Aufruf möglich direkt über Klasse
        VehicleService.doSomethingStaticWithVehicle(vehicle);
        //Statische Methoden/Funktionen werden auch Klassenoperationen genannt - Eine Klassenoperation ist eine Operation, die
        //der jeweiligen Klasse zugeordnet ist und nicht auf ein einzelnes Objekt der Klasse angewendet werden kann.

    }
}
