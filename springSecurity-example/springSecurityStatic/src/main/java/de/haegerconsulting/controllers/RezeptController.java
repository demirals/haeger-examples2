package de.haegerconsulting.controllers;

import de.haegerconsulting.entities.Rezept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/rezepts")
public class RezeptController {

    public static final List<Rezept>REZEPTS = Arrays.asList(
            new Rezept(1, "Paracetamol"),
            new Rezept(2, "Wasser"),
            new Rezept(3, "Ibu Profen")
    );

    @GetMapping(path = "/{rezeptId}")
    public Rezept getRezept(@PathVariable("rezeptId") Integer rezeptId){
        return REZEPTS.stream()
                .filter(rezept -> rezeptId.equals(rezept.getRezeptId()))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Rezept mit der ID :" + rezeptId + " existiert nicht"));
    }
}
