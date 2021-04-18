package de.haegerconsulting.controllers;

import de.haegerconsulting.entities.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/patients")
public class PatientController {

    public static final List<Patient>PATIENTS = Arrays.asList(

        new Patient(1, "Tom"),
        new Patient(2, "Linda"),
        new Patient(3, "Paul")
    );

    @GetMapping(path = "/{patientId}")
    public Patient getPatient(@PathVariable("patientId") Integer patientId){
        return PATIENTS.stream()
                .filter(patient -> patientId.equals(patient.getPatientId()))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Patient mit der ID :" + patientId + " existiert nicht"));
    }
}
