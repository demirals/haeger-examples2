package de.haegerconsulting;

import de.haegerconsulting.model.Laufkunde;
import de.haegerconsulting.service.LaufkundeService;

public class App {

    public static void main(String[] args){
        LaufkundeService laufkundeService = new LaufkundeService();
        Laufkunde laufkunde = new Laufkunde(1, "Ralf", "Haeger", 1864);
        laufkundeService.addLaufKunde(laufkunde);
        /**
         * ....
         */
    }

}
