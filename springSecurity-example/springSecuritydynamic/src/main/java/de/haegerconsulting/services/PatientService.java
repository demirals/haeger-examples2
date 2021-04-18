package de.haegerconsulting.services;

import de.haegerconsulting.entities.Patient;
import de.haegerconsulting.exceptions.ResourceNotFoundException;
import de.haegerconsulting.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // POST PATIENT
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }

    // GET PATIENT
    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }
    public Patient getPatientById(int id){
        return patientRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No patient the id : " + id)
        );
    }
    public Patient getPatientByPatientName(String patientName){
        return patientRepository.findByPatientName(patientName);
    }


    // DELETE PATIENT
    public String deletePatient (int id){
        patientRepository.deleteById(id);
        return "Patient with the id " + id + " removed";
    }

    // UPDATE PATIENT
    public Patient updatePatient(Patient patient, int id){
        Patient existingPatient = patientRepository.findAllById(id);

        existingPatient.setPatientName(patient.getPatientName());

        return patientRepository.save(existingPatient);
    }
}
