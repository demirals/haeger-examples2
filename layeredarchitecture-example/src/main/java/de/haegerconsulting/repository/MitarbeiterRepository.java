package de.haegerconsulting.repository;

import de.haegerconsulting.model.Mitarbeiter;

import java.util.List;

/**
 *
 * Provides Mitarbeiter-specific db access functionality. Dummy, no real db-connection is established
 *
 */
public interface MitarbeiterRepository extends CrudRepository {

    public Mitarbeiter findByMitarbeiterNummer(String mitarbeiterNummer);

    public List<Mitarbeiter> findMitarbeiterByAbteilung(String abteilung);

}
