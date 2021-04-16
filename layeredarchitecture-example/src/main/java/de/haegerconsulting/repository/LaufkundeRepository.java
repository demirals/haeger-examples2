package de.haegerconsulting.repository;

import de.haegerconsulting.model.Laufkunde;

/**
 *
 * Provides Laufkunde-specific db access functionality. Dummy, no real db-connection is established
 *
 */
public interface LaufkundeRepository extends CrudRepository{

    public Laufkunde findByKundenNummer(int kundennummer);

}
