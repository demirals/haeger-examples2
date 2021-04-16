package de.haegerconsulting.service;

import de.haegerconsulting.model.Laufkunde;
import de.haegerconsulting.repository.LaufkundeRepository;

public class LaufkundeService {

    private LaufkundeRepository laufkundeRepository;

    /**
     *
     * Validating Laufkunde-Instance. Could be placed in own validator class
     *
     * @param laufkunde
     * @return true when laufkunde and its attributes are not null
     */
    private boolean validateLaufkunde(Laufkunde laufkunde){
        return (laufkunde != null
                && laufkunde.getVorname() != null
                && laufkunde.getNachname() != null);
    }

    public void addLaufKunde(Laufkunde laufkunde){
        if(validateLaufkunde(laufkunde)){
            laufkundeRepository.save(laufkunde);
        } else {
            // hier könnte man irgendwas machen...
        }
    }

    public Laufkunde getLaufkundeById(int laufKundeId){
        return (Laufkunde) laufkundeRepository.getById(laufKundeId);
    }


    /*+

    ...

     */




}
