package de.haegerconsulting.repository;

import de.haegerconsulting.model.Person;

import java.util.List;

/**
 *
 * Dummy for providing basic CRUD-functions (no db-connection is established)
 *
 */
public interface CrudRepository {

    public void save(Person person);
    public void remove(Person person);
    public Person getById(int id);
    public List<Person> findAll();

}
