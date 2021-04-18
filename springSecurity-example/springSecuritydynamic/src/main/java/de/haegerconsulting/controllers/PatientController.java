package de.haegerconsulting.controllers;

import de.haegerconsulting.entities.Patient;
import de.haegerconsulting.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // POST MAPPING

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }


    // GET MAPPING

    @GetMapping
    public List<Patient> findAllPatients(){
        return patientService.getPatients();
    }

    @GetMapping("{patientName}")
    public Patient findPatientByPatientName(@PathVariable String patientName){
        return patientService.getPatientByPatientName(patientName);
    }


    // PUT MAPPING


    @PutMapping("{id}")
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable int id){
        return patientService.updatePatient(patient, id);
    }


    // DELETE MAPPING

    @DeleteMapping("{id}")
    public String deletePatient (@PathVariable int id){
        return patientService.deletePatient(id);
    }

}
