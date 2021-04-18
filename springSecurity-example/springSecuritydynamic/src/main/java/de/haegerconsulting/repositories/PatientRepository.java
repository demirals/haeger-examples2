package de.haegerconsulting.repositories;

import de.haegerconsulting.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("SELECT u FROM Patient u WHERE u.patientName = :patientName")
    Patient findByPatientName(@Param("patientName") String patientName);

    Patient findAllById(int id);
    Optional<Patient> findById(Integer Id);
}
