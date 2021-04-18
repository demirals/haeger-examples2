package de.haegerconsulting.controllers;

import de.haegerconsulting.entities.Patient;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/patients")
public class ManagementPatientController {

    public static final List<Patient> PATIENTS = Arrays.asList(

            new Patient(1, "Tom"),
            new Patient(2, "Linda"),
            new Patient(3, "Paul")
    );

    @GetMapping
            //   @PreAuthorize("hasAnyRole('ROLE_ARZT', 'ROLE_KW')")
    public List<Patient> getAllPatients(){
        System.out.println("Liste von Patiente");
        return PATIENTS;
    }

    @PostMapping
  //  @PreAuthorize("hasAuthority('patient: schreiben')")
    public void registerPatient(@RequestBody Patient patient){
        System.out.println(patient);
    }

    @PutMapping("{patientId}")
  //  @PreAuthorize("hasAuthority('patient: schreiben')")
    public void updatePatient(@PathVariable("patientId") Integer patientId, @RequestBody Patient patient){
        System.out.println(String.format("$s %s", patientId, patient));
    }

    @DeleteMapping("{patientId}")
  //  @PreAuthorize("hasAuthority('patient: schreiben')")
    public void deletePatient(@PathVariable("patientId") Integer patientId){
        System.out.println(patientId);
    }
}
